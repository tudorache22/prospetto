package it.exolab.prospetto.controller;


import it.exolab.prospetto.converter.DtoConverter;
import it.exolab.prospetto.dto.ProspettoDTO;
import it.exolab.prospetto.enums.ColonnaRiferimento;
import it.exolab.prospetto.mapper.ProspettoMapper;
import it.exolab.prospetto.mapper.ProspettoMapperImplem;
import it.exolab.prospetto.models.CriterioRicerca;
import it.exolab.prospetto.models.GiacenzaCriterio;
import it.exolab.prospetto.models.Prospetto;


import javax.ejb.LocalBean;
import javax.ejb.Stateless;
import java.util.List;

@Stateless
@LocalBean
public class ProspettoController implements ProspettoControllerInterface{

    /*Primo caso:
    Calcolo diretto del prospetto
     */

    public Prospetto calcolaProspetto(CriterioRicerca criterio){
        Prospetto prospetto=null;
        ManageTotaleCampo manageTotale= new ManageTotaleCampo();
        ManageDataRimanenza manageDataRimanenza= new ManageDataRimanenza();
        DtoConverter converter=new DtoConverter();

        ProspettoMapper mapper= new ProspettoMapperImplem();
        criterio.setListaGiacenze(mapper.getGiacenze(criterio));
        addExtraGiacenze(criterio.getListaGiacenze());
        manageGiacenze(criterio.getListaGiacenze());
        ProspettoDTO dto= mapper.calcolaProspetto(criterio);

        try {
            manageTotale.setCampoTot(dto);
            manageTotale.setTotaleCarico(dto);
            manageTotale.setTotaleScarico(dto);
            dto.setDataRimanenza(manageDataRimanenza.calcolaDataRimanenza(criterio));

            prospetto=converter.convertToProspetto(dto);

        } catch (Exception e) {
            e.printStackTrace();
        }
        return prospetto;
    }

    /*
    Secondo caso:
    Calcolo del prospetto campo per campo, viene ricavata ogni riga del prospetto
     */
    public Prospetto calcolaProspetto2(CriterioRicerca criterio){
        Prospetto prospetto=null;
        ManageTotaleCampo manageTotale= new ManageTotaleCampo();
        ManageDataRimanenza manageDataRimanenza= new ManageDataRimanenza();
        DtoConverter converter=new DtoConverter();

        ProspettoMapper mapper= new ProspettoMapperImplem();
        criterio.setListaGiacenze(mapper.getGiacenze(criterio));
        addExtraGiacenze(criterio.getListaGiacenze());
        manageGiacenze(criterio.getListaGiacenze());

        ProspettoDTO dto= new ProspettoDTO();
        dto.setRimanenza(mapper.calcolaRimanenza(criterio));
        dto.setIntrodotto(mapper.calcolaIntrodotto(criterio));
        dto.setEccedenzeAnnotate1(mapper.calcolaEccedenze1(criterio));
        dto.setEccedenzeAnnotate2(mapper.calcolaEccedenze2(criterio));
        dto.setEccedenzeAnnotate3(mapper.calcolaEccedenze3(criterio));
        dto.setEccedenzeAnnotate4(mapper.calcolaEccedenze4(criterio));
        dto.setErogato(mapper.calcolaErogato(criterio));
        dto.setCaliAnnotati1(mapper.calcolaCaliAnnotati1(criterio));
        dto.setCaliAnnotati2(mapper.calcolaCaliAnnotati2(criterio));
        dto.setCaliAnnotati3(mapper.calcolaCaliAnnotati3(criterio));
        dto.setCaliAnnotati4(mapper.calcolaCaliAnnotati4(criterio));
        dto.setRimanenzaContabile(mapper.calcolaRimanenzaContabile(criterio));


        try {
            manageTotale.setCampoTot(dto);
            manageTotale.setTotaleCarico(dto);
            manageTotale.setTotaleScarico(dto);
            dto.setDataRimanenza(manageDataRimanenza.calcolaDataRimanenza(criterio));
            prospetto=converter.convertToProspetto(dto);

        } catch (Exception e) {
            e.printStackTrace();
        }
        return prospetto;

    }

    public void manageGiacenze(List<GiacenzaCriterio> giacenze){

        int benzinaContatore=0;
        int gasolioContatore=0;
        for(GiacenzaCriterio giacenza:giacenze){
            if(giacenza.getTipoGiacenza().equals("B") && giacenza.getGiacenza().equals("GB01")){
                giacenza.setColonnaRiferimento(ColonnaRiferimento.BENZINA_ALTRO);
            } else if (giacenza.getTipoGiacenza().equals("D") && giacenza.getGiacenza().equals("GD01")) {
                giacenza.setColonnaRiferimento(ColonnaRiferimento.GASOLIO_ALTRO);
            } else if (giacenza.getTipoGiacenza().equals("G")) {
                giacenza.setColonnaRiferimento(ColonnaRiferimento.GPL);
            } else if (giacenza.getTipoGiacenza().equals("O")) {
                giacenza.setColonnaRiferimento(ColonnaRiferimento.OLIO_LUBRIFICANTE);
            } else if ((giacenza.getTipoGiacenza().equals("B") && benzinaContatore == 0 && !giacenza.getGiacenza().equals("GB01"))) {
                giacenza.setColonnaRiferimento(ColonnaRiferimento.BENZINA_1);
                benzinaContatore++;
            } else if ((giacenza.getTipoGiacenza().equals("B") && benzinaContatore == 1 && !giacenza.getGiacenza().equals("GB01"))) {
                giacenza.setColonnaRiferimento(ColonnaRiferimento.BENZINA_2);
                benzinaContatore++;
            } else if ((giacenza.getTipoGiacenza().equals("B") && benzinaContatore == 2 && !giacenza.getGiacenza().equals("GB01"))) {
                giacenza.setColonnaRiferimento(ColonnaRiferimento.BENZINA_3);
                benzinaContatore++;
            } else if ((giacenza.getTipoGiacenza().equals("B") && benzinaContatore == 3 && !giacenza.getGiacenza().equals("GB01"))) {
                giacenza.setColonnaRiferimento(ColonnaRiferimento.BENZINA_4);
                benzinaContatore++;
            } else if ((giacenza.getTipoGiacenza().equals("B") && benzinaContatore == 4 && !giacenza.getGiacenza().equals("GB01"))) {
                giacenza.setColonnaRiferimento(ColonnaRiferimento.BENZINA_5);
                benzinaContatore++;
            } else if (giacenza.getTipoGiacenza().equals("D") && gasolioContatore == 0 && !giacenza.getGiacenza().equals("GD01")) {
                giacenza.setColonnaRiferimento(ColonnaRiferimento.GASOLIO_1);
                gasolioContatore++;
            } else if (giacenza.getTipoGiacenza().equals("D") && gasolioContatore == 1 && !giacenza.getGiacenza().equals("GD01")) {
                giacenza.setColonnaRiferimento(ColonnaRiferimento.GASOLIO_2);
                gasolioContatore++;
            } else if (giacenza.getTipoGiacenza().equals("D") && gasolioContatore == 2 && !giacenza.getGiacenza().equals("GD01")) {
                giacenza.setColonnaRiferimento(ColonnaRiferimento.GASOLIO_3);
                gasolioContatore++;
            } else if (giacenza.getTipoGiacenza().equals("D") && gasolioContatore == 3 && !giacenza.getGiacenza().equals("GD01")) {
                giacenza.setColonnaRiferimento(ColonnaRiferimento.GASOLIO_4);
                gasolioContatore++;
            } else if (giacenza.getTipoGiacenza().equals("D") && gasolioContatore == 4 && !giacenza.getGiacenza().equals("GD01")) {
                giacenza.setColonnaRiferimento(ColonnaRiferimento.GASOLIO_5);
                gasolioContatore++;
            }

        }
    }

    public void addExtraGiacenze(List<GiacenzaCriterio> giacenze){
        GiacenzaCriterio giacenzaBenzina = new GiacenzaCriterio();
        giacenzaBenzina.setTipoGiacenza("B");
        giacenzaBenzina.setGiacenza("GB01");
        giacenze.add(giacenzaBenzina);

        GiacenzaCriterio giacenzaGasolio = new GiacenzaCriterio();
        giacenzaGasolio.setTipoGiacenza("D");
        giacenzaGasolio.setGiacenza("GD01");
        giacenze.add(giacenzaGasolio);

        GiacenzaCriterio giacenzaGpl = new GiacenzaCriterio();
        giacenzaGpl.setTipoGiacenza("G");
        giacenzaGpl.setGiacenza("GG01");
        giacenze.add(giacenzaGpl);

        GiacenzaCriterio giacenzaOlio = new GiacenzaCriterio();
        giacenzaOlio.setTipoGiacenza("O");
        giacenzaOlio.setGiacenza("GO01");
        giacenze.add(giacenzaOlio);
    }
}

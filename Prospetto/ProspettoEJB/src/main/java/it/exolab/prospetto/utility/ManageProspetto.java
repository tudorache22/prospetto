package it.exolab.prospetto.utility;

import it.exolab.prospetto.common.ResultColumn;
import it.exolab.prospetto.dto.CriterioRicerca;
import it.exolab.prospetto.dto.GiacenzaDTO;
import it.exolab.prospetto.dto.VerificaDittaDTO;
import it.exolab.prospetto.mapper.ProspettoMapper;
import it.exolab.prospetto.mapper.ProspettoMapperImpl;
import it.exolab.prospetto.models.DatiComuni;
import it.exolab.prospetto.models.Giacenza;
import it.exolab.prospetto.models.Prospetto;

import java.util.ArrayList;
import java.util.List;

public class ManageProspetto {

    private ProspettoMapper mapper;
    private ManageCampiProspetto manageCampiProspetto;
    private ManageConverter manageConverter;

    public ManageProspetto(){
        mapper=new ProspettoMapperImpl();
        manageCampiProspetto= new ManageCampiProspetto();
        manageConverter= new ManageConverter();
    }

    public Prospetto calcolaProspetto(DatiComuni datiComuni, VerificaDittaDTO ditta) throws Exception {
        Prospetto prospetto= new Prospetto();
        CriterioRicerca criterioRicerca= new CriterioRicerca();
        criterioRicerca.setPiva(datiComuni.getPiva());
        criterioRicerca.setCodiceAccisa(ditta.getCodiceDitta());
        criterioRicerca.setAnno(Integer.valueOf(datiComuni.getAnno()));

        prospetto.setCodiceDitta(ditta.getCodiceDitta());
        prospetto.setGiacenze(calcolaGiacenze(criterioRicerca));

        //controllo per stato ditta
        prospetto.setStato("");

        return prospetto;
    }


    public List<Giacenza> calcolaGiacenze(CriterioRicerca criterio) throws Exception {
        List<Giacenza> listaGiacenze= new ArrayList<>();

        List<GiacenzaDTO>giacenzeList= mapper.getGiacenze(criterio.getCodiceAccisa());
        List<CriterioRicerca>dataRimanenzaList= mapper.calcolaDataRimanenza(giacenzeList);
            for (CriterioRicerca criterioGiacenza:dataRimanenzaList) {
                criterioGiacenza.setDataRiferimento(manageCampiProspetto.calcolaDataRimanenza(criterio.getDataGiacenzaIniziale()));
            }

        List<ResultColumn> resultColumns= mapper.calcolaProspetto(dataRimanenzaList);
            for (ResultColumn colonna: resultColumns){
                colonna.setTotaleCarico(manageCampiProspetto.calcolaTotaleCarico(colonna));
                colonna.setTotaleScarico(manageCampiProspetto.calcolaTotaleScarico(colonna));
                colonna.setDataRimanenza(manageCampiProspetto.controllDataRimanenza(colonna));

                //Crezione oggetto giacenza del prospetto
                Giacenza giacenza= new Giacenza();
                giacenza.setIdGiacenza(colonna.getIdGiacenza());
                giacenza.setTipoGiacenza(colonna.getTipoGiacenza());
                giacenza.setDescrizione(colonna.getDescrizioneGiacenza());

                giacenza.setDatiProspetto(manageConverter.convertToDatiProspetto(colonna));
                listaGiacenze.add(giacenza);
            }

        return listaGiacenze;
    }
}

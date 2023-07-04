package converter;

import bean.*;
import dto.ProspettoDTO;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class DtoConverter {

    public Prospetto convertToProspetto(ProspettoDTO dto) throws InvocationTargetException, NoSuchMethodException, IllegalAccessException {
        Prospetto prospetto= new Prospetto();
        setCampi(dto,prospetto,"Rimanenza");
        setCampi(dto,prospetto,"Introdotto");
        setCampi(dto,prospetto,"EccedenzeAnnotate1");
        setCampi(dto,prospetto,"EccedenzeAnnotate2");
        setCampi(dto,prospetto,"EccedenzeAnnotate3");
        setCampi(dto,prospetto,"EccedenzeAnnotate4");
        setCampi(dto,prospetto,"Erogato");
        setCampi(dto,prospetto,"CaliAnnotati1");
        setCampi(dto,prospetto,"CaliAnnotati2");
        setCampi(dto,prospetto,"CaliAnnotati3");
        setCampi(dto,prospetto,"CaliAnnotati4");
        setCampi(dto,prospetto,"RimanenzaContabile");

        return prospetto;
    }

    private void setCampi(ProspettoDTO dto, Prospetto prospetto, String riga) throws NoSuchMethodException, InvocationTargetException, IllegalAccessException {
        String metodoGet="get"+riga;
        Method getCampoProspetto= prospetto.getClass().getMethod(metodoGet);
        Method getCampoDto=prospetto.getClass().getMethod(metodoGet);
        RigaProspetto campo= (RigaProspetto) getCampoProspetto.invoke(prospetto);
        ResultBean campoDto= (ResultBean) getCampoDto.invoke(dto);
        setSingoloCampo(campo,campoDto);
    }

    private void setSingoloCampo(RigaProspetto prospetto,ResultBean dto){
        Benzina benzina= new Benzina();
        benzina.setBenzina1(dto.getRisultatoBenzina1());
        benzina.setBenzina2(dto.getRisultatoBenzina2());
        benzina.setBenzina3(dto.getRisultatoBenzina3());
        benzina.setBenzina4(dto.getRisultatoBenzina4());
        benzina.setBenzina5(dto.getRisultatoBenzina5());
        benzina.setBenzinzaAltro(dto.getRisultatoBenzinaAltro());
        benzina.setBenzinaTot(dto.getRisultatoBenzinaTot());

        Gasolio gasolio= new Gasolio();
        gasolio.setGasolio1(dto.getRisultatoGasolio1());
        gasolio.setGasolio2(dto.getRisultatoGasolio2());
        gasolio.setGasolio3(dto.getRisultatoGasolio3());
        gasolio.setGasolio4(dto.getRisultatoGasolio4());
        gasolio.setGasolio5(dto.getRisultatoGasolio5());
        gasolio.setGasolioAltro(dto.getRisultatoGasolioAltro());
        gasolio.setGasolioTot(dto.getRisultatoGasolioTot());

        OliLubrificanti olio= new OliLubrificanti();
        olio.setOlio(dto.getRisultatoOlio());

        Gpl gpl= new Gpl();
        gpl.setGpl(dto.getRisultatoGpl());

        prospetto.setBenzina(benzina);
        prospetto.setGasolio(gasolio);
        prospetto.setGpl(gpl);
        prospetto.setOlioLubrificante(olio);
    }


}

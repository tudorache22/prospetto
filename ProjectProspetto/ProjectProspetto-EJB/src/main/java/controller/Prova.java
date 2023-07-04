package controller;

import bean.Prospetto;
import bean.ResultBean;
import converter.DtoConverter;
import dto.ProspettoDTO;

public class Prova {
    public static void main(String [] args){
        ProspettoDTO dto= new ProspettoDTO();

        ResultBean riga= new ResultBean();

        riga.setRisultatoBenzina1(0d);
        riga.setRisultatoBenzina2(1d);
        riga.setRisultatoBenzina1(2d);
        riga.setRisultatoBenzina2(3d);
        riga.setRisultatoBenzina5(4d);
        riga.setRisultatoBenzinaAltro(5d);
        riga.setRisultatoGasolio1(6d);
        riga.setRisultatoGasolio2(7d);
        riga.setRisultatoGasolio3(8d);
        riga.setRisultatoGasolio4(9d);
        riga.setRisultatoGasolio5(10d);
        riga.setRisultatoGasolioAltro(11d);

        dto.setRimanenza(riga);
        riga= new ResultBean();

        riga.setRisultatoBenzina1(0d);
        riga.setRisultatoBenzina2(1d);
        riga.setRisultatoBenzina1(2d);
        riga.setRisultatoBenzina2(3d);
        riga.setRisultatoBenzina5(4d);
        riga.setRisultatoBenzinaAltro(5d);
        riga.setRisultatoGasolio1(6d);
        riga.setRisultatoGasolio2(7d);
        riga.setRisultatoGasolio3(8d);
        riga.setRisultatoGasolio4(9d);
        riga.setRisultatoGasolio5(10d);
        riga.setRisultatoGasolioAltro(11d);
        dto.setIntrodotto(riga);

        riga= new ResultBean();
        riga.setRisultatoBenzina1(0d);
        riga.setRisultatoBenzina2(1d);
        riga.setRisultatoBenzina1(2d);
        riga.setRisultatoBenzina2(3d);
        riga.setRisultatoBenzina5(4d);
        riga.setRisultatoBenzinaAltro(5d);
        riga.setRisultatoGasolio1(6d);
        riga.setRisultatoGasolio2(7d);
        riga.setRisultatoGasolio3(8d);
        riga.setRisultatoGasolio4(9d);
        riga.setRisultatoGasolio5(10d);
        riga.setRisultatoGasolioAltro(11d);
        dto.setEccedenzeAnnotate1(riga);

        riga= new ResultBean();
        riga.setRisultatoBenzina1(0d);
        riga.setRisultatoBenzina2(1d);
        riga.setRisultatoBenzina1(2d);
        riga.setRisultatoBenzina2(3d);
        riga.setRisultatoBenzina5(4d);
        riga.setRisultatoBenzinaAltro(5d);
        riga.setRisultatoGasolio1(6d);
        riga.setRisultatoGasolio2(7d);
        riga.setRisultatoGasolio3(8d);
        riga.setRisultatoGasolio4(9d);
        riga.setRisultatoGasolio5(10d);
        riga.setRisultatoGasolioAltro(11d);
        dto.setEccedenzeAnnotate2(riga);

        riga= new ResultBean();
        riga.setRisultatoBenzina1(0d);
        riga.setRisultatoBenzina2(1d);
        riga.setRisultatoBenzina1(2d);
        riga.setRisultatoBenzina2(3d);
        riga.setRisultatoBenzina5(4d);
        riga.setRisultatoBenzinaAltro(5d);
        riga.setRisultatoGasolio1(6d);
        riga.setRisultatoGasolio2(7d);
        riga.setRisultatoGasolio3(8d);
        riga.setRisultatoGasolio4(9d);
        riga.setRisultatoGasolio5(10d);
        riga.setRisultatoGasolioAltro(11d);
        dto.setErogato(riga);

        riga= new ResultBean();
        riga.setRisultatoBenzina1(0d);
        riga.setRisultatoBenzina2(1d);
        riga.setRisultatoBenzina1(2d);
        riga.setRisultatoBenzina2(3d);
        riga.setRisultatoBenzina5(4d);
        riga.setRisultatoBenzinaAltro(5d);
        riga.setRisultatoGasolio1(6d);
        riga.setRisultatoGasolio2(7d);
        riga.setRisultatoGasolio3(8d);
        riga.setRisultatoGasolio4(9d);
        riga.setRisultatoGasolio5(10d);
        riga.setRisultatoGasolioAltro(11d);
        dto.setCaliAnnotati1(riga);

        ManageTotaleCampo manage= new ManageTotaleCampo();
        DtoConverter converter= new DtoConverter();
        Prospetto prospetto= new Prospetto();
        try {
            manage.setCampoTot(dto);
            manage.setTotaleCarico(dto);
            manage.setTotaleScarico(dto);
            prospetto=converter.convertToProspetto(dto);

        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}

package it.exolab.prospetto.utility;

import it.exolab.prospetto.common.ResultColumn;
import it.exolab.prospetto.models.DatiProspetto;

/*
CLASSE DI CONVERSIONE DA OGETTI DTO A OGGETTI UTILIZZATI NELLA COSTRUZIONE DEI XML, E VICEVERSA
 */
public class ManageConverter {

    public DatiProspetto convertToDatiProspetto(ResultColumn column){
        DatiProspetto dati= new DatiProspetto();
        dati.setDataRimanenza(column.getDataRimanenza());
        dati.setEccedenzeAnnotate1(column.getEccedenzeAnnotate1());
        dati.setEccedenzeAnnotate2(column.getEccedenzeAnnotate2());
        dati.setEccedenzeAnnotate3(column.getEccedenzeAnnotate3());
        dati.setEccedenzeAnnotate4(column.getEccedenzeAnnotate4());
        dati.setTotaleCarico(column.getTotaleCarico());
        dati.setErogato(column.getErogato());
        dati.setEccedenzeAnnotate1(column.getEccedenzeAnnotate1());
        dati.setEccedenzeAnnotate2(column.getEccedenzeAnnotate2());
        dati.setEccedenzeAnnotate3(column.getEccedenzeAnnotate3());
        dati.setEccedenzeAnnotate4(column.getEccedenzeAnnotate4());
        dati.setTotaleScarico(column.getTotaleScarico());
        dati.setRimanenzaContabile(column.getRimanenzaContabile());

        return dati;
    }

}

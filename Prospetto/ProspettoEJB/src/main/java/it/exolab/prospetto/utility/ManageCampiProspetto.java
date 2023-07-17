package it.exolab.prospetto.utility;

import it.exolab.prospetto.common.ResultColumn;
import it.exolab.prospetto.dto.CriterioRicerca;
import it.exolab.prospetto.mapper.ProspettoMapper;
import it.exolab.prospetto.mapper.ProspettoMapperImpl;

import java.sql.Date;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;

/*
CLASSE CHE SI OCCUPA DEI VARI CALCOLI DEI CAMPI DEL PROSPETTO
 */
public class ManageCampiProspetto {

    public Double calcolaTotaleCarico(ResultColumn column) {
        Double valore = 0d;

        if (column.getRimanenza() != null) {
            valore = valore + column.getRimanenza();
        } else if (column.getIntrodotto() != null) {
            valore = valore + column.getIntrodotto();
        } else if (column.getCaliAnnotati1() != null) {
            valore = valore + column.getCaliAnnotati1();
        } else if (column.getCaliAnnotati2() != null) {
            valore = valore + column.getCaliAnnotati2();
        } else if (column.getCaliAnnotati3() != null) {
            valore = valore + column.getCaliAnnotati3();
        } else if (column.getCaliAnnotati4() != null) {
            valore = valore + column.getCaliAnnotati4();
        }

        return valore;
    }

    public Double calcolaTotaleScarico(ResultColumn column) {
        Double valore = 0d;

        if (column.getErogato() != null) {
            valore = valore + column.getErogato();
        } else if (column.getCaliAnnotati1() != null) {
            valore = valore + column.getCaliAnnotati1();
        } else if (column.getCaliAnnotati2() != null) {
            valore = valore + column.getCaliAnnotati2();
        } else if (column.getCaliAnnotati1() != null) {
            valore = valore + column.getCaliAnnotati3();
        } else if (column.getCaliAnnotati2() != null) {
            valore = valore + column.getCaliAnnotati4();
        }
        return valore;
    }

    public String calcolaDataRimanenza(Date dataGiacenzaIniziale) throws Exception {
        DateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
        Date lastDayAnnoFinanziarioPrecendente= (Date) lastDayAnnoFinanziarioprecendente();

        if (dataGiacenzaIniziale != null && dataGiacenzaIniziale.before(lastDayAnnoFinanziarioPrecendente)) {
            return dateFormat.format(dataGiacenzaIniziale);
        }else{
            return  dateFormat.format(lastDayAnnoFinanziarioPrecendente);
        }
    }

    public java.util.Date lastDayAnnoFinanziarioprecendente() throws Exception {
        Calendar calendar= Calendar.getInstance();
        int anno=calendar.get(Calendar.YEAR)-1;
        DateFormat dateFormat= new SimpleDateFormat("dd/mm/yyyy");
        return dateFormat.parse("31/12/"+anno);
    }

    public String controllDataRimanenza(ResultColumn colonna) throws Exception{
        Date dataGiacenzaIniziale= colonna.getDataRiferimento();
        return calcolaDataRimanenza(dataGiacenzaIniziale);
    }

}

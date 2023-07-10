package it.exolab.prospetto.controllers;

import it.exolab.prospetto.dto.CriterioRicerca;
import it.exolab.prospetto.mapper.ProspettoMapper;
import it.exolab.prospetto.mapper.ProspettoMapperImpl;

import java.sql.Date;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;


public class ManageDataRimanenza {

    public String calcolaDataRimanenza(CriterioRicerca criterio) throws Exception {
        DateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
        ProspettoMapper mapper= new ProspettoMapperImpl();

        Date data= mapper.getDataRimanenza(criterio);
        Date lastDayAnnoFinanziarioPrecendente= (Date) lastDayAnnoFinanziarioprecendente();

        if (data != null && data.before(lastDayAnnoFinanziarioPrecendente)) {
           return dateFormat.format(data);
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
}

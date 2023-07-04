package controller;

import bean.CriterioRicerca;
import bean.DataRimanenzaBean;
import dto.ProspettoDTO;
import mapper.ProspettoMapper;
import mapper.ProspettoMapperImplem;

import java.lang.reflect.Method;
import java.sql.Date;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;

public class ManageDataRimanenza {

    public DataRimanenzaBean calcolaDataRimanenza(CriterioRicerca criterio) throws Exception {
        DateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
        ProspettoMapper mapper= new ProspettoMapperImplem();

        DataRimanenzaBean dataRimanenza = mapper.calcolaDataRimanenza(criterio);
        controllDataRimanenza(dataRimanenza,"DataBenzina");
        controllDataRimanenza(dataRimanenza,"DataGasolio");
        controllDataRimanenza(dataRimanenza,"DataOlio");
        controllDataRimanenza(dataRimanenza,"DataGpl");

        return dataRimanenza;
    }

    public void controllDataRimanenza(DataRimanenzaBean dataRimanenza,String name) throws Exception {
        String metodoGet= "get"+name;
        String metodoSet="set"+name;
        if(name.equals("DataBenzina")||name.equals("DataGasolio")){

        Method methodGet= dataRimanenza.getClass().getMethod(metodoGet.concat("1"));
        Method methodSet= dataRimanenza.getClass().getMethod(metodoSet.concat("1"),Date.class);
        Date valore= (Date) methodGet.invoke(dataRimanenza);
        Date lastDayAnnoPrecedente= (Date) lastDayAnnoFinanziarioprecendente();
        if(valore != null){
            if (valore.before(lastDayAnnoPrecedente)){
                methodSet.invoke(dataRimanenza,lastDayAnnoPrecedente);
            }
        }
        methodGet= dataRimanenza.getClass().getMethod(metodoGet.concat("2"));
        methodSet= dataRimanenza.getClass().getMethod(metodoSet.concat("2"),Date.class);
        valore= (Date) methodGet.invoke(dataRimanenza);
        lastDayAnnoPrecedente= (Date) lastDayAnnoFinanziarioprecendente();
        if(valore != null){
            if (valore.before(lastDayAnnoPrecedente)){
                methodSet.invoke(dataRimanenza,lastDayAnnoPrecedente);
            }
        }
        methodGet= dataRimanenza.getClass().getMethod(metodoGet.concat("3"));
        methodSet= dataRimanenza.getClass().getMethod(metodoSet.concat("3"),Date.class);
        valore= (Date) methodGet.invoke(dataRimanenza);
        lastDayAnnoPrecedente= (Date) lastDayAnnoFinanziarioprecendente();
        if(valore != null){
            if (valore.before(lastDayAnnoPrecedente)){
                methodSet.invoke(dataRimanenza,lastDayAnnoPrecedente);
            }
        }
        methodGet= dataRimanenza.getClass().getMethod(metodoGet.concat("4"));
        methodSet= dataRimanenza.getClass().getMethod(metodoSet.concat("4"),Date.class);
        valore= (Date) methodGet.invoke(dataRimanenza);
        lastDayAnnoPrecedente= (Date) lastDayAnnoFinanziarioprecendente();
        if(valore != null){
            if (valore.before(lastDayAnnoPrecedente)){
                methodSet.invoke(dataRimanenza,lastDayAnnoPrecedente);
            }
        }
        methodGet= dataRimanenza.getClass().getMethod(metodoGet.concat("5"));
        methodSet= dataRimanenza.getClass().getMethod(metodoSet.concat("5"),Date.class);
        valore= (Date) methodGet.invoke(dataRimanenza);
        lastDayAnnoPrecedente= (Date) lastDayAnnoFinanziarioprecendente();
        if(valore != null){
            if (valore.before(lastDayAnnoPrecedente)){
                methodSet.invoke(dataRimanenza,lastDayAnnoPrecedente);
            }
        }
        methodGet= dataRimanenza.getClass().getMethod(metodoGet.concat("Altro"));
        methodSet= dataRimanenza.getClass().getMethod(metodoSet.concat("Altro"),Date.class);
        valore= (Date) methodGet.invoke(dataRimanenza);
        lastDayAnnoPrecedente= (Date) lastDayAnnoFinanziarioprecendente();
        if(valore != null){
            if (valore.before(lastDayAnnoPrecedente)){
                methodSet.invoke(dataRimanenza,lastDayAnnoPrecedente);
            }
         }
        }else {
            Method methodGet = dataRimanenza.getClass().getMethod(metodoGet);
            Method methodSet = dataRimanenza.getClass().getMethod(metodoSet, Date.class);
            Date valore = (Date) methodGet.invoke(dataRimanenza);
            Date lastDayAnnoPrecedente = (Date) lastDayAnnoFinanziarioprecendente();
            if (valore != null) {
                if (valore.before(lastDayAnnoPrecedente)) {
                    methodSet.invoke(dataRimanenza, lastDayAnnoPrecedente);
                }
            }
        }

    }


    public java.util.Date lastDayAnnoFinanziarioprecendente() throws Exception {
        Calendar calendar= Calendar.getInstance();
        int anno=calendar.get(Calendar.YEAR)-1;
        DateFormat dateFormat= new SimpleDateFormat("dd/mm/yyyy");
        return dateFormat.parse("31/12/"+anno);
    }
}

package it.exolab.prospetto.controllers;

import it.exolab.prospetto.dataaccess.CommonDataAccess;

import it.exolab.prospetto.dto.CriterioRicerca;
import it.exolab.prospetto.models.Giacenza;
import lombok.Data;

import java.text.*;
import java.util.Date;
import java.util.List;

@Data
public class ProspettoRiepilogoAnnoController {

    private String codAccisa;
    private String dataRimanenza;
    private String delegante;
    private String annoFinanziario;
    private CriterioRicerca criterioRicerca;
    private CommonDataAccess commonDataAccess;

    // RECUPERO LISTA GIACENZE PER CODICE ACCISA
    public List<Giacenza> getListaGiacenze() throws Exception {
/*
        criterioRicerca = new CriterioRicerca();
        criterioRicerca.setCodiceAccisa(codAccisa);
        criterioRicerca.setListaGiacenze(commonDataAccess.getGiacenze(criterioRicerca));

        return criterioRicerca.getListaGiacenze();

 */
        return null;
    }

    private Date lastDayAnnoFinanziarioprecendente() throws ParseException {
        int annofinanziarioPrecendente = Integer.valueOf(this.annoFinanziario) - 1;
        DateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
        return dateFormat.parse("31/12/" + annofinanziarioPrecendente);
    }

    // CALCOLO DATA RIMANENZA
    public String calcolaDataRimanenza(String firstDay, Date dataCompetenza, Giacenza giacenza) throws Exception {

        criterioRicerca = new CriterioRicerca();
        DateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");

        String dataCompetenzaString = null;

        if(dataCompetenza != null) {
            dataCompetenzaString = dateFormat.format(dataCompetenza);
        } else {
            dataCompetenzaString = "31/12/" + annoFinanziario;
        }

        Date newDataRimanenza = null;

        criterioRicerca.setTipoGiacenzaRegistro(giacenza.getTipoGiacenza());
        newDataRimanenza = commonDataAccess.getDataRimanenza(criterioRicerca);

        if (newDataRimanenza != null) {

            criterioRicerca = new CriterioRicerca();
            criterioRicerca.setCodiceAccisa(codAccisa);
            criterioRicerca.setCodiceFiscale(delegante);
            criterioRicerca.setDataInvioDa(firstDay);
            criterioRicerca.setDataInvioA(dataCompetenzaString);
            criterioRicerca.setIdGiacenzaRegistro(giacenza.getIdGiacenza());

            Date dataPrecedenteAnnoFinanziario = this.lastDayAnnoFinanziarioprecendente();
            if (newDataRimanenza.before(dataPrecedenteAnnoFinanziario)) {

                return dateFormat.format(dataPrecedenteAnnoFinanziario);

            } else {

                dataRimanenza = dateFormat.format(newDataRimanenza);

            }

            return dataRimanenza;

        } else {

            return dataRimanenza;

        }
    }
}
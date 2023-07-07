package it.exolab.prospetto.dataaccess;

import it.exolab.prospetto.dto.CriterioRicercaDTO;

import java.util.Date;
import java.util.List;

public interface CommonDataAccess {

    List<models.Giacenza> getGiacenze(CriterioRicercaDTO criterioRicercaDTO) throws Exception;
    Date getDataRimanenza(CriterioRicercaDTO criterioRicercaDTO) throws Exception;
}

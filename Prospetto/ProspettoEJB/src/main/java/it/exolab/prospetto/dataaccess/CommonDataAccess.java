package it.exolab.prospetto.dataaccess;

import it.exolab.prospetto.dto.CriterioRicerca;
import it.exolab.prospetto.models.Giacenza;

import java.util.Date;
import java.util.List;

public interface CommonDataAccess {

    List<Giacenza> getGiacenze(CriterioRicerca criterioRicercaDTO) throws Exception;
    Date getDataRimanenza(CriterioRicerca criterioRicercaDTO) throws Exception;
}

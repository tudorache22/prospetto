package it.exolab.prospetto.mapper;

import it.exolab.prospetto.common.ResultColumn;
import it.exolab.prospetto.dto.CriterioRicerca;
import it.exolab.prospetto.models.Giacenza;

import java.io.IOException;
import java.sql.Date;
import java.util.List;


public interface ProspettoMapper {

    ResultColumn calcolaGiacenza(CriterioRicerca criterio);
    List<Giacenza> getGiacenze(CriterioRicerca criterio) throws IOException;
    Date getDataRimanenza(CriterioRicerca criterio) throws IOException;


}

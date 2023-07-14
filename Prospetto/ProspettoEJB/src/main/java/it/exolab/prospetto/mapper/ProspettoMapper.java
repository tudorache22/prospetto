package it.exolab.prospetto.mapper;

import it.exolab.prospetto.common.ResultColumn;
import it.exolab.prospetto.dto.CriterioRicerca;
import it.exolab.prospetto.dto.GiacenzaDTO;
import it.exolab.prospetto.dto.VerificaDittaDTO;
import it.exolab.prospetto.models.Giacenza;

import java.io.IOException;
import java.sql.Date;
import java.util.List;


public interface ProspettoMapper {

    List<ResultColumn> calcolaProspetto (List<CriterioRicerca> listaCriteri) throws Exception;
    List<CriterioRicerca> calcolaDataRimanenza(List<GiacenzaDTO> listaGiacenze)throws Exception;
    List<GiacenzaDTO> getGiacenze(String codiceAccise)throws Exception;
    List<VerificaDittaDTO> verificaCompetenzaDitta(List<CriterioRicerca> criterio)throws Exception;
    int verificaStatoAnnullato(CriterioRicerca criterio)throws Exception;
    String getTelelivelli(String codiceAccise)throws Exception;
}

package it.exolab.prospetto.dto;

import it.exolab.prospetto.common.CountRow;
import it.exolab.prospetto.enums.Row;
import lombok.Data;

import java.sql.Date;
import java.util.List;

@Data
public class CriterioRicerca {
    private String piva;
    private String codiceAccisa;
    private String dataRiferimento;
    private String dataInvioDa;
    private String dataInvioA;

    private Integer anno;

    private String tipoGiacenza;
    private Date dataGiacenzaIniziale;
    private String idGiacenza;

}

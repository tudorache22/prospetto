package it.exolab.prospetto.dto;

import it.exolab.prospetto.common.CountRow;
import it.exolab.prospetto.enums.Row;
import lombok.Data;

import java.util.List;

@Data
public class CriterioRicercaDTO {
    private String piva;
    private String codiceAccisa;
    private String dataRiferimento;
    private String dataInvioDa;
    private String dataInvioA;
    private CountRow countRow;
    private GiacenzaDTO giacenza;
    private Row firstRow;
}

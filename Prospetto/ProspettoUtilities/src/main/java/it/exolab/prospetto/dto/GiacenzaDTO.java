package it.exolab.prospetto.dto;

import lombok.Data;

import java.sql.Date;

@Data
public class GiacenzaDTO {
    private String codiceAccisa;
    private String idGiacenza;
    private String descGiacenza;
    private String tipoGiacenza;
    private Date dataGiacenzaIniziale;
}

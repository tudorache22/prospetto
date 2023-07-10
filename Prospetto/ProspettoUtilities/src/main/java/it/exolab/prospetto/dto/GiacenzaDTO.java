package it.exolab.prospetto.dto;

import lombok.Data;

import java.sql.Date;

@Data
public class GiacenzaDTO {
    private String idGiacenza;
    private String descGiacenza;
    private String tipoGIacenza;
    private Date dataGiacenzaIniziale;
}

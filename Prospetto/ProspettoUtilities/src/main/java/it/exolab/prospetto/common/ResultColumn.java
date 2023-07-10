package it.exolab.prospetto.common;

import lombok.Data;

import java.sql.Date;

@Data
public class ResultColumn {
    private Date dataRimanenza;
    private Double rimanenza;
    private Double introdotto;
    private Double eccedenzeAnnotate1;
    private Double eccedenzeAnnotate2;
    private Double eccedenzeAnnotate3;
    private Double eccedenzeAnnotate4;
    private Double erogato;
    private Double caliAnnotati1;
    private Double caliAnnotati2;
    private Double caliAnnotati3;
    private Double caliAnnotati4;
    private Double rimanenzaContabile;
}

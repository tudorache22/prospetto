package it.exolab.prospetto.dto;

import lombok.Data;

import java.util.List;

@Data
public class CriterioRicercaDTO {

    private String codiceAccisa;
    private String tipoGiacenzaRegistro;
    private String dataRiferimentoA;
    private String codiceFiscale;
    private String idGiacenzaRegistro;

    private String dataInvioDa;
    private String dataInvioA;

    private List<models.Giacenza> listaGiacenze;


}

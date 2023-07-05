package it.exolab.prospetto.models;


import it.exolab.prospetto.enums.ColonnaRiferimento;

import java.io.Serializable;
import java.sql.Date;

public class GiacenzaCriterio implements Serializable {
    private String codiceAccisa;
    private String idGiacenza;
    private String tipoGiacenza;
    private String descTipoGiacenza;
    private Date dataGiacenzaIniziale;

    private ColonnaRiferimento colonnaRiferimento;

    public String getCodiceAccisa() {
        return codiceAccisa;
    }

    public void setCodiceAccisa(String codiceAccisa) {
        this.codiceAccisa = codiceAccisa;
    }

    public String getGiacenza() {
        return idGiacenza;
    }

    public void setGiacenza(String idGiacenza) {
        this.idGiacenza = idGiacenza;
    }

    public String getTipoGiacenza() {
        return tipoGiacenza;
    }

    public void setTipoGiacenza(String tipoGiacenza) {
        this.tipoGiacenza = tipoGiacenza;
    }

    public String getDescTipoGiacenza() {
        return descTipoGiacenza;
    }

    public void setDescTipoGiacenza(String descTipoGiacenza) {
        this.descTipoGiacenza = descTipoGiacenza;
    }

    public Date getDataGiacenzaIniziale() {
        return dataGiacenzaIniziale;
    }

    public void setDataGiacenzaIniziale(Date dataGiacenzaIniziale) {
        this.dataGiacenzaIniziale = dataGiacenzaIniziale;
    }

    public String getIdGiacenza() {
        return idGiacenza;
    }

    public void setIdGiacenza(String idGiacenza) {
        this.idGiacenza = idGiacenza;
    }

    public ColonnaRiferimento getColonnaRiferimento() {
        return colonnaRiferimento;
    }

    public void setColonnaRiferimento(ColonnaRiferimento colonnaRiferimento) {
        this.colonnaRiferimento = colonnaRiferimento;
    }
}

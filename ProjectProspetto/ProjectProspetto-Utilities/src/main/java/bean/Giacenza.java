package bean;

import enums.ColonnaRiferimento;

public class Giacenza {
    private String label;
    private ColonnaRiferimento colonna_riferimento;
    private String codGiacenza;

    public String getCodGiacenza() {
        return codGiacenza;
    }

    public void setCodGiacenza(String codGiacenza) {
        this.codGiacenza = codGiacenza;
    }

    public String getLabel() {
        return label;
    }

    public void setLabel(String label) {
        this.label = label;
    }

    public ColonnaRiferimento getColonna_riferimento() {
        return colonna_riferimento;
    }

    public void setColonna_riferimento(ColonnaRiferimento colonna_riferimento) {
        this.colonna_riferimento = colonna_riferimento;
    }
}

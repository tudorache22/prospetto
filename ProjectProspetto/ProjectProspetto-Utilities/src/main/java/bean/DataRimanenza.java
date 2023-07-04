package bean;


import enums.ColonnaRiferimento;

public class DataRimanenza {
    private String data;
    private ColonnaRiferimento colonna_riferimento;

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public ColonnaRiferimento getColonna_riferimento() {
        return colonna_riferimento;
    }

    public void setColonna_riferimento(ColonnaRiferimento colonna_riferimento) {
        this.colonna_riferimento = colonna_riferimento;
    }
}

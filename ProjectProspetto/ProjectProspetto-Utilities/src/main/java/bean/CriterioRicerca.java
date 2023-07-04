package bean;

import enums.RigaRiferimento;

import java.io.Serializable;
import java.util.List;

public class CriterioRicerca implements Serializable {
    private String codiceAccisa;

    private String dataRiferimento;
    private String codFiscale;
    private String dataInvioDa;
    private String dataInvioA;

    private List<GiacenzaBean> listaGiacenze;

    private RigaRiferimento rigaRiferimento;
    private CountBean countBean;

    public List<GiacenzaBean> getListaGiacenze() {
        return listaGiacenze;
    }

    public void setListaGiacenze(List<GiacenzaBean> listaGiacenze) {
        this.listaGiacenze = listaGiacenze;
    }

    public CountBean getCountBean() {
        return countBean;
    }

    public void setCountBean(CountBean countBean) {
        this.countBean = countBean;
    }

    public String getCodiceAccisa() {
        return codiceAccisa;
    }

    public void setCodiceAccisa(String codiceAccisa) {
        this.codiceAccisa = codiceAccisa;
    }

    public String getDataRiferimento() {
        return dataRiferimento;
    }

    public void setDataRiferimento(String dataRiferimento) {
        this.dataRiferimento = dataRiferimento;
    }

    public String getCodFiscale() {
        return codFiscale;
    }

    public void setCodFiscale(String codFiscale) {
        this.codFiscale = codFiscale;
    }

    public String getDataInvioDa() {
        return dataInvioDa;
    }

    public void setDataInvioDa(String dataInvioDa) {
        this.dataInvioDa = dataInvioDa;
    }

    public String getDataInvioA() {
        return dataInvioA;
    }

    public void setDataInvioA(String dataInvioA) {
        this.dataInvioA = dataInvioA;
    }

    public RigaRiferimento getRigaRiferimento() {
        return rigaRiferimento;
    }

    public void setRigaRiferimento(RigaRiferimento rigaRiferimento) {
        this.rigaRiferimento = rigaRiferimento;
    }
}

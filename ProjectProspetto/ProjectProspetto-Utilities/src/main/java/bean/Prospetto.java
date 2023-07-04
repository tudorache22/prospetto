package bean;

import javax.xml.bind.annotation.*;
import java.util.List;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlRootElement(name="prospetto")

public class Prospetto {
 //codice ditta, stato.  esito
    @XmlElementWrapper (name="DateRimanenza")
    @XmlElement(name="DataRimanenza")
     List<DataRimanenza> dataRimanenza;
    @XmlElement(name="Rimanenza")
    RigaProspetto rimanenza;
    @XmlElement(name="Introdotto")
    RigaProspetto introdotto;
    @XmlElement(name="EccedenzeAnnotate1")
    RigaProspetto eccedenzeAnnotate1;
    @XmlElement(name = "EccedenzeAnnotate2")
    RigaProspetto eccedenzeAnnotate2;
    @XmlElement(name="EccedenzeAnnotate3")
    RigaProspetto eccedenzeAnnotate3;
    @XmlElement(name="EccedenzeAnnotate4")
    RigaProspetto eccedenzeAnnotate4;
    @XmlElement(name="TotaleCarico")
    RigaProspetto totaleCarico;
    @XmlElement(name="Erogato")
    RigaProspetto erogato;
    @XmlElement(name="CaliAnnotati1")
    RigaProspetto caliAnnotati1;
    @XmlElement(name="CaliAnnotati2")
    RigaProspetto caliAnnotati2;
    @XmlElement(name="CaliAnnotati3")
    RigaProspetto caliAnnotati3;
    @XmlElement(name="CaliAnnotati4")
    RigaProspetto caliAnnotati4;
    @XmlElement(name="TotaleScarico")
    RigaProspetto totaleScarico;
    @XmlElement(name="RimanenzaContabile")
    RigaProspetto rimanenzaContabile;

    public List<DataRimanenza> getDataRimanenza() {
        return dataRimanenza;
    }

    public void setDataRimanenza(List<DataRimanenza> dataRimanenza) {
        this.dataRimanenza = dataRimanenza;
    }

    public RigaProspetto getRimanenza() {
        return rimanenza;
    }

    public void setRimanenza(RigaProspetto rimanenza) {
        this.rimanenza = rimanenza;
    }

    public RigaProspetto getIntrodotto() {
        return introdotto;
    }

    public void setIntrodotto(RigaProspetto introdotto) {
        this.introdotto = introdotto;
    }

    public RigaProspetto getEccedenzeAnnotate1() {
        return eccedenzeAnnotate1;
    }

    public void setEccedenzeAnnotate1(RigaProspetto eccedenzeAnnotate1) {
        this.eccedenzeAnnotate1 = eccedenzeAnnotate1;
    }

    public RigaProspetto getEccedenzeAnnotate2() {
        return eccedenzeAnnotate2;
    }

    public void setEccedenzeAnnotate2(RigaProspetto eccedenzeAnnotate2) {
        this.eccedenzeAnnotate2 = eccedenzeAnnotate2;
    }

    public RigaProspetto getEccedenzeAnnotate3() {
        return eccedenzeAnnotate3;
    }

    public void setEccedenzeAnnotate3(RigaProspetto eccedenzeAnnotate3) {
        this.eccedenzeAnnotate3 = eccedenzeAnnotate3;
    }

    public RigaProspetto getEccedenzeAnnotate4() {
        return eccedenzeAnnotate4;
    }

    public void setEccedenzeAnnotate4(RigaProspetto eccedenzeAnnotate4) {
        this.eccedenzeAnnotate4 = eccedenzeAnnotate4;
    }

    public RigaProspetto getTotaleCarico() {
        return totaleCarico;
    }

    public void setTotaleCarico(RigaProspetto totaleCarico) {
        this.totaleCarico = totaleCarico;
    }

    public RigaProspetto getErogato() {
        return erogato;
    }

    public void setErogato(RigaProspetto erogato) {
        this.erogato = erogato;
    }

    public RigaProspetto getCaliAnnotati1() {
        return caliAnnotati1;
    }

    public void setCaliAnnotati1(RigaProspetto caliAnnotati1) {
        this.caliAnnotati1 = caliAnnotati1;
    }

    public RigaProspetto getCaliAnnotati2() {
        return caliAnnotati2;
    }

    public void setCaliAnnotati2(RigaProspetto caliAnnotati2) {
        this.caliAnnotati2 = caliAnnotati2;
    }

    public RigaProspetto getCaliAnnotati3() {
        return caliAnnotati3;
    }

    public void setCaliAnnotati3(RigaProspetto caliAnnotati3) {
        this.caliAnnotati3 = caliAnnotati3;
    }

    public RigaProspetto getCaliAnnotati4() {
        return caliAnnotati4;
    }

    public void setCaliAnnotati4(RigaProspetto caliAnnotati4) {
        this.caliAnnotati4 = caliAnnotati4;
    }

    public RigaProspetto getTotaleScarico() {
        return totaleScarico;
    }

    public void setTotaleScarico(RigaProspetto totaleScarico) {
        this.totaleScarico = totaleScarico;
    }

    public RigaProspetto getRimanenzaContabile() {
        return rimanenzaContabile;
    }

    public void setRimanenzaContabile(RigaProspetto rimanenzaContabile) {
        this.rimanenzaContabile = rimanenzaContabile;
    }

}

package it.exolab.prospetto.models;

import lombok.Data;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;

@XmlAccessorType(XmlAccessType.FIELD)
@Data
public class DatiProspetto {
    @XmlElement(name="DataRimanenza")
    private String dataRimanenza;
    @XmlElement(name="Rimanenza")
    private Double rimanenza;
    @XmlElement(name="Introdotto")
    private Double introdotto;
    @XmlElement(name="EccedenzeAnnotate1")
    private Double eccedenzeAnnotate1;
    @XmlElement(name="EccedenzeAnnotate2")
    private Double eccedenzeAnnotate2;
    @XmlElement(name="EccedenzeAnnotate3")
    private Double eccedenzeAnnotate3;
    @XmlElement(name="EccedenzeAnnotate4")
    private Double eccedenzeAnnotate4;
    @XmlElement(name="TotaleCarico")
    private Double totaleCarico;
    @XmlElement(name="Erogato")
    private Double erogato;
    @XmlElement(name="CaliAnnotati1")
    private Double caliAnnotati1;
    @XmlElement(name="CaliAnnotati2")
    private Double caliAnnotati2;
    @XmlElement(name="CaliAnnotati3")
    private Double caliAnnotati3;
    @XmlElement(name="CaliAnnotati4")
    private Double caliAnnotati4;
    @XmlElement(name="TotaleScarico")
    private Double totaleScarico;
    @XmlElement(name="RimanenzaContabile")
    private Double rimanenzaContabile;
}

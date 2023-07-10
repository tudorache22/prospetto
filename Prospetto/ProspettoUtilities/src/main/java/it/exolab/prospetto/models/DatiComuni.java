package it.exolab.prospetto.models;

import lombok.Data;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;

@Data
@XmlAccessorType(XmlAccessType.FIELD)
public class DatiComuni {

    @XmlElement(name = "Piva")
    private String piva;

    @XmlElement(name = "Anno")
    private String anno;

    @XmlElement(name = "Denominazione")
    private String denominazione;
}

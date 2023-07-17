package it.exolab.prospetto.models;


import lombok.Data;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;

@XmlAccessorType(XmlAccessType.FIELD)
@Data
public class Giacenza {

    @XmlElement(name="TipoGiacenza")
    private String tipoGiacenza;

    @XmlElement(name="IdGiacenza")
    private String idGiacenza;

    @XmlElement(name="Descrizione")
    private String descrizione;

    @XmlElement(name = "DatiGiacenza")
    private DatiProspetto datiProspetto;
}

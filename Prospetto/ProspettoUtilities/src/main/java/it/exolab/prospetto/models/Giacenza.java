package it.exolab.prospetto.models;

import it.exolab.prospetto.enums.Tipologia;
import it.exolab.prospetto.models.DatiProspetto;
import lombok.Data;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementWrapper;
import java.sql.Date;

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

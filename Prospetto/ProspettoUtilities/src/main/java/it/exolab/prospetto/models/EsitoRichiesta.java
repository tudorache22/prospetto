package models;

import lombok.Data;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementWrapper;
import java.util.List;

@Data
@XmlAccessorType(XmlAccessType.FIELD)
public class EsitoRichiesta {

    @XmlElement(name = "Codice_Ditta")
    private String codiceDitta;

    @XmlElement(name="Motivazione")
    private String motivazione;
}

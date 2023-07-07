package models;

import lombok.Data;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementWrapper;
import java.util.List;

@Data
@XmlAccessorType(XmlAccessType.FIELD)
public class EsitoUpload {
    @XmlElement(name = "Codice_Ditta")
    private String codiceDitta;

    @XmlElementWrapper(name="Lista_Errori")
    @XmlElement(name = "Motivazione")
    private List<String> motivazioni;
}

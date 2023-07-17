package it.exolab.prospetto.models;

import lombok.Data;

import javax.xml.bind.annotation.*;
import java.util.List;
@Data
@XmlAccessorType(XmlAccessType.FIELD)
@XmlRootElement(name="Richiesta")
public class DownloadOperatore {

    @XmlElement(name = "Dati_Comuni")
    private DatiComuni datiComuni;

    @XmlElementWrapper(name = "Lista_Codici_Ditta")
    @XmlElement(name = "Codice_Ditta")
    private List<String> codiciDitta;
}

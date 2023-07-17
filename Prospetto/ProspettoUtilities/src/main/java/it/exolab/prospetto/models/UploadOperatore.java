package it.exolab.prospetto.models;


import lombok.Data;

import javax.xml.bind.annotation.*;
import java.util.List;

@Data
@XmlAccessorType(XmlAccessType.FIELD)
@XmlRootElement(name="Riepilogo")
public class UploadOperatore {

    @XmlElement(name = "Dati_Comuni")
    private DatiComuni datiComuni;

    @XmlElementWrapper(name = "Lista_Prospetti")
    @XmlElement(name = "Prospetto")
    private List<Prospetto> listaProspetti;
}

package it.exolab.prospetto.models;

import lombok.Data;

import javax.xml.bind.annotation.*;
import java.util.List;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlRootElement(name="Prospetto")
@Data
public class Prospetto {

    @XmlElement(name="CodiceDitta")
    private  String codiceDitta;

    @XmlElement(name="Stato")
    private String stato;

    @XmlElement(name="Giacenza")
    @XmlElementWrapper(name = "Lista_Giacenze")
    private List<Giacenza> giacenze;

}

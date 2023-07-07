package models;

import lombok.Data;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import javax.xml.bind.annotation.*;
import java.io.File;
import java.util.ArrayList;
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

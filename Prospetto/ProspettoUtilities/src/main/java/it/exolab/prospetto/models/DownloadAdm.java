package it.exolab.prospetto.models;

import it.exolab.prospetto.models.DatiComuni;
import it.exolab.prospetto.models.Prospetto;
import lombok.Data;

import javax.xml.bind.annotation.*;
import java.util.List;

@Data
@XmlRootElement(name="Riepilogo")
@XmlAccessorType(XmlAccessType.FIELD)
public class DownloadAdm {

    @XmlElement(name = "Dati_Comuni")
    private DatiComuni datiComuni;

    @XmlElementWrapper(name = "Lista_Prospetti")
    @XmlElement(name = "Prospetto")
    private List<Prospetto> listaProspetti;

    @XmlElementWrapper(name = "Esito_Richiesta")
    @XmlElement(name = "Esito")
    private List<EsitoRichiesta> listaEsiti;

}

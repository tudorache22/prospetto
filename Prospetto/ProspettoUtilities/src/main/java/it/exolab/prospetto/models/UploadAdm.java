package models;

import lombok.Data;

import javax.xml.bind.annotation.*;
import java.util.List;

@Data
@XmlAccessorType(XmlAccessType.FIELD)
@XmlRootElement(name="Response")
public class UploadAdm {

    @XmlElement(name = "Dati_Comuni")
    private DatiComuni datiComuni;

    @XmlElementWrapper(name = "Esito_Positivo")
    @XmlElement(name = "Codice_Ditta")
    private List<String> listaDitteOK;

    @XmlElementWrapper(name = "Esito_Negativo")
    @XmlElement(name = "Esito")
    private List<EsitoUpload> listaEsiti;
}

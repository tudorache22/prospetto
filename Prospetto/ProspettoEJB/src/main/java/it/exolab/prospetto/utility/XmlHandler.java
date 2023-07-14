package it.exolab.prospetto.utility;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import javax.xml.bind.Unmarshaller;
import java.io.File;
import java.io.FileOutputStream;

//classe marshall e unmarshall
public class XmlHandler {
    private static final String PACKAGEBASE = "it.exolab.prospetto.models.";

    public Object estrai(String xmlPath, String packageOggetto) throws JAXBException {
        String pathOggetto= PACKAGEBASE+packageOggetto;
        File file= new File(xmlPath);
        JAXBContext jaxbContext= JAXBContext.newInstance(pathOggetto);
        Unmarshaller jaxbUnmarshaller= jaxbContext.createUnmarshaller();
        return jaxbUnmarshaller.unmarshal(file);
    }

    public Boolean compattaXml(Object oggetto,String packageOggetto,String pathFile) {
        String pathOggetto= PACKAGEBASE+packageOggetto;
        File file= new File(pathFile);
        try {
            JAXBContext  jaxbContext = JAXBContext.newInstance(pathOggetto);
            Marshaller jaxbMarshaller= jaxbContext.createMarshaller();
            jaxbMarshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT,Boolean.TRUE);
            FileOutputStream fileOutputStream= new FileOutputStream(file);
            jaxbMarshaller.marshal(oggetto,fileOutputStream);
            fileOutputStream.close();
            return true;
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }

    }


}

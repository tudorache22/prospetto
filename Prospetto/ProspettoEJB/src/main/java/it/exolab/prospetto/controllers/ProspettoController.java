package it.exolab.prospetto.controllers;

import it.exolab.prospetto.models.*;
import it.exolab.prospetto.utility.BuilderObjects;

import javax.ejb.LocalBean;
import javax.ejb.Stateless;


@Stateless
@LocalBean
public class ProspettoController implements ProspettoControllerInterface{


     //cambiare parametro con un byte[] ed effettuare unmarshall
    @Override
    public DownloadAdm doDownload(DownloadOperatore downloadOperatore) throws Exception {
        BuilderObjects builder= new BuilderObjects();
        return builder.buildDowloadAdm(downloadOperatore);
    }

    @Override
    public UploadAdm doUpload(UploadOperatore uploadOperatore) throws Exception {
        BuilderObjects builder= new BuilderObjects();
        return builder.buildUplpadAdm(uploadOperatore);
    }


}


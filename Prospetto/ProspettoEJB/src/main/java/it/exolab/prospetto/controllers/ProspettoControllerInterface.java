package it.exolab.prospetto.controllers;

import javax.ejb.Local;

import it.exolab.prospetto.models.DownloadAdm;
import it.exolab.prospetto.models.DownloadOperatore;
import it.exolab.prospetto.models.UploadAdm;
import it.exolab.prospetto.models.UploadOperatore;
@Local
public interface ProspettoControllerInterface {
    DownloadAdm doDownload(DownloadOperatore downloadOperatore) throws Exception;

    UploadAdm doUpload(UploadOperatore uploadOperatore) throws  Exception;
}

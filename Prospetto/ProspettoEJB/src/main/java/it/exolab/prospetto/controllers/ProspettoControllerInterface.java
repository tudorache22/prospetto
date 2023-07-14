package it.exolab.prospetto.controllers;

import it.exolab.prospetto.models.*;

import javax.ejb.Local;
@Local
public interface ProspettoControllerInterface {
    DownloadAdm doDownload(DownloadOperatore downloadOperatore) throws Exception;

    UploadAdm doUpload(UploadOperatore uploadOperatore) throws  Exception;
}

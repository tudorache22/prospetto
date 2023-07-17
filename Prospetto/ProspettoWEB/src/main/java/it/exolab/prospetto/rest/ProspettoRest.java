package it.exolab.prospetto.rest;


import it.exolab.prospetto.controllers.ProspettoControllerInterface;

import it.exolab.prospetto.models.DownloadAdm;
import it.exolab.prospetto.models.DownloadOperatore;

import javax.ejb.EJB;
import javax.ws.rs.Consumes;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Response;

@Path("/prospetto")

public class ProspettoRest {

    @EJB
    private ProspettoControllerInterface prospettoController;


    //Da cambiare con un byte[]  il parametro e anche la risposta
    @POST
    @Path("/calcolaProspetto")
    @Produces({ "application/json" })
    @Consumes({ "application/json" })
    public Response calcolaProspetto(DownloadOperatore downloadOperatore){
        try {
            DownloadAdm downloadAdm= prospettoController.doDownload(downloadOperatore);
            return Response.status(201).entity(downloadAdm).build();
        }
        catch (Exception e){
            e.printStackTrace();
            return Response.status(500).build();
        }
    }


}

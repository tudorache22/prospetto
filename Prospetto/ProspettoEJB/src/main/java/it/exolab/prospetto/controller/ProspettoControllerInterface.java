package it.exolab.prospetto.controller;


import it.exolab.prospetto.models.CriterioRicerca;
import it.exolab.prospetto.models.Prospetto;

import javax.ejb.Local;

@Local
public interface ProspettoControllerInterface {
    Prospetto calcolaProspetto(CriterioRicerca criterio);
}

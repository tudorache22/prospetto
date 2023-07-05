package it.exolab.prospetto.mapper;



import it.exolab.prospetto.dto.ProspettoDTO;
import it.exolab.prospetto.models.CriterioRicerca;
import it.exolab.prospetto.models.DataRimanenzaRow;
import it.exolab.prospetto.models.GiacenzaCriterio;
import it.exolab.prospetto.models.ResultRow;

import java.util.List;

public interface ProspettoMapper {
    public ProspettoDTO calcolaProspetto(CriterioRicerca criterio);

    public DataRimanenzaRow calcolaDataRimanenza(CriterioRicerca criterio);

    public ResultRow calcolaRimanenza(CriterioRicerca criterio);

    public ResultRow calcolaIntrodotto(CriterioRicerca criterio);

    public ResultRow calcolaEccedenze1(CriterioRicerca criterio);

    public ResultRow calcolaEccedenze2(CriterioRicerca criterio);

    public ResultRow calcolaEccedenze3(CriterioRicerca criterio);

    public ResultRow calcolaEccedenze4(CriterioRicerca criterio);

    public ResultRow calcolaErogato(CriterioRicerca criterio);

    public ResultRow calcolaCaliAnnotati1(CriterioRicerca criterio);

    public ResultRow calcolaCaliAnnotati2(CriterioRicerca criterio);

    public ResultRow calcolaCaliAnnotati3(CriterioRicerca criterio);

    public ResultRow calcolaCaliAnnotati4(CriterioRicerca criterio);

    public ResultRow calcolaRimanenzaContabile(CriterioRicerca criterio);

    public List<GiacenzaCriterio> getGiacenze(CriterioRicerca criterio);
}

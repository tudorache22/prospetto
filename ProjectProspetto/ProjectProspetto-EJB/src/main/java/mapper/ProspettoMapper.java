package mapper;

import bean.CriterioRicerca;
import bean.DataRimanenzaBean;
import bean.GiacenzaBean;
import bean.ResultBean;
import dto.ProspettoDTO;

import java.util.List;

public interface ProspettoMapper {
    public ProspettoDTO calcolaProspetto(CriterioRicerca criterio);

    public DataRimanenzaBean calcolaDataRimanenza(CriterioRicerca criterio);

    public ResultBean calcolaRimanenza(CriterioRicerca criterio);

    public ResultBean calcolaIntrodotto(CriterioRicerca criterio);

    public ResultBean calcolaEccedenze1(CriterioRicerca criterio);

    public ResultBean calcolaEccedenze2(CriterioRicerca criterio);

    public ResultBean calcolaEccedenze3(CriterioRicerca criterio);

    public ResultBean calcolaEccedenze4(CriterioRicerca criterio);

    public ResultBean calcolaErogato(CriterioRicerca criterio);

    public ResultBean calcolaCaliAnnotati1(CriterioRicerca criterio);

    public ResultBean calcolaCaliAnnotati2(CriterioRicerca criterio);

    public ResultBean calcolaCaliAnnotati3(CriterioRicerca criterio);

    public ResultBean calcolaCaliAnnotati4(CriterioRicerca criterio);

    public ResultBean calcolaRimanenzaContabile(CriterioRicerca criterio);

    public List<GiacenzaBean> getGiacenze(CriterioRicerca criterio);
}

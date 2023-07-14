package it.exolab.prospetto.utility;

import it.exolab.prospetto.dto.CriterioRicerca;
import it.exolab.prospetto.dto.VerificaDittaDTO;
import it.exolab.prospetto.mapper.ProspettoMapper;
import it.exolab.prospetto.mapper.ProspettoMapperImpl;
import it.exolab.prospetto.models.*;

import java.util.ArrayList;
import java.util.List;

public class BuilderObjects {

    private ProspettoMapper mapper;
    private ManageProspetto manageProspetto;


    public BuilderObjects(){
        this.mapper=new ProspettoMapperImpl();
        this.manageProspetto=new ManageProspetto();
    }

    public DownloadAdm buildDowloadAdm(DownloadOperatore downloadOperatore) throws Exception {

        List<Prospetto> listaProspetti= new ArrayList<>();
        List<CriterioRicerca> listaCriteriDitta= new ArrayList<>();
        for(String ditta: downloadOperatore.getCodiciDitta()){
            CriterioRicerca criterio= new CriterioRicerca();
            criterio.setCodiceAccisa(ditta);
            criterio.setPiva(downloadOperatore.getDatiComuni().getPiva());
            listaCriteriDitta.add(criterio);
        }
        List<VerificaDittaDTO> ditteVerificate= mapper.verificaCompetenzaDitta(listaCriteriDitta);
        for(VerificaDittaDTO ditta:ditteVerificate){
            if (ditta.getCheckDitta()>0){
                Prospetto prospetto =manageProspetto.calcolaProspetto(downloadOperatore.getDatiComuni(),ditta);
                listaProspetti.add(prospetto);
            }
        }

        DownloadAdm downloadAdm= new DownloadAdm();
        downloadAdm.setDatiComuni(downloadOperatore.getDatiComuni());
        downloadAdm.setListaProspetti(listaProspetti);
        //logica dei esiti da mettere

        return downloadAdm;
    }

    public UploadAdm buildUplpadAdm(UploadOperatore uploadOperatore) throws Exception{

        return null;
    }
}

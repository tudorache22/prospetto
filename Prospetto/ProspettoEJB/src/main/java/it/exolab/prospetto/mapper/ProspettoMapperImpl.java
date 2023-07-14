package it.exolab.prospetto.mapper;

import it.exolab.prospetto.common.CountRow;
import it.exolab.prospetto.common.ResultColumn;
import it.exolab.prospetto.dto.CriterioRicerca;
import it.exolab.prospetto.dto.GiacenzaDTO;
import it.exolab.prospetto.dto.VerificaDittaDTO;
import it.exolab.prospetto.factory.ProspettoSessionFactory;
import it.exolab.prospetto.models.Giacenza;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;

import java.io.IOException;
import java.sql.Date;
import java.util.ArrayList;
import java.util.List;

public class ProspettoMapperImpl implements ProspettoMapper{


    @Override
    public List<ResultColumn> calcolaProspetto(List<CriterioRicerca> listaCriteri) throws Exception {
        List<ResultColumn> result= new ArrayList<>();
        SqlSession session = null;
        try {
            SqlSessionFactory aidaSessionFactory = ProspettoSessionFactory.getSessionFactory();
            session = aidaSessionFactory.openSession();
            result= session.selectList("calcolaProspetto",listaCriteri);
        } catch (Exception e) {
            throw e;

        } finally {
            if (session != null) {
                session.close();
            }
        }
        return  result;
    }

    @Override
    public List<CriterioRicerca> calcolaDataRimanenza(List<GiacenzaDTO> listaGiacenze) throws Exception{
        List<CriterioRicerca> result= new ArrayList<>();
        SqlSession session = null;
        try {
            SqlSessionFactory aidaSessionFactory = ProspettoSessionFactory.getSessionFactory();
            session = aidaSessionFactory.openSession();
            result= session.selectList("calcolaDataRimanenza",listaGiacenze);
        } catch (Exception e) {
            throw e;

        } finally {
            if (session != null) {
                session.close();
            }
        }
        return  result;
    }

    @Override
    public List<GiacenzaDTO> getGiacenze(String codiceAccise) throws Exception {
        List<GiacenzaDTO> result= new ArrayList<>();
        SqlSession session = null;
        try {
            SqlSessionFactory aidaSessionFactory = ProspettoSessionFactory.getSessionFactory();
            session = aidaSessionFactory.openSession();
            result= session.selectList("getGiacenze",codiceAccise);
        } catch (Exception e) {
            throw e;

        } finally {
            if (session != null) {
                session.close();
            }
        }
        return  result;
    }

    @Override
    public List<VerificaDittaDTO> verificaCompetenzaDitta(List<CriterioRicerca> list) throws Exception{
        List<VerificaDittaDTO> result= new ArrayList<>();
        SqlSession session = null;
        try {
            SqlSessionFactory aidaSessionFactory = ProspettoSessionFactory.getSessionFactory();
            session = aidaSessionFactory.openSession();
            result= session.selectList("verificaCompetenzaDitta",list);
        } catch (Exception e) {
            throw e;

        } finally {
            if (session != null) {
                session.close();
            }
        }
        return  result;
    }

    @Override
    public int verificaStatoAnnullato(CriterioRicerca criterio) throws Exception{
        int result;
        SqlSession session = null;
        try {
            SqlSessionFactory aidaSessionFactory = ProspettoSessionFactory.getSessionFactory();
            session = aidaSessionFactory.openSession();
            result= session.selectOne("verificaStatoAnnullato",criterio);
        } catch (Exception e) {
            throw e;

        } finally {
            if (session != null) {
                session.close();
            }
        }
        return  result;
    }

    @Override
    public String getTelelivelli(String codiceAccise) throws Exception{
        String result;
        SqlSession session = null;
        try {
            SqlSessionFactory aidaSessionFactory = ProspettoSessionFactory.getSessionFactory();
            session = aidaSessionFactory.openSession();
            result= session.selectOne("getTelelivelli",codiceAccise);
        } catch (Exception e) {
            throw e;

        } finally {
            if (session != null) {
                session.close();
            }
        }
        return  result;
    }
}

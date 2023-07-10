package it.exolab.prospetto.dataaccess;

import it.exolab.prospetto.dto.CriterioRicerca;
import it.exolab.prospetto.factory.ProspettoSessionFactory;

import it.exolab.prospetto.models.Giacenza;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class CommonDataAccessImpl implements CommonDataAccess{
    @Override
    public List<Giacenza> getGiacenze(CriterioRicerca criterioRicerca) throws Exception {

        List<Giacenza> giacenze = new ArrayList<Giacenza>();

        SqlSession session = null;
        try {
            SqlSessionFactory aidaSessionFactory = ProspettoSessionFactory.getSessionFactory();
            session = aidaSessionFactory.openSession();
            giacenze = session.selectList("getGiacenze", criterioRicerca);

        } catch (Exception e) {
            throw e;

        } finally {
            if (session != null) {
                session.close();
            }
        }

        return giacenze;
    }

    @Override
    public Date getDataRimanenza(CriterioRicerca criterioRicercaDTO) throws Exception {

        Date dataRimanenza = null;
        SqlSession session = null;
        try {
            SqlSessionFactory aidaSessionFactory = ProspettoSessionFactory.getSessionFactory();
            session = aidaSessionFactory.openSession();
            dataRimanenza = session.selectOne("getDataRimanenza", criterioRicercaDTO);

        } catch (Exception e) {
            throw e;

        } finally {
            if (session != null) {
                session.close();
            }
        }

        return dataRimanenza;
    }

}

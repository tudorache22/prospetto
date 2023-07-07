package it.exolab.prospetto.dataaccess;

import it.exolab.prospetto.dto.CriterioRicercaDTO;
import it.exolab.prospetto.factory.ProspettoSessionFactory;
import models.Giacenza;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class CommonDataAccessImpl implements CommonDataAccess{
    @Override
    public List<Giacenza> getGiacenze(CriterioRicercaDTO criterioRicercaDTO) throws Exception {

        List<Giacenza> giacenze = new ArrayList<Giacenza>();

        SqlSession session = null;
        try {
            SqlSessionFactory aidaSessionFactory = ProspettoSessionFactory.getSessionFactory();
            session = aidaSessionFactory.openSession();
            giacenze = session.selectList("getGiacenze", criterioRicercaDTO);

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
    public Date getDataRimanenza(CriterioRicercaDTO criterioRicercaDTO) throws Exception {

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

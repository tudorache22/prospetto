package it.exolab.prospetto.mapper;

import it.exolab.prospetto.common.ResultColumn;
import it.exolab.prospetto.dto.CriterioRicerca;
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
    public ResultColumn calcolaGiacenza(CriterioRicerca criterio) {
        return null;
    }

    @Override
    public List<Giacenza> getGiacenze(CriterioRicerca criterio) throws IOException {
        List<Giacenza> giacenze = new ArrayList<Giacenza>();

        SqlSession session = null;
        try {
            SqlSessionFactory aidaSessionFactory = ProspettoSessionFactory.getSessionFactory();
            session = aidaSessionFactory.openSession();
            giacenze = session.selectList("getGiacenze", criterio);

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
    public java.sql.Date getDataRimanenza(CriterioRicerca criterio) throws IOException {
        Date dataRimanenza = null;
        SqlSession session = null;
        try {
            SqlSessionFactory aidaSessionFactory = ProspettoSessionFactory.getSessionFactory();
            session = aidaSessionFactory.openSession();
            dataRimanenza = session.selectOne("getDataRimanenza", criterio);

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

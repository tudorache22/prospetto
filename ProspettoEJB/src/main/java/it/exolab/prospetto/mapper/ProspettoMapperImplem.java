package it.exolab.prospetto.mapper;


import it.exolab.prospetto.dto.ProspettoDTO;
import it.exolab.prospetto.enums.RigaRiferimento;
import it.exolab.prospetto.factory.ProspettoSessionFactory;
import it.exolab.prospetto.models.*;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;

import java.util.List;

public class ProspettoMapperImplem implements ProspettoMapper{

    @Override
    public ProspettoDTO calcolaProspetto(CriterioRicerca criterio) {
        SqlSession session = null;
        ProspettoDTO result=new ProspettoDTO();
        try{
            SqlSessionFactory prospettoSessionFactory= ProspettoSessionFactory.getSessionFactory();
            session=prospettoSessionFactory.openSession();
            criterio.setRigaRiferimento(RigaRiferimento.RIMANENZA);
            criterio.setCountColonne((CountColonne) session.selectOne("countRiga",criterio));
            result.setRimanenza((ResultRow) session.selectOne("calcolaRiga",criterio));

            criterio.setRigaRiferimento(RigaRiferimento.ECCEDENZE_1);
            criterio.setCountColonne((CountColonne) session.selectOne("countRiga",criterio));
            result.setEccedenzeAnnotate1((ResultRow) session.selectOne("calcolaRiga",criterio));

            criterio.setRigaRiferimento(RigaRiferimento.ECCEDENZE_2);
            criterio.setCountColonne((CountColonne) session.selectOne("countRiga",criterio));
            result.setEccedenzeAnnotate2((ResultRow) session.selectOne("calcolaRiga",criterio));

            criterio.setRigaRiferimento(RigaRiferimento.ECCEDENZE_3);
            criterio.setCountColonne((CountColonne) session.selectOne("countRiga",criterio));
            result.setEccedenzeAnnotate3((ResultRow) session.selectOne("calcolaRiga",criterio));

            criterio.setRigaRiferimento(RigaRiferimento.ECCEDENZE_4);
            criterio.setCountColonne((CountColonne) session.selectOne("countRiga",criterio));
            result.setEccedenzeAnnotate4((ResultRow) session.selectOne("calcolaRiga",criterio));

            criterio.setRigaRiferimento(RigaRiferimento.EROGATO);
            criterio.setCountColonne((CountColonne) session.selectOne("countRiga",criterio));
            result.setErogato((ResultRow) session.selectOne("calcolaRiga",criterio));

            criterio.setRigaRiferimento(RigaRiferimento.CALI_ANNOTATI_1);
            criterio.setCountColonne((CountColonne) session.selectOne("countRiga",criterio));
            result.setCaliAnnotati1((ResultRow) session.selectOne("calcolaRiga",criterio));

            criterio.setRigaRiferimento(RigaRiferimento.CALI_ANNOTATI_2);
            criterio.setCountColonne((CountColonne) session.selectOne("countRiga",criterio));
            result.setCaliAnnotati1((ResultRow) session.selectOne("calcolaRiga",criterio));

            criterio.setRigaRiferimento(RigaRiferimento.CALI_ANNOTATI_3);
            criterio.setCountColonne((CountColonne) session.selectOne("countRiga",criterio));
            result.setCaliAnnotati1((ResultRow) session.selectOne("calcolaRiga",criterio));

            criterio.setRigaRiferimento(RigaRiferimento.CALI_ANNOTATI_4);
            criterio.setCountColonne((CountColonne) session.selectOne("countRiga",criterio));
            result.setCaliAnnotati1((ResultRow) session.selectOne("calcolaRiga",criterio));

            criterio.setRigaRiferimento(RigaRiferimento.RIMANENZA_CONTABILE);
            criterio.setCountColonne((CountColonne) session.selectOne("countRiga",criterio));
            result.setRimanenzaContabile((ResultRow) session.selectOne("calcolaRiga",criterio));


        }
        catch (Exception e){
            e.printStackTrace();
        }
        finally {
            if(session!=null){
            session.close();
            }
        }
        return  result;
    }

    @Override
    public DataRimanenzaRow calcolaDataRimanenza(CriterioRicerca criterio) {
        SqlSession session = null;
        DataRimanenzaRow result=null;

        try {
            SqlSessionFactory prospettoSessionFactory= ProspettoSessionFactory.getSessionFactory();
            session=prospettoSessionFactory.openSession();
            result= session.selectOne("calcolaDataRimanenza",criterio);
        }
        catch (Exception e){
            e.printStackTrace();
        }
        finally {
            if(session != null){
                session.close();
            }
        }
        return result;
    }

    @Override
    public ResultRow calcolaRimanenza(CriterioRicerca criterio) {
        SqlSession session = null;
        ResultRow result= null;

        try {
            SqlSessionFactory prospettoSessionFactory= ProspettoSessionFactory.getSessionFactory();
            session=prospettoSessionFactory.openSession();

            criterio.setRigaRiferimento(RigaRiferimento.RIMANENZA);
            criterio.setCountColonne((CountColonne) session.selectOne("countRiga",criterio));
            result=session.selectOne("calcolaRiga",criterio);
        }
        catch (Exception e){
            e.printStackTrace();
        }
        finally {
            if(session != null){
                session.close();
            }
        }
        return result;
    }

    @Override
    public ResultRow calcolaIntrodotto(CriterioRicerca criterio) {
        SqlSession session = null;
        ResultRow result= null;

        try {
            SqlSessionFactory prospettoSessionFactory= ProspettoSessionFactory.getSessionFactory();
            session=prospettoSessionFactory.openSession();

            criterio.setRigaRiferimento(RigaRiferimento.INTRODOTTO);
            criterio.setCountColonne((CountColonne) session.selectOne("countRiga",criterio));
            result=session.selectOne("calcolaRiga",criterio);
        }
        catch (Exception e){
            e.printStackTrace();
        }
        finally {
            if(session != null){
                session.close();
            }
        }
        return result;
    }

    @Override
    public ResultRow calcolaEccedenze1(CriterioRicerca criterio) {
        SqlSession session = null;
        ResultRow result= null;

        try {
            SqlSessionFactory prospettoSessionFactory= ProspettoSessionFactory.getSessionFactory();
            session=prospettoSessionFactory.openSession();

            criterio.setRigaRiferimento(RigaRiferimento.ECCEDENZE_1);
            criterio.setCountColonne((CountColonne) session.selectOne("countRiga",criterio));
            result=session.selectOne("calcolaRiga",criterio);
        }
        catch (Exception e){
            e.printStackTrace();
        }
        finally {
            if(session != null){
                session.close();
            }
        }
        return result;
    }

    @Override
    public ResultRow calcolaEccedenze2(CriterioRicerca criterio) {
        SqlSession session = null;
        ResultRow result= null;

        try {
            SqlSessionFactory prospettoSessionFactory= ProspettoSessionFactory.getSessionFactory();
            session=prospettoSessionFactory.openSession();

            criterio.setRigaRiferimento(RigaRiferimento.ECCEDENZE_2);
            criterio.setCountColonne((CountColonne) session.selectOne("countRiga",criterio));
            result=session.selectOne("calcolaRiga",criterio);
        }
        catch (Exception e){
            e.printStackTrace();
        }
        finally {
            if(session != null){
                session.close();
            }
        }
        return result;
    }

    @Override
    public ResultRow calcolaEccedenze3(CriterioRicerca criterio) {
        SqlSession session = null;
        ResultRow result= null;

        try {
            SqlSessionFactory prospettoSessionFactory= ProspettoSessionFactory.getSessionFactory();
            session=prospettoSessionFactory.openSession();

            criterio.setRigaRiferimento(RigaRiferimento.ECCEDENZE_3);
            criterio.setCountColonne((CountColonne) session.selectOne("countRiga",criterio));
            result=session.selectOne("calcolaRiga",criterio);
        }
        catch (Exception e){
            e.printStackTrace();
        }
        finally {
            if(session != null){
                session.close();
            }
        }
        return result;
    }

    @Override
    public ResultRow calcolaEccedenze4(CriterioRicerca criterio) {
        SqlSession session = null;
        ResultRow result= null;

        try {
            SqlSessionFactory prospettoSessionFactory= ProspettoSessionFactory.getSessionFactory();
            session=prospettoSessionFactory.openSession();

            criterio.setRigaRiferimento(RigaRiferimento.ECCEDENZE_4);
            criterio.setCountColonne((CountColonne) session.selectOne("countRiga",criterio));
            result=session.selectOne("calcolaRiga",criterio);
        }
        catch (Exception e){
            e.printStackTrace();
        }
        finally {
            if(session != null){
                session.close();
            }
        }
        return result;
    }

    @Override
    public ResultRow calcolaErogato(CriterioRicerca criterio) {
        SqlSession session = null;
        ResultRow result= null;

        try {
            SqlSessionFactory prospettoSessionFactory= ProspettoSessionFactory.getSessionFactory();
            session=prospettoSessionFactory.openSession();

            criterio.setRigaRiferimento(RigaRiferimento.EROGATO);
            criterio.setCountColonne((CountColonne) session.selectOne("countRiga",criterio));
            result=session.selectOne("calcolaRiga",criterio);
        }
        catch (Exception e){
            e.printStackTrace();
        }
        finally {
            if(session != null){
                session.close();
            }
        }
        return result;
    }

    @Override
    public ResultRow calcolaCaliAnnotati1(CriterioRicerca criterio) {
        SqlSession session = null;
        ResultRow result= null;

        try {
            SqlSessionFactory prospettoSessionFactory= ProspettoSessionFactory.getSessionFactory();
            session=prospettoSessionFactory.openSession();

            criterio.setRigaRiferimento(RigaRiferimento.CALI_ANNOTATI_1);
            criterio.setCountColonne((CountColonne) session.selectOne("countRiga",criterio));
            result=session.selectOne("calcolaRiga",criterio);
        }
        catch (Exception e){
            e.printStackTrace();
        }
        finally {
            if(session != null){
                session.close();
            }
        }
        return result;
    }

    @Override
    public ResultRow calcolaCaliAnnotati2(CriterioRicerca criterio) {
        SqlSession session = null;
        ResultRow result= null;

        try {
            SqlSessionFactory prospettoSessionFactory= ProspettoSessionFactory.getSessionFactory();
            session=prospettoSessionFactory.openSession();

            criterio.setRigaRiferimento(RigaRiferimento.CALI_ANNOTATI_2);
            criterio.setCountColonne((CountColonne) session.selectOne("countRiga",criterio));
            result=session.selectOne("calcolaRiga",criterio);
        }
        catch (Exception e){
            e.printStackTrace();
        }
        finally {
            if(session != null){
                session.close();
            }
        }
        return result;
    }

    @Override
    public ResultRow calcolaCaliAnnotati3(CriterioRicerca criterio) {
        SqlSession session = null;
        ResultRow result= null;

        try {
            SqlSessionFactory prospettoSessionFactory= ProspettoSessionFactory.getSessionFactory();
            session=prospettoSessionFactory.openSession();

            criterio.setRigaRiferimento(RigaRiferimento.CALI_ANNOTATI_3);
            criterio.setCountColonne((CountColonne) session.selectOne("countRiga",criterio));
            result=session.selectOne("calcolaRiga",criterio);
        }
        catch (Exception e){
            e.printStackTrace();
        }
        finally {
            if(session != null){
                session.close();
            }
        }
        return result;
    }

    @Override
    public ResultRow calcolaCaliAnnotati4(CriterioRicerca criterio) {
        SqlSession session = null;
        ResultRow result= null;

        try {
            SqlSessionFactory prospettoSessionFactory= ProspettoSessionFactory.getSessionFactory();
            session=prospettoSessionFactory.openSession();

            criterio.setRigaRiferimento(RigaRiferimento.CALI_ANNOTATI_4);
            criterio.setCountColonne((CountColonne) session.selectOne("countRiga",criterio));
            result=session.selectOne("calcolaRiga",criterio);
        }
        catch (Exception e){
            e.printStackTrace();
        }
        finally {
            if(session != null){
                session.close();
            }
        }
        return result;
    }

    @Override
    public ResultRow calcolaRimanenzaContabile(CriterioRicerca criterio) {
        SqlSession session = null;
        ResultRow result= null;

        try {
            SqlSessionFactory prospettoSessionFactory= ProspettoSessionFactory.getSessionFactory();
            session=prospettoSessionFactory.openSession();

            criterio.setRigaRiferimento(RigaRiferimento.RIMANENZA_CONTABILE);
            criterio.setCountColonne((CountColonne) session.selectOne("countRiga",criterio));
            result=session.selectOne("calcolaRiga",criterio);
        }
        catch (Exception e){
            e.printStackTrace();
        }
        finally {
            if(session != null){
                session.close();
            }
        }
        return result;
    }

    @Override
    public List<GiacenzaCriterio> getGiacenze(CriterioRicerca criterio) {
        SqlSession session = null;
        List<GiacenzaCriterio> results= null;

        try {
            SqlSessionFactory prospettoSessionFactory= ProspettoSessionFactory.getSessionFactory();
            session=prospettoSessionFactory.openSession();

            results=session.selectList("getGiacenze",criterio);
        }
        catch (Exception e){
            e.printStackTrace();
        }
        finally {
            if(session != null){
                session.close();
            }
        }
        return results;
    }
}

package mapper;

import bean.CriterioRicerca;
import bean.DataRimanenzaBean;
import bean.GiacenzaBean;
import bean.ResultBean;
import dto.ProspettoDTO;
import enums.RigaRiferimento;
import factory.ProspettoSessionFactory;
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
            criterio.setCountBean(session.selectOne("countRiga",criterio));
            result.setRimanenza(session.selectOne("calcolaRiga",criterio));

            criterio.setRigaRiferimento(RigaRiferimento.ECCEDENZE_1);
            criterio.setCountBean(session.selectOne("countRiga",criterio));
            result.setEccedenzeAnnotate1(session.selectOne("calcolaRiga",criterio));

            criterio.setRigaRiferimento(RigaRiferimento.ECCEDENZE_2);
            criterio.setCountBean(session.selectOne("countRiga",criterio));
            result.setEccedenzeAnnotate2(session.selectOne("calcolaRiga",criterio));

            criterio.setRigaRiferimento(RigaRiferimento.ECCEDENZE_3);
            criterio.setCountBean(session.selectOne("countRiga",criterio));
            result.setEccedenzeAnnotate3(session.selectOne("calcolaRiga",criterio));

            criterio.setRigaRiferimento(RigaRiferimento.ECCEDENZE_4);
            criterio.setCountBean(session.selectOne("countRiga",criterio));
            result.setEccedenzeAnnotate4(session.selectOne("calcolaRiga",criterio));

            criterio.setRigaRiferimento(RigaRiferimento.EROGATO);
            criterio.setCountBean(session.selectOne("countRiga",criterio));
            result.setErogato(session.selectOne("calcolaRiga",criterio));

            criterio.setRigaRiferimento(RigaRiferimento.CALI_ANNOTATI_1);
            criterio.setCountBean(session.selectOne("countRiga",criterio));
            result.setCaliAnnotati1(session.selectOne("calcolaRiga",criterio));

            criterio.setRigaRiferimento(RigaRiferimento.CALI_ANNOTATI_2);
            criterio.setCountBean(session.selectOne("countRiga",criterio));
            result.setCaliAnnotati1(session.selectOne("calcolaRiga",criterio));

            criterio.setRigaRiferimento(RigaRiferimento.CALI_ANNOTATI_3);
            criterio.setCountBean(session.selectOne("countRiga",criterio));
            result.setCaliAnnotati1(session.selectOne("calcolaRiga",criterio));

            criterio.setRigaRiferimento(RigaRiferimento.CALI_ANNOTATI_4);
            criterio.setCountBean(session.selectOne("countRiga",criterio));
            result.setCaliAnnotati1(session.selectOne("calcolaRiga",criterio));

            criterio.setRigaRiferimento(RigaRiferimento.RIMANENZA_CONTABILE);
            criterio.setCountBean(session.selectOne("countRiga",criterio));
            result.setRimanenzaContabile(session.selectOne("calcolaRiga",criterio));


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
    public DataRimanenzaBean calcolaDataRimanenza(CriterioRicerca criterio) {
        SqlSession session = null;
        DataRimanenzaBean result=null;

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
    public ResultBean calcolaRimanenza(CriterioRicerca criterio) {
        SqlSession session = null;
        ResultBean result= null;

        try {
            SqlSessionFactory prospettoSessionFactory= ProspettoSessionFactory.getSessionFactory();
            session=prospettoSessionFactory.openSession();

            criterio.setRigaRiferimento(RigaRiferimento.RIMANENZA);
            criterio.setCountBean(session.selectOne("countRiga",criterio));
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
    public ResultBean calcolaIntrodotto(CriterioRicerca criterio) {
        SqlSession session = null;
        ResultBean result= null;

        try {
            SqlSessionFactory prospettoSessionFactory= ProspettoSessionFactory.getSessionFactory();
            session=prospettoSessionFactory.openSession();

            criterio.setRigaRiferimento(RigaRiferimento.INTRODOTTO);
            criterio.setCountBean(session.selectOne("countRiga",criterio));
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
    public ResultBean calcolaEccedenze1(CriterioRicerca criterio) {
        SqlSession session = null;
        ResultBean result= null;

        try {
            SqlSessionFactory prospettoSessionFactory= ProspettoSessionFactory.getSessionFactory();
            session=prospettoSessionFactory.openSession();

            criterio.setRigaRiferimento(RigaRiferimento.ECCEDENZE_1);
            criterio.setCountBean(session.selectOne("countRiga",criterio));
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
    public ResultBean calcolaEccedenze2(CriterioRicerca criterio) {
        SqlSession session = null;
        ResultBean result= null;

        try {
            SqlSessionFactory prospettoSessionFactory= ProspettoSessionFactory.getSessionFactory();
            session=prospettoSessionFactory.openSession();

            criterio.setRigaRiferimento(RigaRiferimento.ECCEDENZE_2);
            criterio.setCountBean(session.selectOne("countRiga",criterio));
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
    public ResultBean calcolaEccedenze3(CriterioRicerca criterio) {
        SqlSession session = null;
        ResultBean result= null;

        try {
            SqlSessionFactory prospettoSessionFactory= ProspettoSessionFactory.getSessionFactory();
            session=prospettoSessionFactory.openSession();

            criterio.setRigaRiferimento(RigaRiferimento.ECCEDENZE_3);
            criterio.setCountBean(session.selectOne("countRiga",criterio));
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
    public ResultBean calcolaEccedenze4(CriterioRicerca criterio) {
        SqlSession session = null;
        ResultBean result= null;

        try {
            SqlSessionFactory prospettoSessionFactory= ProspettoSessionFactory.getSessionFactory();
            session=prospettoSessionFactory.openSession();

            criterio.setRigaRiferimento(RigaRiferimento.ECCEDENZE_4);
            criterio.setCountBean(session.selectOne("countRiga",criterio));
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
    public ResultBean calcolaErogato(CriterioRicerca criterio) {
        SqlSession session = null;
        ResultBean result= null;

        try {
            SqlSessionFactory prospettoSessionFactory= ProspettoSessionFactory.getSessionFactory();
            session=prospettoSessionFactory.openSession();

            criterio.setRigaRiferimento(RigaRiferimento.EROGATO);
            criterio.setCountBean(session.selectOne("countRiga",criterio));
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
    public ResultBean calcolaCaliAnnotati1(CriterioRicerca criterio) {
        SqlSession session = null;
        ResultBean result= null;

        try {
            SqlSessionFactory prospettoSessionFactory= ProspettoSessionFactory.getSessionFactory();
            session=prospettoSessionFactory.openSession();

            criterio.setRigaRiferimento(RigaRiferimento.CALI_ANNOTATI_1);
            criterio.setCountBean(session.selectOne("countRiga",criterio));
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
    public ResultBean calcolaCaliAnnotati2(CriterioRicerca criterio) {
        SqlSession session = null;
        ResultBean result= null;

        try {
            SqlSessionFactory prospettoSessionFactory= ProspettoSessionFactory.getSessionFactory();
            session=prospettoSessionFactory.openSession();

            criterio.setRigaRiferimento(RigaRiferimento.CALI_ANNOTATI_2);
            criterio.setCountBean(session.selectOne("countRiga",criterio));
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
    public ResultBean calcolaCaliAnnotati3(CriterioRicerca criterio) {
        SqlSession session = null;
        ResultBean result= null;

        try {
            SqlSessionFactory prospettoSessionFactory= ProspettoSessionFactory.getSessionFactory();
            session=prospettoSessionFactory.openSession();

            criterio.setRigaRiferimento(RigaRiferimento.CALI_ANNOTATI_3);
            criterio.setCountBean(session.selectOne("countRiga",criterio));
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
    public ResultBean calcolaCaliAnnotati4(CriterioRicerca criterio) {
        SqlSession session = null;
        ResultBean result= null;

        try {
            SqlSessionFactory prospettoSessionFactory= ProspettoSessionFactory.getSessionFactory();
            session=prospettoSessionFactory.openSession();

            criterio.setRigaRiferimento(RigaRiferimento.CALI_ANNOTATI_4);
            criterio.setCountBean(session.selectOne("countRiga",criterio));
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
    public ResultBean calcolaRimanenzaContabile(CriterioRicerca criterio) {
        SqlSession session = null;
        ResultBean result= null;

        try {
            SqlSessionFactory prospettoSessionFactory= ProspettoSessionFactory.getSessionFactory();
            session=prospettoSessionFactory.openSession();

            criterio.setRigaRiferimento(RigaRiferimento.RIMANENZA_CONTABILE);
            criterio.setCountBean(session.selectOne("countRiga",criterio));
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
    public List<GiacenzaBean> getGiacenze(CriterioRicerca criterio) {
        SqlSession session = null;
        List<GiacenzaBean> results= null;

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

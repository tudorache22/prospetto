package controller;


import bean.ResultBean;
import dto.ProspettoDTO;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class ManageTotaleCampo {

    public void setTotaleCarico(ProspettoDTO dto) throws Exception {
        ResultBean caricoTotale= new ResultBean();
        setRigheCarico(dto,caricoTotale,"RisultatoBenzina");
        setRigheCarico(dto,caricoTotale,"RisultatoGasolio");
        setRigheCarico(dto,caricoTotale,"RisultatoOlio");
        setRigheCarico(dto,caricoTotale,"RisultatoGpl");

        dto.setCaricoTotale(caricoTotale);
    }

    public void setTotaleScarico(ProspettoDTO dto) throws Exception{
        ResultBean scaricoTotale= new ResultBean();
        setRigheScarico(dto,scaricoTotale,"RisultatoBenzina");
        setRigheScarico(dto,scaricoTotale,"RisultatoGasolio");
        setRigheScarico(dto,scaricoTotale,"RisultatoOlio");
        setRigheScarico(dto,scaricoTotale,"RisultatoGpl");

        dto.setTotaleScarico(scaricoTotale);
    }

    public void setRigheCarico(ProspettoDTO dto,ResultBean riga ,String metodo) throws Exception {
        String metodoGet= "get"+metodo;
        String metodoSet= "set"+metodo;

        if(metodo.equals("RisultatoBenzina") || metodo.equals("RisultatoGasolio")) {

            //ESEMPIO: setRisultatoBenzina1 (sumRigheCarico(dto, "getRisultatoBenzina1")
            Method setValore = riga.getClass().getMethod(metodoSet.concat("1"), Double.class);
            setValore.invoke(riga, sumRigheCarico(dto, metodoGet.concat("1")));

            setValore = riga.getClass().getMethod(metodoSet.concat("2"), Double.class);
            setValore.invoke(riga, sumRigheCarico(dto, metodoGet.concat("2")));

            setValore = riga.getClass().getMethod(metodoSet.concat("3"), Double.class);
            setValore.invoke(riga, sumRigheCarico(dto, metodoGet.concat("3")));

            setValore = riga.getClass().getMethod(metodoSet.concat("4"), Double.class);
            setValore.invoke(riga, sumRigheCarico(dto, metodoGet.concat("4")));

            setValore = riga.getClass().getMethod(metodoSet.concat("5"), Double.class);
            setValore.invoke(riga, sumRigheCarico(dto, metodoGet.concat("5")));

            setValore = riga.getClass().getMethod(metodoSet.concat("Altro"), Double.class);
            setValore.invoke(riga, sumRigheCarico(dto, metodoGet.concat("Altro")));

            setValore = riga.getClass().getMethod(metodoSet.concat("Tot"), Double.class);
            setValore.invoke(riga, sumRigheCarico(dto, metodoGet.concat("Tot")));

        }
        else{
            Method setValore = riga.getClass().getMethod(metodoSet, Double.class);
            setValore.invoke(riga, sumRigheCarico(dto, metodoGet));
        }
    }

    public void setRigheScarico(ProspettoDTO dto,ResultBean riga,String metodo) throws Exception{
        String metodoGet= "get"+metodo;
        String metodoSet= "set"+metodo;

        if(metodo.equals("RisultatoBenzina") || metodo.equals("RisultatoGasolio")) {

            //ESEMPIO: setRisultatoBenzina1 (sumRigheScarico(dto, "getRisultatoBenzina1")
            Method setValore = riga.getClass().getMethod(metodoSet.concat("1"), Double.class);
            setValore.invoke(riga, sumRigheScarico(dto, metodoGet.concat("1")));

            setValore = riga.getClass().getMethod(metodoSet.concat("2"), Double.class);
            setValore.invoke(riga, sumRigheScarico(dto, metodoGet.concat("2")));

            setValore = riga.getClass().getMethod(metodoSet.concat("3"), Double.class);
            setValore.invoke(riga, sumRigheScarico(dto, metodoGet.concat("3")));

            setValore = riga.getClass().getMethod(metodoSet.concat("4"), Double.class);
            setValore.invoke(riga, sumRigheScarico(dto, metodoGet.concat("4")));

            setValore = riga.getClass().getMethod(metodoSet.concat("5"), Double.class);
            setValore.invoke(riga, sumRigheScarico(dto, metodoGet.concat("5")));

            setValore = riga.getClass().getMethod(metodoSet.concat("Altro"), Double.class);
            setValore.invoke(riga, sumRigheScarico(dto, metodoGet.concat("Altro")));

            setValore = riga.getClass().getMethod(metodoSet.concat("Tot"), Double.class);
            setValore.invoke(riga, sumRigheScarico(dto, metodoGet.concat("Tot")));

        }
        else{
            Method setValore = riga.getClass().getMethod(metodoSet, Double.class);
            setValore.invoke(riga, sumRigheScarico(dto, metodoGet));
        }
    }


    public Double sumRigheCarico(ProspettoDTO dto,String metodo) throws NoSuchMethodException, InvocationTargetException, IllegalAccessException {
        Double somma=0d;
        Double valore=0d;

        Method getValoreCampo= dto.getRimanenza().getClass().getMethod(metodo);
        valore= (Double) getValoreCampo.invoke(dto.getRimanenza());
        if(valore != null){
            somma=somma+valore;
        }
        valore= (Double) getValoreCampo.invoke(dto.getIntrodotto());
        if(valore != null){
            somma=somma+valore;
        }
        valore= (Double) getValoreCampo.invoke(dto.getEccedenzeAnnotate1());
        if(valore != null){
            somma=somma+valore;
        }
        valore= (Double) getValoreCampo.invoke(dto.getEccedenzeAnnotate2());
        if(valore != null){
            somma=somma+valore;
        }
        valore= (Double) getValoreCampo.invoke(dto.getEccedenzeAnnotate3());
        if(valore != null){
            somma=somma+valore;
        }
        valore= (Double) getValoreCampo.invoke(dto.getEccedenzeAnnotate4());
        if(valore != null){
            somma=somma+valore;
        }

        return somma;

    }

    public Double sumRigheScarico(ProspettoDTO dto,String metodo) throws Exception {
        Double somma=0d;
        Double valore=0d;

        Method getValoreCampo= dto.getRimanenza().getClass().getMethod(metodo);
        valore= (Double) getValoreCampo.invoke(dto.getErogato());
        if(valore != null){
            somma=somma+valore;
        }
        valore= (Double) getValoreCampo.invoke(dto.getCaliAnnotati1());
        if(valore != null){
            somma=somma+valore;
        }
        valore= (Double) getValoreCampo.invoke(dto.getCaliAnnotati2());
        if(valore != null){
            somma=somma+valore;
        }
        valore= (Double) getValoreCampo.invoke(dto.getCaliAnnotati3());
        if(valore != null){
            somma=somma+valore;
        }
        valore= (Double) getValoreCampo.invoke(dto.getCaliAnnotati4());
        if(valore != null){
            somma=somma+valore;
        }

        return somma;
    }

    public void setCampoTot(ProspettoDTO dto) throws Exception {
        dto.getRimanenza().setRisultatoBenzinaTot(sumCampoTot(dto.getRimanenza(),"getRisultatoBenzina"));
        dto.getRimanenza().setRisultatoGasolioTot(sumCampoTot(dto.getRimanenza(),"getRisultatoGasolio"));

        dto.getIntrodotto().setRisultatoBenzinaTot(sumCampoTot(dto.getIntrodotto(),"getRisultatoBenzina"));
        dto.getIntrodotto().setRisultatoGasolioTot(sumCampoTot(dto.getIntrodotto(),"getRisultatoGasolio"));

        dto.getEccedenzeAnnotate1().setRisultatoBenzinaTot(sumCampoTot(dto.getEccedenzeAnnotate1(),"getRisultatoBenzina"));
        dto.getEccedenzeAnnotate1().setRisultatoGasolioTot(sumCampoTot(dto.getEccedenzeAnnotate1(),"getRisultatoGasolio"));

        dto.getEccedenzeAnnotate2().setRisultatoBenzinaTot(sumCampoTot(dto.getEccedenzeAnnotate2(),"getRisultatoBenzina"));
        dto.getEccedenzeAnnotate2().setRisultatoGasolioTot(sumCampoTot(dto.getEccedenzeAnnotate2(),"getRisultatoGasolio"));

        dto.getEccedenzeAnnotate3().setRisultatoBenzinaTot(sumCampoTot(dto.getEccedenzeAnnotate3(),"getRisultatoBenzina"));
        dto.getEccedenzeAnnotate3().setRisultatoGasolioTot(sumCampoTot(dto.getEccedenzeAnnotate3(),"getRisultatoGasolio"));

        dto.getEccedenzeAnnotate4().setRisultatoBenzinaTot(sumCampoTot(dto.getEccedenzeAnnotate4(),"getRisultatoBenzina"));
        dto.getEccedenzeAnnotate4().setRisultatoGasolioTot(sumCampoTot(dto.getEccedenzeAnnotate4(),"getRisultatoGasolio"));

        dto.getErogato().setRisultatoBenzinaTot(sumCampoTot(dto.getErogato(),"getRisultatoBenzina"));
        dto.getErogato().setRisultatoGasolioTot(sumCampoTot(dto.getErogato(),"getRisultatoGasolio"));

        dto.getCaliAnnotati1().setRisultatoBenzinaTot(sumCampoTot(dto.getCaliAnnotati1(),"getRisultatoBenzina"));
        dto.getCaliAnnotati1().setRisultatoGasolioTot(sumCampoTot(dto.getCaliAnnotati1(),"getRisultatoGasolio"));

        dto.getCaliAnnotati2().setRisultatoBenzinaTot(sumCampoTot(dto.getCaliAnnotati2(),"getRisultatoBenzina"));
        dto.getCaliAnnotati2().setRisultatoGasolioTot(sumCampoTot(dto.getCaliAnnotati2(),"getRisultatoGasolio"));

        dto.getCaliAnnotati3().setRisultatoBenzinaTot(sumCampoTot(dto.getCaliAnnotati3(),"getRisultatoBenzina"));
        dto.getCaliAnnotati3().setRisultatoGasolioTot(sumCampoTot(dto.getCaliAnnotati3(),"getRisultatoGasolio"));

        dto.getCaliAnnotati4().setRisultatoBenzinaTot(sumCampoTot(dto.getCaliAnnotati4(),"getRisultatoBenzina"));
        dto.getCaliAnnotati4().setRisultatoGasolioTot(sumCampoTot(dto.getCaliAnnotati4(),"getRisultatoGasolio"));

        dto.getRimanenzaContabile().setRisultatoBenzinaTot(sumCampoTot(dto.getRimanenzaContabile(),"getRisultatoBenzina"));
        dto.getRimanenzaContabile().setRisultatoGasolioTot(sumCampoTot(dto.getRimanenzaContabile(),"getRisultatoGasolio"));

    }

    public Double sumCampoTot(ResultBean riga,String metodo) throws Exception {
        Double tot=0d;
        Double valore=0d;

        Method metodoGet= riga.getClass().getMethod(metodo.concat("1"));
        valore= (Double) metodoGet.invoke(riga);
        if(valore != null){
            tot=tot+valore;
        }

        metodoGet= riga.getClass().getMethod(metodo.concat("2"));
        valore= (Double) metodoGet.invoke(riga);
        if(valore != null){
            tot=tot+valore;
        }

        metodoGet= riga.getClass().getMethod(metodo.concat("3"));
        valore= (Double) metodoGet.invoke(riga);
        if(valore != null){
            tot=tot+valore;
        }

        metodoGet= riga.getClass().getMethod(metodo.concat("4"));
        valore= (Double) metodoGet.invoke(riga);
        if(valore != null){
            tot=tot+valore;
        }

        metodoGet= riga.getClass().getMethod(metodo.concat("5"));
        valore= (Double) metodoGet.invoke(riga);
        if(valore != null){
            tot=tot+valore;
        }
        metodoGet= riga.getClass().getMethod(metodo.concat("Altro"));
        valore= (Double) metodoGet.invoke(riga);
        if(valore != null){
            tot=tot+valore;
        }
        return tot;
    }

}

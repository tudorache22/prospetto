package bean;

public class RigaProspetto {

    private Benzina benzina;
    private Gasolio gasolio;
    private Gpl gpl;
    private OliLubrificanti olioLubrificante;

    public Benzina getBenzina() {
        return benzina;
    }

    public void setBenzina(Benzina benzina) {
        this.benzina = benzina;
    }

    public Gasolio getGasolio() {
        return gasolio;
    }

    public void setGasolio(Gasolio gasolio) {
        this.gasolio = gasolio;
    }

    public Gpl getGpl() {
        return gpl;
    }

    public void setGpl(Gpl gpl) {
        this.gpl = gpl;
    }

    public OliLubrificanti getOlioLubrificante() {
        return olioLubrificante;
    }

    public void setOlioLubrificante(OliLubrificanti olioLubrificante) {
        this.olioLubrificante = olioLubrificante;
    }
}

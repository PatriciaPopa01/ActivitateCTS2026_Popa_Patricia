package ro.ase.cts.spital.buildersingleton.clase;

public class ProtocolUrgenta {
    private String tipUrgenta;
    private int nivelPrioritate;
    private int nrMedici;
    private int nrUnitatiSange;
    private int minute;

    public ProtocolUrgenta(String tipUrgenta, int nivelPrioritate, int nrMedici, int nrUnitatiSange, int minute) {
        this.tipUrgenta = tipUrgenta;
        this.nivelPrioritate = nivelPrioritate;
        this.nrMedici = nrMedici;
        this.nrUnitatiSange = nrUnitatiSange;
        this.minute = minute;
    }

    public void setTipUrgenta(String tipUrgenta) {
        this.tipUrgenta = tipUrgenta;
    }

    public void setNivelPrioritate(int nivelPrioritate) {
        this.nivelPrioritate = nivelPrioritate;
    }

    public void setNrMedici(int nrMedici) {
        this.nrMedici = nrMedici;
    }

    public void setNrUnitatiSange(int nrUnitatiSange) {
        this.nrUnitatiSange = nrUnitatiSange;
    }

    public void setMinute(int minute) {
        this.minute = minute;
    }

    public String getTipUrgenta() {
        return tipUrgenta;
    }

    public int getNivelPrioritate() {
        return nivelPrioritate;
    }

    public int getNrMedici() {
        return nrMedici;
    }

    public int getNrUnitatiSange() {
        return nrUnitatiSange;
    }

    public int getMinute() {
        return minute;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("ProtocolUrgenta{");
        sb.append("tipUrgenta='").append(tipUrgenta).append('\'');
        sb.append(", nivelPrioritate=").append(nivelPrioritate);
        sb.append(", nrMedici=").append(nrMedici);
        sb.append(", nrUnitatiSange=").append(nrUnitatiSange);
        sb.append(", minute=").append(minute);
        sb.append('}');
        return sb.toString();
    }
}

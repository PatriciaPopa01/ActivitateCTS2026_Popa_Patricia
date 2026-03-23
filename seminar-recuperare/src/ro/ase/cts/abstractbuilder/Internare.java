package ro.ase.cts.abstractbuilder;

public class Internare {
    private String numePacient;
    private boolean arePatRabatabil;
    private boolean arePapuci;
    private boolean areHalat;
    private boolean areMicDejun;

    public Internare(String numePacient, boolean arePatRabatabil, boolean arePapuci, boolean areHalat, boolean areMicDejun) {
        this.numePacient = numePacient;
        this.arePatRabatabil = arePatRabatabil;
        this.arePapuci = arePapuci;
        this.areHalat = areHalat;
        this.areMicDejun = areMicDejun;
    }

    public Internare() {
        this.numePacient = "";
        this.arePatRabatabil = false;
        this.arePapuci = false;
        this.areHalat = false;
        this.areMicDejun = false;
    }

    public void setNumePacient(String numePacient) {
        this.numePacient = numePacient;
    }

    public void setArePatRabatabil(boolean arePatRabatabil) {
        this.arePatRabatabil = arePatRabatabil;
    }

    public void setArePapuci(boolean arePapuci) {
        this.arePapuci = arePapuci;
    }

    public void setAreHalat(boolean areHalat) {
        this.areHalat = areHalat;
    }

    public void setAreMicDejun(boolean areMicDejun) {
        this.areMicDejun = areMicDejun;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Internare{");
        sb.append("numePacient='").append(numePacient).append('\'');
        sb.append(", arePatRabatabil=").append(arePatRabatabil);
        sb.append(", arePapuci=").append(arePapuci);
        sb.append(", areHalat=").append(areHalat);
        sb.append(", areMicDejun=").append(areMicDejun);
        sb.append('}');
        return sb.toString();
    }
}



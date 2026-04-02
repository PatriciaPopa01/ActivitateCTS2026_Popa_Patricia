package ro.ase.cts.restaurant.builder.clase;

public class Rezervare {
    private String numePersoana;
    private boolean areAsezareGeam;
    private boolean areScauneErgonomice;
    private boolean areMasaDecorata;
    private boolean areMuizaAmbientala;
    private TipMuzica genMuzica;

    public Rezervare() {
    }

    public void setNumePersoana(String numePersoana) {
        this.numePersoana = numePersoana;
    }

    public void setAreAsezareGeam(boolean areAsezareGeam) {
        this.areAsezareGeam = areAsezareGeam;
    }

    public void setAreScauneErgonomice(boolean areScauneErgonomice) {
        this.areScauneErgonomice = areScauneErgonomice;
    }

    public void setAreMasaDecorata(boolean areMasaDecorata) {
        this.areMasaDecorata = areMasaDecorata;
    }

    public void setAreMuizaAmbientala(boolean areMuizaAmbientala) {
        this.areMuizaAmbientala = areMuizaAmbientala;
    }

    public void setGenMuzica(TipMuzica genMuzica) {
        this.genMuzica = genMuzica;
    }

    public Rezervare(String numePersoana, boolean areAsezareGeam, boolean areScauneErgonomice, boolean areMasaDecorata, boolean areMuizaAmbientala, TipMuzica genMuzica) {
        this.numePersoana = numePersoana;
        this.areAsezareGeam = areAsezareGeam;
        this.areScauneErgonomice = areScauneErgonomice;
        this.areMasaDecorata = areMasaDecorata;
        this.areMuizaAmbientala = areMuizaAmbientala;
        this.genMuzica = genMuzica;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Rezervare{");
        sb.append("numePersoana='").append(numePersoana).append('\'');
        sb.append(", areAsezareGeam=").append(areAsezareGeam);
        sb.append(", areScauneErgonomice=").append(areScauneErgonomice);
        sb.append(", areMasaDecorata=").append(areMasaDecorata);
        sb.append(", areMuizaAmbientala=").append(areMuizaAmbientala);
        sb.append(", genMuzica=").append(genMuzica);
        sb.append('}');
        return sb.toString();
    }
}

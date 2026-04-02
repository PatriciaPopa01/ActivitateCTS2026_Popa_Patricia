package ro.ase.cts.restaurant.builder.clase;

public class BuilderRezervare implements AbstractBuilder {

    //private String numePersoana; //FARA ATRIBUTUL PE CARE IL DAI LA BUILD

    private boolean areAsezareGeam;
    private boolean areScauneErgonomice;
    private boolean areMasaDecorata;
    private boolean areMuizaAmbientala;
    private TipMuzica genMuzica;

    public BuilderRezervare() {
        this.areAsezareGeam=false;
        this.areScauneErgonomice=false;
        this.areMasaDecorata=false;
        this.areMuizaAmbientala=false;
        this.genMuzica=TipMuzica.CLASICA;
    }

    @Override
    public Rezervare build(String nume) {
        //return new Rezervare(nume,false,false,false,false,TipMuzica.CLASICA); //NU CU FALSE, CU ATRIBUTELE IN SINE
        return new Rezervare(nume,areAsezareGeam, areScauneErgonomice,areMasaDecorata,areMuizaAmbientala,genMuzica);
    }

    @Override
    public AbstractBuilder setareAsezareGeam(boolean areAsezareGeam) {
        this.areAsezareGeam=areAsezareGeam;
        return this;
    }

    @Override
    public AbstractBuilder setareScauneErgonomice(boolean areScauneErgonomice) {
        this.areScauneErgonomice=areScauneErgonomice;
        return this;
    }

    @Override
    public AbstractBuilder setareMasaDecorata(boolean areMasaDecorata) {
        this.areMasaDecorata=areMasaDecorata;
        return this;
    }

    @Override
    public AbstractBuilder setareMuizaAmbientala(boolean areMuizaAmbientala) {
        this.areMuizaAmbientala=areMuizaAmbientala;
        return this;
    }

    @Override
    public AbstractBuilder setgemMuzica(TipMuzica genMuzica) {
        this.genMuzica=genMuzica;
        return this;
    }
}

package ro.ase.cts.abstractbuilder;

public class InternareBuilder implements AbstractBuilder{

    private Internare internare;

    public InternareBuilder(String numePacient) {
        internare = new Internare(numePacient,false,false,false,false);
    }

    @Override
    public Internare build() {
        return this.internare;
    }

    @Override
    public AbstractBuilder setNume(String numePacient) {
        this.internare.setNumePacient(numePacient);
        return this;
    }

    @Override
    public AbstractBuilder setArePatRabatabil(boolean arePatRabatabil) {
        this.internare.setArePatRabatabil(arePatRabatabil);
        return this;
    }

    @Override
    public AbstractBuilder setArePapuci(boolean arePapuci) {
        this.internare.setArePapuci(arePapuci);
        return this;
    }

    @Override
    public AbstractBuilder setAreHalat(boolean areHalat) {
        this.internare.setAreHalat(areHalat);
        return this;
    }

    @Override
    public AbstractBuilder setAreMicDejun(boolean areMicDejun) {
        this.internare.setAreMicDejun(areMicDejun);
        return this;
    }
}

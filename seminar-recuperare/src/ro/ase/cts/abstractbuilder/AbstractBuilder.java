package ro.ase.cts.abstractbuilder;

public interface AbstractBuilder {
    Internare build();
    AbstractBuilder setNume(String numePacient);
    AbstractBuilder setArePatRabatabil(boolean arePatRabatabil);
    AbstractBuilder setArePapuci(boolean arePapuci);
    AbstractBuilder setAreHalat(boolean areHalat);
    AbstractBuilder setAreMicDejun(boolean areMicDejun);
}

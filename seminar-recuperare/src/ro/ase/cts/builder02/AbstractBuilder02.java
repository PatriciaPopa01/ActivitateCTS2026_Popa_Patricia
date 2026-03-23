package ro.ase.cts.builder02;

import ro.ase.cts.abstractbuilder.Internare;

public interface AbstractBuilder02 {
    Internare02 build(String nume);
    AbstractBuilder02 setArePatRabatabil(boolean arePatRabatabil);
    AbstractBuilder02 setArePapuci(boolean arePapuci);
    AbstractBuilder02 setAreHalat(boolean areHalat);
    AbstractBuilder02 setAreMicDejun(boolean areMicDejun);
}

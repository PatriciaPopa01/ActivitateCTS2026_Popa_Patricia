package ro.ase.cts.builder02;

import ro.ase.cts.builder02.Internare02;

public class InternareBuilder02 implements AbstractBuilder02{

    private boolean arePatRabatabil;
    private boolean arePapuci;
    private boolean areHalat;
    private boolean areMicDejun;

    public InternareBuilder02() {
        this.arePatRabatabil = false;
        this.arePapuci = false;
        this.areHalat = false;
        this.areMicDejun = false;
    }

    @Override
    public Internare02 build(String nume) {
        return new Internare02(nume,arePatRabatabil,arePapuci,areHalat,areMicDejun);
    }


    @Override
    public AbstractBuilder02 setArePatRabatabil(boolean arePatRabatabil) {
        this.arePatRabatabil=arePatRabatabil;
        return this;
    }

    @Override
    public AbstractBuilder02 setArePapuci(boolean arePapuci) {
        this.arePapuci=arePapuci;
        return this;
    }

    @Override
    public AbstractBuilder02 setAreHalat(boolean areHalat) {
        this.areHalat=areHalat;
        return this;
    }

    @Override
    public AbstractBuilder02 setAreMicDejun(boolean areMicDejun) {
        this.areMicDejun=areMicDejun;
        return this;
    }
}

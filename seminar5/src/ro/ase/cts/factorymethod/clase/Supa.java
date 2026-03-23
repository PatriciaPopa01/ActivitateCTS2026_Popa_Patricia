package ro.ase.cts.factorymethod.clase;

//pentru ca e clasa abstracta nu e nevoita sa implemneteze metoda din interfata
public abstract class Supa implements FelMancare {
    //access modifier va fi protected deoarece vom avea acces la ele din clasele fiu
    protected float pret;
    protected float gramaj;

    public Supa(float pret, float gramaj) {
        this.pret = pret;
        this.gramaj = gramaj;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Supa{");
        sb.append("pret=").append(pret);
        sb.append(", gramaj=").append(gramaj);
        sb.append('}');
        return sb.toString();
    }
}

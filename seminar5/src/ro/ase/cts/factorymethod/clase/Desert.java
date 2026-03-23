package ro.ase.cts.factorymethod.clase;

public abstract class Desert implements FelMancare{
    protected float pret;
    protected float gramaj;
    protected int nrCalorii;

    public Desert(float pret, float gramaj, int nrCalorii) {
        this.pret = pret;
        this.gramaj = gramaj;
        this.nrCalorii = nrCalorii;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Desert{");
        sb.append("pret=").append(pret);
        sb.append(", gramaj=").append(gramaj);
        sb.append(", nrCalorii=").append(nrCalorii);
        sb.append('}');
        return sb.toString();
    }
}

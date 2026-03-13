package ro.cts.simplefactory.clase;

public abstract class MijlocDeTransport {
    protected int nrRoti;
    protected String nrInmatriculare;

    public MijlocDeTransport(int nrRoti, String nrInmatriculare) {
        this.nrRoti = nrRoti;
        this.nrInmatriculare = nrInmatriculare;
    }

    //o facem abstracta ca sa obligam clasele copil sa implementeze aceasta metoda
    public abstract void afiseazaDetalii();

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        builder.append(this.nrRoti + " roti");
        builder.append(" si nr de inmatriculare " + this.nrInmatriculare);
        return builder.toString();
    }
}

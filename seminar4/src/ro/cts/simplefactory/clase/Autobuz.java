package ro.cts.simplefactory.clase;

public class Autobuz extends MijlocDeTransport{
    public Autobuz(int nrRoti, String nrInmatriculare) {
        super(nrRoti, nrInmatriculare);
    }

    @Override
    public void afiseazaDetalii() {
        StringBuilder builder = new StringBuilder();
        builder.append("Autobuzul are ");
        builder.append(super.toString());
        System.out.println(builder);
    }
}

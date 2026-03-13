package ro.cts.simplefactory.clase;

public class Troleibuz extends MijlocDeTransport{
    public Troleibuz(int nrRoti, String nrInmatriculare) {
        super(nrRoti, nrInmatriculare);
    }

    @Override
    public void afiseazaDetalii() {
        StringBuilder builder = new StringBuilder();
        builder.append("Troleibuz are ");
        builder.append(super.toString());
        System.out.println(builder);
    }
}

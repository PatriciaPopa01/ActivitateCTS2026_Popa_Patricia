package ro.cts.simplefactory.clase;

public class Tramvai extends MijlocDeTransport{
    public Tramvai(int nrRoti, String nrInmatriculare) {
        super(nrRoti, nrInmatriculare);
    }

    @Override
    public void afiseazaDetalii() {
        StringBuilder builder = new StringBuilder();
        builder.append("Tramvai are ");
        builder.append(super.toString());
        System.out.println(builder);
    }
}

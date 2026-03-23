package ro.ase.cts.factorymethod.clase;

public class Clatita extends Desert{
    public Clatita(float pret, float gramaj, int nrCalorii) {
        super(pret, gramaj, nrCalorii);
    }

    @Override
    public void afisare() {
        StringBuilder sb =new StringBuilder();
        sb.append("Clatitele au ").append(super.toString());
        System.out.println(sb);
    }
}

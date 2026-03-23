package ro.ase.cts.factorymethod.clase;

public class Papanasi extends Desert{

    public Papanasi(float pret, float gramaj, int nrCalorii) {
        super(pret, gramaj, nrCalorii);
    }

    @Override
    public void afisare() {
        StringBuilder sb =new StringBuilder();
        sb.append("Papanasii au ").append(super.toString());
        System.out.println(sb);
    }
}

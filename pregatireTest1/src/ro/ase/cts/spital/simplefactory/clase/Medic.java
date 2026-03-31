package ro.ase.cts.spital.simplefactory.clase;

public class Medic implements InterfataPersSpital{
    private String nume;
    private int sectie;
    private double salariu;

    public Medic(String nume, int sectie, double salariu) {
        this.nume = nume;
        this.sectie = sectie;
        this.salariu = salariu;
    }

    @Override
    public void afisareDetalii() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.nume + " -> ocupatie: Medic ");
        sb.append(" sectie: " + this.sectie);
        sb.append(" salariu: " + this.salariu);
        System.out.println(sb.toString());
    }
}

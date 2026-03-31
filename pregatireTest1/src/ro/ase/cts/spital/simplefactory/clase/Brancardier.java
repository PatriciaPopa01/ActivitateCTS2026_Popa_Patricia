package ro.ase.cts.spital.simplefactory.clase;

public class Brancardier implements InterfataPersSpital{
    private String nume;
    private int sectie;
    private double salariu;

    public Brancardier(String nume, int sectie, double salariu) {
        this.nume = nume;
        this.sectie = sectie;
        this.salariu = salariu;
    }

    @Override
    public void afisareDetalii() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.nume + " -> ocupatie: Brancardier ");
        sb.append(" sectie: " + this.sectie);
        sb.append(" salariu: " + this.salariu);
        System.out.println(sb.toString());
    }
}

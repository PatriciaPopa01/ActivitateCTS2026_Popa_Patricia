package ro.ase.cts.spital.factorymethod.clase;

public class Brancardier extends PersonalMedical{
    public Brancardier(String nume, int sectie, double salariu) {
        super(nume, sectie, salariu);
    }

    @Override
    public void afiseazaDetalii() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.nume + " -> ocupatie: ").append(super.toString());
        System.out.println(sb);
    }
}

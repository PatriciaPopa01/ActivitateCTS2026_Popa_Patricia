package ro.ase.cts.spital.factorymethod.clase;

public class Secretar extends PersonalNonMedical{
    public Secretar(String nume, double salariu) {
        super(nume, salariu);
    }

    @Override
    public void afiseazaDetalii() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.nume + " -> ocupatie: ").append(super.toString());
        System.out.println(sb);
    }
}

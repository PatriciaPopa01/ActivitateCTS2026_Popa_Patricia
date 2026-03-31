package ro.ase.cts.spital.factorymethod.clase;

public class Registrator extends PersonalNonMedical{
    public Registrator(String nume, double salariu) {
        super(nume, salariu);
    }

    @Override
    public void afiseazaDetalii() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.nume + " -> ocupatie: ").append(super.toString());
        System.out.println(sb);
    }
}

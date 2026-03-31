package ro.ase.cts.spital.factorymethod.clase;

public class Medic extends PersonalMedical{
    public Medic(String nume, int sectie, double salariu) {
        super(nume, sectie, salariu);
    }

    @Override
    public void afiseazaDetalii() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.nume + " -> ocupatie: ").append(super.toString());
        System.out.println(sb);
    }
}

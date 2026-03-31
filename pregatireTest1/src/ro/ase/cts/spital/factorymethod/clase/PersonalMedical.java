package ro.ase.cts.spital.factorymethod.clase;

public abstract class PersonalMedical implements InterfataPersonalSpital{
    protected String nume;
    protected int sectie;
    protected double salariu;

    public PersonalMedical(String nume, int sectie, double salariu) {
        this.nume = nume;
        this.sectie = sectie;
        this.salariu = salariu;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("PersonalMedical{");
        sb.append("nume='").append(nume).append('\'');
        sb.append(", sectie=").append(sectie);
        sb.append(", salariu=").append(salariu);
        sb.append('}');
        return sb.toString();
    }
}

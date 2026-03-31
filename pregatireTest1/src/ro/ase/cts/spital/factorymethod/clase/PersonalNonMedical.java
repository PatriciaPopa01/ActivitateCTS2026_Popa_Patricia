package ro.ase.cts.spital.factorymethod.clase;

public abstract class PersonalNonMedical implements InterfataPersonalSpital{
    protected String nume;
    protected double salariu;

    public PersonalNonMedical(String nume, double salariu) {
        this.nume = nume;
        this.salariu = salariu;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("PersonalNonMedical{");
        sb.append("nume='").append(nume).append('\'');
        sb.append(", salariu=").append(salariu);
        sb.append('}');
        return sb.toString();
    }
}

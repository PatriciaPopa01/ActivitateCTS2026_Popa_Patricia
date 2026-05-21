package ro.ase.cts.command.clase;


public class Medic implements PersonalSpital{

    private String nume;

    public Medic(String nume) {
        this.nume = nume;
    }

    @Override
    public void preluarePacient(Pacient pacient) {
        System.out.println("Medicul " + this.nume + " il interneaza pe " + pacient.getNume());
    }
}

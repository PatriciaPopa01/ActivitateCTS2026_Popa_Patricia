package ro.ase.cts.command.clase;

public class Internare implements ComandaDeExecutat{
    private PersonalSpital medic;
    private Pacient pacient;

    public Internare(PersonalSpital medic, Pacient pacient) {
        this.medic = medic;
        this.pacient = pacient;
    }

    @Override
    public void executaComanda() {
        medic.preluarePacient(pacient);
    }
}

package ro.ase.cts.command.clase;

public class Tratare implements ComandaDeExecutat{

    private PersonalSpital asistenta;
    private Pacient pacient;

    public Tratare(PersonalSpital asistenta, Pacient pacient) {
        this.asistenta = asistenta;
        this.pacient = pacient;
    }

    @Override
    public void executaComanda() {
        asistenta.preluarePacient(pacient);
    }
}

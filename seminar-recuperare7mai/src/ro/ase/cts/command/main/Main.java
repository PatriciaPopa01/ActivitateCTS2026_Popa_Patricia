package ro.ase.cts.command.main;

import ro.ase.cts.command.clase.*;

public class Main {

    public static void main(String[] args) {
        PersonalSpital medic = new Medic("Medicul1");
        PersonalSpital asistenta = new Asistenta("Asistent1");

        Pacient pacient1 = new Pacient("Pacient1");
        Pacient pacient2 = new Pacient("Pacient2");

        ComandaDeExecutat comandaInternare =  new Internare(medic,pacient1);
        ComandaDeExecutat comandaTratare =  new Tratare(asistenta,pacient2);

        Operator receptionist = new Operator();

        receptionist.inregistreazaComanda(comandaInternare);
        receptionist.inregistreazaComanda(comandaTratare);

        receptionist.executaFisa();

        receptionist.inregistreazaComanda(new Tratare(asistenta,new Pacient("Pacient3")));

        receptionist.executaFisa();
        receptionist.executaFisa();
    }


}

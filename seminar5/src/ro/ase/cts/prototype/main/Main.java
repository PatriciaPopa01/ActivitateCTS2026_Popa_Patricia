package ro.ase.cts.prototype.main;

import ro.ase.cts.prototype.clase.Rezervare;
import ro.ase.cts.prototype.clase.RezervarePrototype;

public class Main {
    public static void main(String[] args) {
        //aici se respecta dependency-inversion
        RezervarePrototype rezervare1 = new Rezervare("Rares",20,1,"0730895937");
        RezervarePrototype rezervare2 = rezervare1.clone();

        ((Rezervare)rezervare2).setOraRezervare(10);
        ((Rezervare)rezervare2).setZiua(2);

        //asa nu se respecta dependency-inversion
//        Rezervare rezervare1 = new Rezervare("Rares",20,1,"0730895937");
//        Rezervare rezervare2 = (Rezervare) rezervare1.clone();
//        rezervare2.setOraRezervare(10);
//        rezervare2.setZiua(2);

        System.out.println(rezervare1);
        System.out.println(rezervare2);
    }
}

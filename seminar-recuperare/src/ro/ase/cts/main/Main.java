package ro.ase.cts.main;

import ro.ase.cts.abstractbuilder.AbstractBuilder;
import ro.ase.cts.abstractbuilder.Internare;
import ro.ase.cts.abstractbuilder.InternareBuilder;
import ro.ase.cts.builder02.AbstractBuilder02;
import ro.ase.cts.builder02.Internare02;
import ro.ase.cts.builder02.InternareBuilder02;

public class Main {
    public static void main(String[] args) {
        Internare internare1 = new Internare();
        internare1.setNumePacient("Georgel");
        internare1.setArePatRabatabil(true);

        Internare internare2 = new Internare();
        internare2.setNumePacient("Gigel");
        internare1.setArePatRabatabil(true);

        AbstractBuilder buidler = new InternareBuilder("Gigi");

        Internare internare3 = buidler.setArePatRabatabil(true).build();
        Internare internare4 = buidler.setArePapuci(true).setNume("Ion").build();

        System.out.println(internare3.toString());
        System.out.println(internare4.toString());


        AbstractBuilder02 builder02 = new InternareBuilder02();
        builder02.setAreMicDejun(true);
        Internare02 internare5 = builder02.build("georgica");
        Internare02 internare6 = builder02.build("bibi");

        internare5.setAreHalat(true);
        System.out.println(internare5.toString());
    }
}

package ro.ase.cts.restaurant.builder.main;

import ro.ase.cts.restaurant.builder.clase.AbstractBuilder;
import ro.ase.cts.restaurant.builder.clase.BuilderRezervare;
import ro.ase.cts.restaurant.builder.clase.Rezervare;
import ro.ase.cts.restaurant.builder.clase.TipMuzica;

public class Main {
    public static void main(String[] args) {
        AbstractBuilder builder = new BuilderRezervare();

        builder.setareAsezareGeam(true);

        Rezervare r1 = builder.build("Ioana");
        Rezervare r2 = builder.build("Stefan");

        r1.setAreMuizaAmbientala(true);
        r2.setGenMuzica(TipMuzica.ROCK);

        System.out.println(r1);
        System.out.println(r2);

    }
}

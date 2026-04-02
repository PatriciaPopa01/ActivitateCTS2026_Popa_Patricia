package ro.ase.cts.stb.prototype.main;


import ro.ase.cts.stb.prototype.clase.AbstractMijlocTransportPrototype;
import ro.ase.cts.stb.prototype.clase.Autobuz;

public class Main {
    public static void main(String[] args) {

        AbstractMijlocTransportPrototype tramvai1 = new Autobuz("tramvai",16,"ghica","eroilor");
        AbstractMijlocTransportPrototype tramvai2 = tramvai1.cloneaza();

        ((Autobuz) tramvai1).setNrRoti(65565576);
        ((Autobuz) tramvai2).setNume("autobuz");

        System.out.println(tramvai1);
        System.out.println(tramvai2);

    }
}

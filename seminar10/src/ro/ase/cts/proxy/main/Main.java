package ro.ase.cts.proxy.main;

import ro.ase.cts.proxy.clase.*;

public class Main {
    public static void main(String[] args) {
        MijlocDeTransport autobuz226 = new Autobuz(4,226);
        MijlocDeTransport autobuz168 = new Autobuz(0, 168);
        Statie statieRomana =  new Statie("Piata Romana",0);
        Statie statieUnirii = new Statie("Piata Unirii" , 0);

        autobuz168.opresteInStatie(statieRomana);
        autobuz226.opresteInStatie(statieUnirii);

        MijlocDeTransport autobuzN168 = new AutobuzDeNoapte(autobuz168);
        MijlocDeTransport autobuzN226 = new AutobuzDeNoapte(autobuz226);

        autobuzN168.opresteInStatie(statieRomana);
        autobuzN226.opresteInStatie(statieUnirii);

        System.out.println("====================");

        MijlocDeTransport autobuz = new Autobuz(12,123,TipCursa.SPECIALA);
        MijlocDeTransport autobuzSpecial = new AutobuzCursaSpeciala(autobuz);
        MijlocDeTransport autobuz168Special = new AutobuzCursaSpeciala(autobuz168);

        autobuzSpecial.opresteInStatie(statieRomana);
        autobuz168Special.opresteInStatie(statieRomana);
    }
}

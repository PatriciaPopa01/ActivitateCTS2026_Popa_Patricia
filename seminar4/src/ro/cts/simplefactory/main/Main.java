package ro.cts.simplefactory.main;

import ro.cts.simplefactory.clase.MijlocDeTransport;
import ro.cts.simplefactory.clase.TipMijlocDeTransport;
import ro.cts.simplefactory.fabrica.FabricaDepou;

public class Main {
    public static void main(String[] args) {
        FabricaDepou fabricaDepou = new FabricaDepou();

        MijlocDeTransport autobuz = fabricaDepou.getMijlocDeTransport(TipMijlocDeTransport.AUTOBUZ,4,"B111AAA");
        MijlocDeTransport tramvai = fabricaDepou.getMijlocDeTransport(TipMijlocDeTransport.TRAMVAI,16,"B222BBB");

        autobuz.afiseazaDetalii();
        tramvai.afiseazaDetalii();
    }
}

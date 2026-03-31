package ro.ase.cts.spital.simplefactory.main;

import ro.ase.cts.spital.simplefactory.clase.InterfataPersSpital;
import ro.ase.cts.spital.simplefactory.enums.TipPersonalSpital;
import ro.ase.cts.spital.simplefactory.fabrica.FabricaAngajati;

public class Main {
    public static void main(String[] args) {
        FabricaAngajati fabrica = new FabricaAngajati();

        InterfataPersSpital bancardier = fabrica.getAngajat(TipPersonalSpital.BRANCARDIER,"Marius",2,4000.56);
        InterfataPersSpital medic = fabrica.getAngajat(TipPersonalSpital.MEDIC,"Rares",7,9060.56);
        InterfataPersSpital asistent = fabrica.getAngajat(TipPersonalSpital.ASISTENT,"Silviu",4,5060.56);

        bancardier.afisareDetalii();
        medic.afisareDetalii();;
        asistent.afisareDetalii();
    }
}

package ro.ase.cts.spital.factorymethod.main;

import ro.ase.cts.spital.factorymethod.clase.InterfataPersonalSpital;
import ro.ase.cts.spital.factorymethod.enums.TipAngajat;
import ro.ase.cts.spital.factorymethod.enums.TipPersonalMedical;
import ro.ase.cts.spital.factorymethod.enums.TipPersonalNonMedical;
import ro.ase.cts.spital.factorymethod.fabrici.FabricaAbstracta;
import ro.ase.cts.spital.factorymethod.fabrici.FabricaPersonalMedical;
import ro.ase.cts.spital.factorymethod.fabrici.FabricaPersonalNonMedical;

public class Main {
    public static void main(String[] args) {
        FabricaAbstracta fabricaMedical = new FabricaPersonalMedical();
        FabricaAbstracta fabricaNonMedical = new FabricaPersonalNonMedical();

        InterfataPersonalSpital medic = fabricaMedical.getAngajat(TipPersonalMedical.MEDIC,"Marcel",4,9887);
        InterfataPersonalSpital asis = fabricaMedical.getAngajat(TipPersonalMedical.ASISTENT,"Raluca",0,6654);

        InterfataPersonalSpital registrator = fabricaNonMedical.getAngajat(TipPersonalNonMedical.REGISTRATOR,"ooo",7654);
        InterfataPersonalSpital secretar = fabricaNonMedical.getAngajat(TipPersonalNonMedical.SECRETAR,"hhhh",6543);

        medic.afiseazaDetalii();
        registrator.afiseazaDetalii();
        asis.afiseazaDetalii();
        secretar.afiseazaDetalii();



    }
}

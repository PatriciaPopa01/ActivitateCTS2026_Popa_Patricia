package ro.ase.cts.spital.factorymethod.fabrici;

import ro.ase.cts.spital.factorymethod.clase.Asistent;
import ro.ase.cts.spital.factorymethod.clase.Brancardier;
import ro.ase.cts.spital.factorymethod.clase.InterfataPersonalSpital;
import ro.ase.cts.spital.factorymethod.enums.TipAngajat;
import ro.ase.cts.spital.factorymethod.enums.TipPersonalMedical;


public class FabricaPersonalMedical implements FabricaAbstracta{
    @Override
    public InterfataPersonalSpital getAngajat(TipAngajat tip, String nume, int sectie, double salariu) {
        if(tip == TipPersonalMedical.BRANCARDIER)
            return new Brancardier(nume,sectie,salariu);
        else if(tip == TipPersonalMedical.ASISTENT)
            return new Asistent(nume,sectie,salariu);
        else if(tip == TipPersonalMedical.MEDIC)
            return new Asistent(nume,sectie,salariu);
        else
            return null;
    }

    @Override
    public InterfataPersonalSpital getAngajat(TipAngajat tip, String nume, double salariu) {
        return this.getAngajat(tip,nume,100,salariu);
    }
}

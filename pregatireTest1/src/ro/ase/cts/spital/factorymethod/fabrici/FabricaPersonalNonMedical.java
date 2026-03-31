package ro.ase.cts.spital.factorymethod.fabrici;

import ro.ase.cts.spital.factorymethod.clase.InterfataPersonalSpital;
import ro.ase.cts.spital.factorymethod.clase.Registrator;
import ro.ase.cts.spital.factorymethod.clase.Secretar;
import ro.ase.cts.spital.factorymethod.enums.TipAngajat;
import ro.ase.cts.spital.factorymethod.enums.TipPersonalNonMedical;

public class FabricaPersonalNonMedical implements FabricaAbstracta{
    @Override
    public InterfataPersonalSpital getAngajat(TipAngajat tip, String nume, int sectie, double salariu) {
        return this.getAngajat(tip,nume,salariu);
    }

    @Override
    public InterfataPersonalSpital getAngajat(TipAngajat tip, String nume, double salariu) {
        if ( tip == TipPersonalNonMedical.REGISTRATOR)
            return new Registrator(nume,salariu);
        else if(tip == TipPersonalNonMedical.SECRETAR)
            return new Secretar(nume, salariu);
        else return null;
    }
}

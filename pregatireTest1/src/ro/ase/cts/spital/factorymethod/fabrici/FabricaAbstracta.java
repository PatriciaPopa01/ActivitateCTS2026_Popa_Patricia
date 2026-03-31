package ro.ase.cts.spital.factorymethod.fabrici;

import ro.ase.cts.spital.factorymethod.clase.InterfataPersonalSpital;
import ro.ase.cts.spital.factorymethod.enums.TipAngajat;

public interface FabricaAbstracta {
    InterfataPersonalSpital getAngajat(TipAngajat tip,String nume, int sectie, double salariu);
    InterfataPersonalSpital getAngajat(TipAngajat tip,String nume,double salariu);
}

package ro.ase.cts.spital.simplefactory.fabrica;

import ro.ase.cts.spital.simplefactory.clase.Asistent;
import ro.ase.cts.spital.simplefactory.clase.Brancardier;
import ro.ase.cts.spital.simplefactory.clase.InterfataPersSpital;
import ro.ase.cts.spital.simplefactory.clase.Medic;
import ro.ase.cts.spital.simplefactory.enums.TipPersonalSpital;

public class FabricaAngajati {
    public InterfataPersSpital getAngajat(TipPersonalSpital tip, String nume,int sectie, double salariu){
        switch (tip){
            case BRANCARDIER: return new Brancardier(nume,sectie,salariu);
            case ASISTENT: return new Asistent(nume, sectie, salariu);
            case MEDIC: return new Medic(nume, sectie, salariu);
            default: return null;
        }
    }
}

package ro.ase.cts.factorymethod.main;

import ro.ase.cts.factorymethod.clase.FelMancare;
import ro.ase.cts.factorymethod.clase.SupaLegume;
import ro.ase.cts.factorymethod.enums.TipDesert;
import ro.ase.cts.factorymethod.enums.TipSuma;
import ro.ase.cts.factorymethod.fabrica.FabricaDesert;
import ro.ase.cts.factorymethod.fabrica.FabricaSupa;

public class Main {
    public static void main(String[] args) {
        FabricaSupa fabricaSupa = new FabricaSupa();
        FabricaDesert fabricaDesert = new FabricaDesert();

        FelMancare supaLegume = fabricaSupa.getMancare(TipSuma.SUPALEGUME,15.5f,300.0f);
        FelMancare supaCiuperci = fabricaSupa.getMancare(TipSuma.SUPACIUPERCI, 18.5f,340.4f);

        FelMancare papanasi = fabricaDesert.getMancare(TipDesert.PAPANASI,30f,400.5f);
        FelMancare clatite = fabricaDesert.getMancare(TipDesert.CALATITE,27.6f,230f,600);


        supaLegume.afisare();
        supaCiuperci.afisare();
        papanasi.afisare();
        clatite.afisare();
    }
}

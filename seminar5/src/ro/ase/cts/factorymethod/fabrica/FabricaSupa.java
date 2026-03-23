package ro.ase.cts.factorymethod.fabrica;

import ro.ase.cts.factorymethod.clase.FelMancare;
import ro.ase.cts.factorymethod.clase.Supa;
import ro.ase.cts.factorymethod.clase.SupaLegume;
import ro.ase.cts.factorymethod.enums.TipMancare;
import ro.ase.cts.factorymethod.enums.TipSuma;

public class FabricaSupa implements FabricaAbstracta{

    @Override
    public FelMancare getMancare(TipMancare tipMancare, float pret, float gramaj) {
        if(tipMancare == TipSuma.SUPALEGUME){
            return new SupaLegume(pret,gramaj);
        } else if (tipMancare == TipSuma.SUPACIUPERCI) {
            return new SupaLegume(pret, gramaj);
        }
        return null;
    }

    @Override
    public FelMancare getMancare(TipMancare tipMancare, float pret, float gramaj, int calorii) {
        return getMancare(tipMancare,pret,gramaj);
    }
}

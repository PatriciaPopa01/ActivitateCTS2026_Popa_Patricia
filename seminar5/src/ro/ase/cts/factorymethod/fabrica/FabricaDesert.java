package ro.ase.cts.factorymethod.fabrica;

import ro.ase.cts.factorymethod.clase.Clatita;
import ro.ase.cts.factorymethod.clase.FelMancare;
import ro.ase.cts.factorymethod.clase.Papanasi;
import ro.ase.cts.factorymethod.enums.TipDesert;
import ro.ase.cts.factorymethod.enums.TipMancare;

public class FabricaDesert implements FabricaAbstracta{

    @Override
    public FelMancare getMancare(TipMancare tipMancare, float pret, float gramaj) {
        return this.getMancare(tipMancare,pret,gramaj,500);
    }

    @Override
    public FelMancare getMancare(TipMancare tipMancare, float pret, float gramaj, int calorii) {
        if(tipMancare == TipDesert.PAPANASI){
            return new Papanasi(pret,gramaj,calorii);
        } else if (tipMancare == TipDesert.CALATITE) {
            return new Clatita(pret,gramaj,calorii);
        }
        return null;
    }
}

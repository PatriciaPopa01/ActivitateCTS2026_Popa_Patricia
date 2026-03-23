package ro.ase.cts.factorymethod.fabrica;

import ro.ase.cts.factorymethod.clase.FelMancare;
import ro.ase.cts.factorymethod.enums.TipMancare;

public interface FabricaAbstracta {
    FelMancare getMancare(TipMancare tipMancare, float pret, float gramaj);
    FelMancare getMancare(TipMancare tipMancare, float pret, float gramaj, int calorii);
}

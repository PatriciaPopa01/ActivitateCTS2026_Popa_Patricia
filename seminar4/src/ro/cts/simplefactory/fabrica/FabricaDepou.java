package ro.cts.simplefactory.fabrica;

import ro.cts.simplefactory.clase.*;

public class FabricaDepou {

    public MijlocDeTransport getMijlocDeTransport(TipMijlocDeTransport tip, int nrRoti, String nrInmatriculare){
        switch (tip){
            case AUTOBUZ: return new Autobuz(nrRoti,nrInmatriculare);
            case TRAMVAI: return new Tramvai(nrRoti,nrInmatriculare);
            case TROLEIBUZ: return new Troleibuz(nrRoti,nrInmatriculare);
            default: return null;
        }
    }
}

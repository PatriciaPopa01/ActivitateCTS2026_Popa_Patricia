package ro.ase.cts.spital.buildersingleton.main;

import ro.ase.cts.spital.buildersingleton.clase.AbstractBuilder;
import ro.ase.cts.spital.buildersingleton.clase.BuilderSingleton;
import ro.ase.cts.spital.buildersingleton.clase.ProtocolUrgenta;

public class Main {
    public static void main(String[] args) {

        AbstractBuilder builder1 = BuilderSingleton.getInstanta();
        ProtocolUrgenta prot1 = builder1.build("mare",1);
        prot1.setNrMedici(5);

        ProtocolUrgenta prot2 = builder1.build("mediu",2);
        prot2.setNrUnitatiSange(7);

        System.out.println(prot1);
        System.out.println(prot2);

        AbstractBuilder builder2 = BuilderSingleton.getInstanta();
        builder2.setNrMedici(1000000);

        System.out.println(builder1.hashCode());
        System.out.println(builder2.hashCode());

        System.out.println(prot1);
        System.out.println(prot2);



    }
}

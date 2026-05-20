package ro.ase.cts.observer.clase;

import java.util.ArrayList;
import java.util.List;

public abstract class MijlocDeTransport {
    private List<Calator> calatori;
    protected String linie;

    public MijlocDeTransport(String linie) {
        this.linie=linie;
        this.calatori = new ArrayList<>();
    }

    public void abonareCalator(Calator calator) {
        calatori.add(calator);
    }

    public void dezabonareCalator(Calator calator) {
        if(calatori.isEmpty()){
            throw new RuntimeException("Lista este goala");
        } else {
            if(calatori.contains(calator)){
                calatori.remove(calator);
            }
            else{
                throw new RuntimeException("Nu exista calatorul");
            }
        }
    }

    public void notificareCalator(String mesaj) {
        for(Calator calator : this.calatori){
            calator.notificare(mesaj);
        }
    }

    public abstract void pleacaDinDepou();
    public abstract void ramaneBlocatInTrafic();
}

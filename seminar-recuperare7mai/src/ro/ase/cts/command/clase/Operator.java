package ro.ase.cts.command.clase;

import java.util.ArrayList;
import java.util.List;
public class Operator {

    private List<ComandaDeExecutat> listaComenzi = new ArrayList<>();

    public void inregistreazaComanda(ComandaDeExecutat comanda){
        listaComenzi.add(comanda);
    }

    public void executaFisa(){
        if(listaComenzi.size()>0) {
            listaComenzi.get(0).executaComanda();
            listaComenzi.remove(listaComenzi.get(0));

        }
    }
}

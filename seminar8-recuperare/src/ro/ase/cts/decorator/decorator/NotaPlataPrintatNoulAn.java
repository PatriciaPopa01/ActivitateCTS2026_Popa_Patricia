package ro.ase.cts.decorator.decorator;

import ro.ase.cts.decorator.clase.AbstractNotaPlata;

public class NotaPlataPrintatNoulAn extends NotaPlataDecorator{

    public NotaPlataPrintatNoulAn(AbstractNotaPlata notaPlata) {
        super(notaPlata);
    }

    @Override
    public void printeazaFelicitare() {
        System.out.println("LA MULTI AAAANI!!!!!");
    }
}

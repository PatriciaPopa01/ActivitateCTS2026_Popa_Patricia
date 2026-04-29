package ro.ase.cts.decorator.decorator;

import ro.ase.cts.decorator.clase.AbstractNotaPlata;

public class NotaPlataPrintat1Mai extends NotaPlataDecorator{
    public NotaPlataPrintat1Mai(AbstractNotaPlata notaPlata) {
        super(notaPlata);
    }

    @Override
    public void printeazaFelicitare() {
        System.out.println("1 mai grataresc!!!!");
    }
}

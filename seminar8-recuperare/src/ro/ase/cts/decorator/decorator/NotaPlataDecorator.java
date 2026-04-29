package ro.ase.cts.decorator.decorator;

import ro.ase.cts.decorator.clase.AbstractNotaPlata;

public abstract class NotaPlataDecorator implements AbstractNotaPlata {
    private AbstractNotaPlata notaPlata;

    public NotaPlataDecorator(AbstractNotaPlata notaPlata) {
        this.notaPlata = notaPlata;
    }

    @Override
    public void printeaza() {
        this.notaPlata.printeaza();
    }

    public abstract void printeazaFelicitare();
}

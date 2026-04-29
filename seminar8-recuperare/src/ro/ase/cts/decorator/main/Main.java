package ro.ase.cts.decorator.main;

import ro.ase.cts.decorator.clase.AbstractNotaPlata;
import ro.ase.cts.decorator.clase.NotaPlata;
import ro.ase.cts.decorator.decorator.NotaPlataDecorator;
import ro.ase.cts.decorator.decorator.NotaPlataPrintat1Mai;
import ro.ase.cts.decorator.decorator.NotaPlataPrintatNoulAn;


//nu am implementat direct in clasa concreta noua functionalitate printeazaFelicitare pentru ca
//decoratorul actioneaza la runtime: asta inseamna ca putem avea mai multe deocoratoare
//si in functie de ce vrea utilizatorul la runtime un anumit decorator va fi apelat

public class Main {
    public static void main(String[] args) {
        AbstractNotaPlata notaPlata1 = new NotaPlata(128.45, "12.12.2025");
        AbstractNotaPlata notaPlata2 = new NotaPlata(235.98, "15.12.2025");

//        notaPlata1.printeaza();

        NotaPlataDecorator decoratorTest;
        int a = 2;

        if (a == 1) {
            decoratorTest = new NotaPlataPrintat1Mai(notaPlata1);
        } else {
            decoratorTest = new NotaPlataPrintatNoulAn(notaPlata1);
        }

        decoratorTest.printeazaFelicitare();

        NotaPlataDecorator decorator = new NotaPlataPrintatNoulAn(notaPlata2);
        decorator.printeaza();
        decorator.printeazaFelicitare();

    }
}

package ro.ase.cts.decorator.clase;

public class NotaPlata implements AbstractNotaPlata{
    private double suma;
    private String data;

    public NotaPlata(double suma, String data) {
        this.suma = suma;
        this.data = data;
    }

    @Override
    public void printeaza() {
        System.out.println("Nota de plata din data de " + this.data + " in valoare de " + this.suma);
    }
}

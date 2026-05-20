package ro.ase.cts.observer.clase;

public class Autobuz extends MijlocDeTransport{
    public Autobuz(String linie) {
        super(linie);
    }

    @Override
    public void pleacaDinDepou() {
        String mesaj ="Autobuzul de pe linia " + super.linie + " a plecat din depou!";
        notificareCalator(mesaj);
    }

    @Override
    public void ramaneBlocatInTrafic() {
        String mesaj ="Autobuzul de pe linia " + super.linie + " e blocat in trafic";
        notificareCalator(mesaj);
    }
}

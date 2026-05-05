package ro.ase.cts.proxy.clase;

public class Autobuz implements MijlocDeTransport{

    private int nrPasageri;
    private int nrLinie;
    private TipCursa tipCursa;

    public int getNrPasageri() {
        return nrPasageri;
    }

    public int getNrLinie() {
        return nrLinie;
    }

    public Autobuz(int nrPasageri, int nrLinie) {
        this.nrPasageri = nrPasageri;
        this.nrLinie = nrLinie;
        this.tipCursa = TipCursa.NORMALA;
    }

    public TipCursa getTipCursa() {
        return tipCursa;
    }

    public Autobuz(int nrPasageri, int nrLinie, TipCursa tipCursa) {
        this.nrPasageri = nrPasageri;
        this.nrLinie = nrLinie;
        this.tipCursa = tipCursa;
    }

    @Override
    public void opresteInStatie(Statie statie) {
        System.out.println("Autobuzul de pe linia " + nrLinie + " a oprit in statia " + statie.getNumeStatie());
    }
}

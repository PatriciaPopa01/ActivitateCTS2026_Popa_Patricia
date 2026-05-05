package ro.ase.cts.proxy.clase;

public class AutobuzCursaSpeciala implements MijlocDeTransport{

    private MijlocDeTransport mijlocDeTransport;

    public AutobuzCursaSpeciala(MijlocDeTransport mijlocDeTransport) {
        this.mijlocDeTransport = mijlocDeTransport;
    }

    @Override
    public void opresteInStatie(Statie statie) {
        if(this.mijlocDeTransport.getTipCursa() == TipCursa.SPECIALA){
            System.out.println("SPECIALA: Auobuzul nu opreste in statie!!");
        } else {
            this.mijlocDeTransport.opresteInStatie(statie);
        }
    }

    @Override
    public int getNrPasageri() {
        return this.mijlocDeTransport.getNrPasageri();
    }

    @Override
    public TipCursa getTipCursa() {
        return this.mijlocDeTransport.getTipCursa();
    }
}

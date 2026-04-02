package ro.ase.cts.spital.buildersingleton.clase;

public class BuilderSingleton implements AbstractBuilder{

    private int nrMedici;
    private int nrUnitatiSange;
    private int minute;


    private static BuilderSingleton instanta = null;

    private BuilderSingleton() {
        this.nrMedici = 0;
        this.nrUnitatiSange = 0;
        this.minute = 30;
    }

    @Override
    public ProtocolUrgenta build(String tipUrgenta, int nivelPrioritate) {
        return new ProtocolUrgenta(tipUrgenta,nivelPrioritate, nrMedici,nrUnitatiSange,minute);
    }

    @Override
    public AbstractBuilder setNrMedici(int nrMedici) {
        this.nrMedici = nrMedici;
        return this;
    }

    @Override
    public AbstractBuilder setNrUnitatiSange(int nrUnitatiSange) {
        this.nrUnitatiSange = nrUnitatiSange;
        return this;
    }

    @Override
    public AbstractBuilder setTimpInterventie(int minute) {
        this.minute = minute;
        return this;
    }

    public synchronized static BuilderSingleton getInstanta(){
        if(instanta == null)
        {
            instanta = new BuilderSingleton();
        }
        return instanta;
    }
}

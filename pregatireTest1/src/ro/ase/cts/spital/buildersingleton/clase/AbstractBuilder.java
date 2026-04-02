package ro.ase.cts.spital.buildersingleton.clase;

public interface AbstractBuilder {
    ProtocolUrgenta build(String tipUrgenta, int nivelPrioritate);
    AbstractBuilder setNrMedici(int nrMedici);
    AbstractBuilder setNrUnitatiSange(int nrUnitatiSange);
    AbstractBuilder setTimpInterventie(int minute);
}

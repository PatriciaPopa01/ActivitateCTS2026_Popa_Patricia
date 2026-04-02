package ro.ase.cts.restaurant.builder.clase;

public interface AbstractBuilder {
    Rezervare build(String nume);
    AbstractBuilder setareAsezareGeam(boolean areAsezareGeam);
    AbstractBuilder setareScauneErgonomice(boolean areScauneErgonomice);
    AbstractBuilder setareMasaDecorata(boolean areMasaDecorata);
    AbstractBuilder setareMuizaAmbientala(boolean areMuizaAmbientala);
    AbstractBuilder setgemMuzica(TipMuzica genMuzica);
}

package ro.ase.cts.stb.prototype.clase;

public class Autobuz implements AbstractMijlocTransportPrototype {
    private String nume;
    private int nrRoti;
    private String depou1;
    private String depou2;

    public Autobuz() {
    }

    public Autobuz(String nume, int nrRoti, String depou1, String depou2) {
        if (!nume.equalsIgnoreCase("autobuz") && !nume.equalsIgnoreCase("tramvai")) {
            throw new IllegalArgumentException();
        } else {
            this.nume = nume;
        }

        if (nrRoti < 4) {
            throw new IllegalArgumentException();
        } else {
            this.nrRoti=nrRoti;
        }
        if(depou1.length()<2){
            throw new IllegalArgumentException();
        } else {
            this.depou1=depou1;
        }
        if(depou2.length()<2){
            throw new IllegalArgumentException();
        } else {
            this.depou2=depou2;
        }
    }

    public void setNume(String nume) {
        if (!nume.equalsIgnoreCase("autobuz") && !nume.equalsIgnoreCase("tramvai")) {
            throw new IllegalArgumentException();
        } else {
            this.nume = nume;
        }
    }

    public void setNrRoti(int nrRoti) {
        if (nrRoti < 4) {
            throw new IllegalArgumentException();
        } else {
            this.nrRoti=nrRoti;
        }
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Autobuz{");
        sb.append("nume='").append(nume).append('\'');
        sb.append(", nrRoti=").append(nrRoti);
        sb.append(", depou1='").append(depou1).append('\'');
        sb.append(", depou2='").append(depou2).append('\'');
        sb.append('}');
        return sb.toString();
    }

    @Override
    public AbstractMijlocTransportPrototype cloneaza() {
        Autobuz autobuz = new Autobuz();
        autobuz.nume = this.nume;
        autobuz.nrRoti = this.nrRoti;
        autobuz.depou1 = this.depou1;
        autobuz.depou2 = this.depou2;
        return autobuz;
    }
}

package ro.ase.cts.restaurant.singleton.lazyinitialization;

public class RestaurantSingletonLazy {

    private String nume;
    private int nrMese;
    private String locatie;

    private static RestaurantSingletonLazy instanta = null;

    private RestaurantSingletonLazy(String nume, int nrMese, String locatie) {
        this.nume = nume;
        this.nrMese = nrMese;
        this.locatie = locatie;
    }

    public void setNume(String nume) {
        this.nume = nume;
    }

    public void setNrMese(int nrMese) {
        this.nrMese = nrMese;
    }

    public void setLocatie(String locatie) {
        this.locatie = locatie;
    }

    public static RestaurantSingletonLazy getInstanta(String nume, int nrMese, String locatie){
        if(instanta == null) {
            instanta = new RestaurantSingletonLazy(nume,nrMese,locatie);
        }
        return instanta;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("RestaurantSingletonLazy{");
        sb.append("nume='").append(nume).append('\'');
        sb.append(", nrMese=").append(nrMese);
        sb.append(", locatie='").append(locatie).append('\'');
        sb.append('}');
        return sb.toString();
    }
}

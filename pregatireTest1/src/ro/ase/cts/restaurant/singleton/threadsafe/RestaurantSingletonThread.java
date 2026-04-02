package ro.ase.cts.restaurant.singleton.threadsafe;

import ro.ase.cts.restaurant.singleton.lazyinitialization.RestaurantSingletonLazy;

public class RestaurantSingletonThread {
    private String nume;
    private int nrMese;
    private String locatie;

    private static RestaurantSingletonThread instanta = null;

    private RestaurantSingletonThread(String nume, int nrMese, String locatie) {
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

        public synchronized static RestaurantSingletonThread getInstanta(String nume, int nrMese, String locatie){
        if(instanta == null) {
            instanta = new RestaurantSingletonThread(nume,nrMese,locatie);
        }
        return instanta;
    }

//    public synchronized static RestaurantSingletonThread getInstanta(String nume, int nrMese, String locatie) {
//        if (instanta == null) {
//            try {
//                Thread.sleep(2000);
//            } catch (InterruptedException e) {
//                e.printStackTrace();
//            }
//            instanta = new RestaurantSingletonThread(nume, nrMese, locatie);
//        }
//        return instanta;
//    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("RestaurantSingletonThread{");
        sb.append("nume='").append(nume).append('\'');
        sb.append(", nrMese=").append(nrMese);
        sb.append(", locatie='").append(locatie).append('\'');
        sb.append('}');
        return sb.toString();
    }
}

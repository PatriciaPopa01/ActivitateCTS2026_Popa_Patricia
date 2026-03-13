package ro.cts.singleton.clase;

public class Hotel {
    private String nume;
    private int nrCamere;
    private int nrCamereOcupate;

    private static Hotel instanta = null;


    private Hotel(String nume, int numarCamere, int nrCamereOcupate) {
        this.nume = nume;
        this.nrCamere = numarCamere;
        this.nrCamereOcupate = nrCamereOcupate;
    }

    public static synchronized Hotel getInstance(String nume, int nrCamere, int nrCamereOcupate) {
        if (instanta == null) {
            instanta = new Hotel(nume, nrCamere, nrCamereOcupate);
        }
        return instanta;
    }

    public void rezervaCamera(){
        if(this.nrCamereOcupate < this.nrCamere){
            this.nrCamereOcupate++;
            System.out.println("S-a rezervat camera cu succes la hotelul " + this.nume);
        }
        else{
            System.out.println("ERROR! Camera nu a fost rezervata!");
        }
    }

    public void afiseazaDetaliiHotel(){
        StringBuilder builder = new StringBuilder();
        builder.append("Hotelul " + this.nume);
        builder.append(" are in total " + this.nrCamere + " camere");
        builder.append(" ,dintre care " + this.nrCamereOcupate + " ocupate");
        System.out.println(builder.toString());
    }

    public float calculeazaGradulDeOcupare(){
        return Float.valueOf(this.nrCamereOcupate/this.nrCamere)*100;
    }

}

package ro.ase.cts.prototype.clase;

public class Rezervare implements RezervarePrototype{
    private String numeClient;
    private int oraRezervare;
    private int ziua;
    private String nrTelefon;

    //care este varianta fara setteri la clone
    public Rezervare(String numeClient, int oraRezervare, int ziua, String nrTelefon) {
        if(numeClient.length() > 1){
            this.numeClient = numeClient;
        }
        else {
            this.numeClient = "blabla";
        }

        if(oraRezervare > 9 && oraRezervare < 23){
            this.oraRezervare = oraRezervare;
        }else{
            this.oraRezervare =9;
        }

        if(ziua< 31){
            this.ziua=ziua;
        }
        else {
            this.ziua = 1;
        }
        if(nrTelefon.length() == 10){
            this.nrTelefon=nrTelefon;
        }
        else{
            this.nrTelefon="07000000";
        }
    }

    public Rezervare() {
    }

    @Override
    public RezervarePrototype clone() {
        Rezervare rezervare = new Rezervare();
        rezervare.numeClient = this.numeClient;
        rezervare.oraRezervare = this.oraRezervare;
        rezervare.ziua = this.ziua;
        rezervare.nrTelefon = this.nrTelefon;

        return  rezervare;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Rezervare{");
        sb.append("numeClient='").append(numeClient).append('\'');
        sb.append(", oraRezervare=").append(oraRezervare);
        sb.append(", ziua=").append(ziua);
        sb.append(", nrTelefon='").append(nrTelefon).append('\'');
        sb.append('}');
        return sb.toString();
    }

    public void setOraRezervare(int oraRezervare) {
        if(oraRezervare > 9 && oraRezervare < 23){
            this.oraRezervare = oraRezervare;
        }else{
            this.oraRezervare =9;
        }
    }

    public void setZiua(int ziua) {
        if(ziua< 31){
            this.ziua=ziua;
        }
        else {
            this.ziua = 1;
        }
    }
}

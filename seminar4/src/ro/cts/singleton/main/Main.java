package ro.cts.singleton.main;

import ro.cts.singleton.clase.Hotel;

public class Main {
    public static void main(String[] args) {
        Hotel hotel = Hotel.getInstance("HotelulLuiMoa", 7, 4);
        Hotel megaHotel = Hotel.getInstance("MegaHotel", 200, 0);

        hotel.rezervaCamera();
        megaHotel.rezervaCamera();

        hotel.rezervaCamera();
        megaHotel.rezervaCamera();

        //hotel.afiseazaDetaliiHotel();

//        float gradOcupare = hotel.calculeazaGradulDeOcupare();
//        System.out.println("grad de ocupare: " + gradOcupare);
    }
}
package ro.ase.cts.restaurant.singleton.registry;

import java.util.HashMap;
import java.util.Map;

public class RestaurantSingletonRegistry {

    private static Map<String,InterfataRestaurant> colectie = new HashMap<>();

    private RestaurantSingletonRegistry(){

    }

    public static void regsiter(String nume, InterfataRestaurant obiect) throws Exception {
        if( colectie.containsKey(nume))
            throw new Exception("cheia "+ nume + " exista deja");
        else
            colectie.put(nume,obiect);
    }
    public static InterfataRestaurant getRestaurant(String nume){
        return colectie.get(nume);
    }

}

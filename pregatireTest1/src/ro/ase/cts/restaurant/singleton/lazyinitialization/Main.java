package ro.ase.cts.restaurant.singleton.lazyinitialization;

public class Main {
    public static void main(String[] args) {
        RestaurantSingletonLazy restaurant1 = RestaurantSingletonLazy.getInstanta("MrLaziz", 4,"berceni");

        System.out.println(restaurant1);

        RestaurantSingletonLazy restaurant2 = RestaurantSingletonLazy.getInstanta("Socului",7,"obor");

        restaurant1.setNrMese(76856784);
        System.out.println(restaurant2);
    }
}

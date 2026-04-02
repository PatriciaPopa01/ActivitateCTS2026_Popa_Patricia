package ro.ase.cts.restaurant.singleton.registry;

public class Main {
    public static void main(String[] args) {
        RestaurantChinezesc rc1= new RestaurantChinezesc();
        RestaurantChinezesc rc2 = new RestaurantChinezesc();
        RestaurantMexican rm =new RestaurantMexican();

        try{
            RestaurantSingletonRegistry.regsiter("restaurantch1" , rc1);
            RestaurantSingletonRegistry.regsiter("restaurnatmex" , rm);

//            RestaurantSingletonRegistry.regsiter("Restaurantch1", rc2);

            RestaurantSingletonRegistry.getRestaurant("restaurantch1").descriere();
            RestaurantSingletonRegistry.getRestaurant("restaurnatmex").descriere();

        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}

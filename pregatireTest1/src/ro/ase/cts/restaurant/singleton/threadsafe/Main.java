package ro.ase.cts.restaurant.singleton.threadsafe;

public class Main {
    public static void main(String[] args) {
        Runnable task1 = () -> {
            RestaurantSingletonThread restaurant1 = RestaurantSingletonThread.getInstanta("laziz",4,"berceni");
            System.out.println("thread1 -> " + restaurant1.hashCode() + " " + restaurant1);
        };

        Runnable task2 = () -> {
            RestaurantSingletonThread restaurant2 = RestaurantSingletonThread.getInstanta("socului",7,"obor");
            System.out.println("thread1 -> " + restaurant2.hashCode() + " " + restaurant2);
        };

        Thread t1 =new Thread(task1);
        Thread t2 = new Thread(task2);

        t1.start();
        t2.start();


//        new Thread(() -> {
//            System.out.println("Thread A a pornit...");
//            RestaurantSingletonThread r1 = RestaurantSingletonThread.getInstanta("Restaurant A", 10, "Berceni");
//            System.out.println("Thread A a terminat: " + r1.hashCode() + " " + r1);
//        }).start();
//
//        new Thread(() -> {
//            System.out.println("Thread B a pornit...");
//            RestaurantSingletonThread r2 = RestaurantSingletonThread.getInstanta("Restaurant B", 50, "Obor");
//            System.out.println("Thread B a terminat: " + r2.hashCode() + " " + r2);
//        }).start();
    }
}

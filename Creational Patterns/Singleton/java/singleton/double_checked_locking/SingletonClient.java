package singleton.double_checked_locking;

public class SingletonClient {
    public static void main(String[] args) {
        // Create two threads, each retrieving the singleton instance
        Thread thread1 = new Thread(() -> {
            // Getting the singleton instance
            DCLSingleton singleton = DCLSingleton.getInstance();

            // Using the singleton instance
            System.out.println("Thread 1 - DCL Singleton instance created: \n" + singleton);
        });

        Thread thread2 = new Thread(() -> {
            // Trying to create another instance (should return the same instance)
            DCLSingleton anotherInstance = DCLSingleton.getInstance();

            // Using the singleton instance
            System.out.println("Thread 2 - DCL Singleton instance created: \n" + anotherInstance);
        });

        // Start both threads
        thread1.start();
        thread2.start();

        try {
            // Wait for both threads to finish
            thread1.join();
            thread2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        // At this point, both instances are created on different threads
        // You may add a check here to ensure they are the same instance
        DCLSingleton singleton = DCLSingleton.getInstance();
        DCLSingleton anotherInstance = DCLSingleton.getInstance();
        System.out.println("Are both instances the same? " + (singleton == anotherInstance));
    }
}

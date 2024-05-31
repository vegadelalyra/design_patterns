package singleton.thread_safe;

public class SingletonClient {
    public static void main(String[] args) {
        // Getting the singleton instance
        ThreadSafeSingleton singleton = ThreadSafeSingleton.getInstance();

        // Using the singleton instance
        System.out.println("Thread Safe Singleton instance created: \n" + singleton);

        // Trying to create another instance (should return the same instance)
        ThreadSafeSingleton anotherInstance = ThreadSafeSingleton.getInstance();

        // Checking if both instances are the same
        System.out.println("Are both instances the same? " + (singleton == anotherInstance));
    }
}


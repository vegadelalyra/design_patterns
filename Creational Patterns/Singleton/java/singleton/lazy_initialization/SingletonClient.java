package singleton.lazy_initialization;

public class SingletonClient {
    public static void main(String[] args) {
        // Getting the singleton instance
        LazyInitializedSingleton singleton = LazyInitializedSingleton.getInstance();

        // Using the singleton instance
        System.out.println("Singleton instance created: " + singleton);

        // Trying to create another instance (should return the same instance)
        LazyInitializedSingleton anotherInstance = LazyInitializedSingleton.getInstance();

        // Checking if both instances are the same
        System.out.println("Are both instances the same? " + (singleton == anotherInstance));
    }
}


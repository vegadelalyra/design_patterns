package singleton.eager_initialization;

public class SingletonClient {
    public static void main(String[] args) {
        // Getting the singleton instance (from here is already created but yet not used)
        EagerInitializedSingleton singleton = EagerInitializedSingleton.getInstance();

        // Using the singleton instance
        System.out.println("Singleton instance created: " + singleton);

        // Trying to create another instance (should return the same instance)
        EagerInitializedSingleton anotherInstance = EagerInitializedSingleton.getInstance();

        // Checking if both instances are the same
        System.out.println("Are both instances the same? " + (singleton == anotherInstance));
    }
}


package singleton.static_block_initialization;

public class SingletonClient {
    public static void main(String[] args) {
        // Getting the singleton instance
        StaticBlockSingleton singleton = StaticBlockSingleton.getInstance();

        // Using the singleton instance
        System.out.println("Singleton instance created: " + singleton);

        // Trying to create another instance (should return the same instance)
        StaticBlockSingleton anotherInstance = StaticBlockSingleton.getInstance();

        // Checking if both instances are the same
        System.out.println("Are both instances the same? " + (singleton == anotherInstance));
    }
}


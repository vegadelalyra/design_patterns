package singleton.enum_singleton;

public class enumSingletonExample {
    public static void main(String[] args) {
        // Accessing the singleton instance
        EnumSingleton singleton = EnumSingleton.INSTANCE;

        // Using the singleton instance
        singleton.setValue(10);
        singleton.printValue();

        // Accessing the singleton instance again
        EnumSingleton anotherInstance = EnumSingleton.INSTANCE;
        anotherInstance.printValue();

        // Checking if both instances are the same
        System.out.println("Are both instances the same? " + (singleton == anotherInstance));
        System.out.println("First instance: " + singleton);
        System.out.println("Second instance: " + anotherInstance);
    }
}

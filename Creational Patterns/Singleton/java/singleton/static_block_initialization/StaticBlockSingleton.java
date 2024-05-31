package singleton.static_block_initialization;

public class StaticBlockSingleton {

    private static final StaticBlockSingleton instance;
    // Static block initialization implementation
    // is similar to eager initialization,
    // except that instance of the class is created
    // in the static block that provides the option for exception handling.
    private StaticBlockSingleton(){}

    // static block initialization for exception handling
    static {
        try {
            instance = new StaticBlockSingleton();
        } catch (Exception e) {
            throw new RuntimeException("Exception occurred in creating singleton instance.");
        }
    }

    public static StaticBlockSingleton getInstance() {
        return instance;
    }
}

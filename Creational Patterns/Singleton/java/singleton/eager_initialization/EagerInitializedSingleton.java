package singleton.eager_initialization;

public class EagerInitializedSingleton {
    // Use eager initialization for straightforward,
    // single-threaded scenarios where simplicity
    // and immediate availability of the singleton instance are priorities.

    private static final EagerInitializedSingleton instance = new EagerInitializedSingleton();

    // private constructor to avoid client applications using the constructor
    private EagerInitializedSingleton(){}

    public static EagerInitializedSingleton getInstance() {
        return instance;
    }
}

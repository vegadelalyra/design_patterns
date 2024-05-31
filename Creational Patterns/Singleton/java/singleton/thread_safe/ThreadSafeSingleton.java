package singleton.thread_safe;

public class ThreadSafeSingleton {
    // same as guru example > safe thread singleton implementation
    // however, this is a suboptimal implementation
    // since doesn't implement the DCL double-checked locking pattern
    // so overhead happens when executed.

    private static ThreadSafeSingleton instance;

    private ThreadSafeSingleton() {}

    public static synchronized ThreadSafeSingleton getInstance() {
        if (instance == null) {
            instance = new ThreadSafeSingleton();
        }
        return instance;
    }
}

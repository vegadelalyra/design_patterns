package singleton.guru_example.naive_thread_unsafe;

public final class NaiveSingleton {
    private static NaiveSingleton instance;
    public String value;

    private NaiveSingleton(String value) {
        // The following code emulates slow initialization.
        try {
            Thread.sleep(1_000);
        } catch (InterruptedException ex) {
            ex.printStackTrace();
        }
        this.value = value;
    }

    public static NaiveSingleton getInstance(String value) {
        if (instance == null) {
            instance = new NaiveSingleton(value);
        }
        return instance;
    }

    public static void logDesignPatternExplanation() {
        System.out.println("If you see the same value, then singleton was reused (yay!)");
        System.out.println("If you see different values, then 2 singletons were created (booo!!)");
        System.out.println("RESULT: ");
    }
}

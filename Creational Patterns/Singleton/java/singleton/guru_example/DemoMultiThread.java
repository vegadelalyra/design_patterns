package singleton.guru_example;

import singleton.guru_example.naive_thread_unsafe.NaiveSingleton;
import singleton.guru_example.thread_safe.Singleton;

public class DemoMultiThread {
    public static void main(String[] args) throws InterruptedException {
        NaiveSingleton.logDesignPatternExplanation();
        executeSingletonTest("Naive", NaiveThreadTask::new);
        executeSingletonTest("Safe", SafeThreadTask::new);
    }

    static void executeSingletonTest(String type, RunnableSupplier taskSupplier) throws InterruptedException {
        System.out.printf("=== %s SINGLETON [STARTED] ===%n", type.toUpperCase());

        Thread threadFoo = new Thread(taskSupplier.create("FOO"));
        Thread threadBar = new Thread(taskSupplier.create("BAR"));
        threadFoo.start();
        threadBar.start();

        threadFoo.join();
        threadBar.join();

        System.out.printf("=== %s SINGLETON [FINISHED] ===%n", type.toUpperCase());
    }

    @FunctionalInterface
    interface RunnableSupplier {
        Runnable create(String value);
    }

    static class NaiveThreadTask implements Runnable {
        private final String value;

        NaiveThreadTask(String value) {
            this.value = value;
        }

        @Override
        public void run() {
            NaiveSingleton singleton = NaiveSingleton.getInstance(value);
            System.out.println(singleton.value);
        }
    }

    static class SafeThreadTask implements Runnable {
        private final String value;

        SafeThreadTask(String value) {
            this.value = value;
        }

        @Override
        public void run() {
            Singleton singleton = Singleton.getInstance(value);
            System.out.println(singleton.value);
        }
    }
}

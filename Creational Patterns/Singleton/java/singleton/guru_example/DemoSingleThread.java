package singleton.guru_example;

import singleton.guru_example.naive_thread_unsafe.NaiveSingleton;

public class DemoSingleThread {
    public static void main(String[] args) {
        NaiveSingleton.logDesignPatternExplanation();

        NaiveSingleton singleton = NaiveSingleton.getInstance("FOO");
        NaiveSingleton anotherSingleton = NaiveSingleton.getInstance("BAR");
        System.out.println(singleton.value);
        System.out.println(anotherSingleton.value);
    }
}

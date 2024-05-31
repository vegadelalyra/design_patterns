package singleton.reflection_to_destroy_singleton;

import singleton.eager_initialization.EagerInitializedSingleton;

import java.lang.reflect.Constructor;

public class ReflectionSingletonTest {
    // Reflection can be used to destroy all the previous singleton implementation approaches.
    // Reflection is very powerful and used in a lot of frameworks like Spring and Hibernate.

    public static void main(String[] args) {
        EagerInitializedSingleton instanceOne = EagerInitializedSingleton.getInstance();
        EagerInitializedSingleton instanceTwo = null;

        try {
            Constructor[] constructors = EagerInitializedSingleton.class.getDeclaredConstructors();

            for (Constructor constructor : constructors) {
                // This code will destroy the singleton pattern
                constructor.setAccessible(true);
                instanceTwo = (EagerInitializedSingleton) constructor.newInstance();
                break;
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

        System.out.println(instanceOne.hashCode());
        System.out.println(instanceTwo != null ? instanceTwo.hashCode() : 0);
    }
}

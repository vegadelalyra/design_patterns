package singleton.enum_singleton;

public enum EnumSingleton {
    // To overcome this situation with Reflection, Joshua Bloch suggests the use of enum
    // to implement the singleton design pattern as Java ensures that any enum value is
    // instantiated only once in a Java program. Since Java Enum values are globally accessible,
    // so is the singleton. The drawback is that the enum type is somewhat inflexible 
    // (for example, it does not allow lazy initialization).
    
    INSTANCE; // Enum constant, automatically instantiated.

    // It is possible to add methods and fields like in a regular class.
    private int value;

    public void setValue(int value) {
        this.value = value;
    }

    public void printValue() {
        System.out.println("Value: " + value);
    }
}

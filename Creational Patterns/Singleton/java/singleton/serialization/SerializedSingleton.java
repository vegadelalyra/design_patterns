package singleton.serialization;

import java.io.Serial;
import java.io.Serializable;

public class SerializedSingleton implements Serializable {
    // Sometimes in distributed systems, we need to implement
    // Serializable interface in the singleton class so that we can store
    // its state in the file system and retrieve it at a later point in time.

    @Serial
    private static final long serialVersionUID = -7604766932017737115L;

    private SerializedSingleton(){}

    private static class SingletonHelper {
        private static final SerializedSingleton instance = new SerializedSingleton();
    }

    public static SerializedSingleton getInstance() {
        return SingletonHelper.instance;
    }

    // readResolve() present in the lifecycle hook of de-serializing files
    // it's executed before returning the deserialized file to the caller.
    // For immutable singletons, this is perfect since data will always be the same,
    // so you just need to return the existing instance before sending the deserialized file.
    // For mutable SingleTones, is possible to modify the deserialized instance before serialize it,
    // for that case, deep copy or update logic is required in readResolve method.
    // * serialized data is immutable *
    @Serial
    protected Object readResolve() {
        return getInstance();
    }
}

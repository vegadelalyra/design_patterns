package singleton.bill_pugh;

public class BillPughSingleton {
    // This is the most widely used approach for the singleton class
    // as it does not require synchronization and it thread-safe.

    private BillPughSingleton(){}

    private static class SingletonHelper {
        private static final BillPughSingleton INSTANCE = new BillPughSingleton();
    }

    public static BillPughSingleton getInstance() {
        return SingletonHelper.INSTANCE;
    }
}

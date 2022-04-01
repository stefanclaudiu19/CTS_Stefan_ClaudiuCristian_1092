package clase;

public class Singleton_ThreadSafe {
    private static Singleton_ThreadSafe instance = null;

    private Singleton_ThreadSafe() {
    }

    public static synchronized Singleton_ThreadSafe getInstance() {
        if (instance == null) {
            instance = new Singleton_ThreadSafe();
        }
        return instance;
    }
}

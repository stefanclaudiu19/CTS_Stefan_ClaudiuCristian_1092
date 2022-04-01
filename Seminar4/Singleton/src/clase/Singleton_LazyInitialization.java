package clase;

public class Singleton_LazyInitialization {
    private static Singleton_LazyInitialization instance = null;

    private Singleton_LazyInitialization() {
    }

    public static Singleton_LazyInitialization getInstance() {
        if (instance == null) {
            instance = new Singleton_LazyInitialization();
        }
        return instance;
    }
}

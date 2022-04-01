package clase;

public class Singleton_EagerInitialization {
    private static Singleton_EagerInitialization instance = new Singleton_EagerInitialization();

    private Singleton_EagerInitialization() {
    }

    public static Singleton_EagerInitialization getInstance() {
        return instance;
    }
}

package clase;

public abstract class MijlocTransport {
    abstract void statie1();

    abstract void statie2();

    abstract void statie3();

    public final void parcuregeNormal() {
        statie1();
        statie2();
        statie3();
    }

    public final void parcurgeInvers() {
        statie3();
        statie2();
        statie1();
    }
}
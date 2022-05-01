package clase;

public class Tramvai extends MijlocTransport {
    @Override
    void statie1() {
        System.out.println("Oprire la statia 1");
    }

    @Override
    void statie2() {
        System.out.println("Oprire la statia 2");
    }

    @Override
    void statie3() {
        System.out.println("Oprire la statia 3");
    }
}
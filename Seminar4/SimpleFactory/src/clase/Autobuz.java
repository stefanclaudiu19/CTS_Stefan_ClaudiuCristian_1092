package clase;

public class Autobuz extends MijlocTransport {
    public Autobuz(String nrInmatriculare) {
        super(nrInmatriculare);
    }

    @Override
    public void afisareNrInmatriculare() {
        System.out.println("Autobuz " + this.getNrInmatriculare());
    }
}

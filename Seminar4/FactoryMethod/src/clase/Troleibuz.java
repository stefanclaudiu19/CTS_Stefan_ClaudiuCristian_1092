package clase;

public class Troleibuz extends MijlocTransport {
    public Troleibuz(String nrInmatriculare) {
        super(nrInmatriculare);
    }

    @Override
    public void afisareNrInmatriculare() {
        System.out.println("Troleibuz " + this.getNrInmatriculare());
    }
}

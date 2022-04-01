package clase;

public class Tramvai extends MijlocTransport {
    public Tramvai(String nrInmatriculare) {
        super(nrInmatriculare);
    }

    @Override
    public void afisareNrInmatriculare() {
        System.out.println("Tramvai " + this.getNrInmatriculare());
    }
}

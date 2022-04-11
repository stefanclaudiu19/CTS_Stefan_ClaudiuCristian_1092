package clase;

public class Autobuz implements Item {
    private String producator;
    private String model;
    private int nrLocuri;

    public Autobuz(String producator, String model, int nrLocuri) {
        this.producator = producator;
        this.model = model;
        this.nrLocuri = nrLocuri;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Autobuz{");
        sb.append("producator='").append(producator).append('\'');
        sb.append(", model='").append(model).append('\'');
        sb.append(", nrLocuri=").append(nrLocuri);
        sb.append('}');
        return sb.toString();
    }

    @Override
    public void adaugaItem(Item item) throws Exception {
        throw new Exception("Nu se poate adauga!");
    }

    @Override
    public void stergeItem(Item item) throws Exception {
        throw new Exception("Nu se poate sterge!");
    }

    @Override
    public void descrieItem() {
        System.out.println(this.toString());
    }

    @Override
    public Item getItem(int position) throws Exception {
        throw new Exception("Nu se poate obtine!");
    }

    @Override
    public float calculeazSumaGarantata(float pretPerLoc) {
        return pretPerLoc * nrLocuri + model.length();
    }
}
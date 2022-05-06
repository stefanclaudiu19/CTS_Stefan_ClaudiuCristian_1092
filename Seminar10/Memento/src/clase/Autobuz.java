package clase;

public class Autobuz {
    private String nume;
    private double consumMediu;
    private int an;
    private String model;
    private int nrLocuri;

    public Autobuz(String nume, double consumMediu, int an, String model, int nrLocuri) {
        this.nume = nume;
        this.consumMediu = consumMediu;
        this.an = an;
        this.model = model;
        this.nrLocuri = nrLocuri;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Autobuz{");
        sb.append("nume='").append(nume).append('\'');
        sb.append(", consumMediu=").append(consumMediu);
        sb.append(", an=").append(an);
        sb.append(", model='").append(model).append('\'');
        sb.append(", nrLocuri=").append(nrLocuri);
        sb.append('}');
        return sb.toString();
    }

    public void setNume(String nume) {
        this.nume = nume;
    }

    public void setConsumMediu(double consumMediu) {
        this.consumMediu = consumMediu;
    }

    public MementoAutobuz save() {
        MementoAutobuz nou = new MementoAutobuz(this.nume, this.consumMediu);
        return nou;
    }

    public void undo(MementoAutobuz a) {
        this.consumMediu = a.getConsumMediu();
        this.nume = a.getNume();
    }
}
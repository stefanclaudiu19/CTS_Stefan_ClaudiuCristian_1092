package clase;

public class MementoAutobuz {
    private String nume;
    private double consumMediu;

    public MementoAutobuz(String nume, double consumMediu) {
        this.nume = nume;
        this.consumMediu = consumMediu;
    }

    public String getNume() {
        return nume;
    }

    public double getConsumMediu() {
        return consumMediu;
    }
}
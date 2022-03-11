package clase;

public class Angajat extends Aplicant {
    private int salariu;
    private String ocupatie;

    public Angajat() {
        super();
    }

    public void setSalariu(int salariu) {
        this.salariu = salariu;
    }

    public void setOcupatie(String ocupatie) {
        this.ocupatie = ocupatie;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Angajat: ");
        sb.append(super.toString());
        sb.append(", salariu=").append(salariu);
        sb.append(", ocupatie=").append(ocupatie);
        return sb.toString();
    }
}

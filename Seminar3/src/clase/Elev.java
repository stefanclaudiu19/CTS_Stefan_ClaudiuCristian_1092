package clase;

public class Elev extends Aplicant {
    private int clasa;
    private String tutore;

    public Elev() {
        super();
    }

    public void setClasa(int clasa) {
        this.clasa = clasa;
    }

    public void setTutore(String tutore) {
        this.tutore = tutore;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Elev: ");
        sb.append(super.toString());
        sb.append(", clasa=").append(clasa);
        sb.append(", tutore=").append(tutore);
        return sb.toString();
    }
}

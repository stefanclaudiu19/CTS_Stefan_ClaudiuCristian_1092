package clase;

public class Linie implements Flyweight {
    int nrLinie;
    String primaStatie;
    String ultimaStatie;

    public Linie(int nrLinie, String primaStatie, String ultimaStatie) {
        super();
        this.nrLinie = nrLinie;
        this.primaStatie = primaStatie;
        this.ultimaStatie = ultimaStatie;
    }

    public int getNrLinie() {
        return nrLinie;
    }

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        builder.append("Linie [nrLinie=");
        builder.append(nrLinie);
        builder.append(", primaStatie=");
        builder.append(primaStatie);
        builder.append(", ultimaStatie=");
        builder.append(ultimaStatie);
        builder.append("]");
        return builder.toString();
    }

    @Override
    public void afiseazaDescriereAutobuz(Autobuz autobuz) {
        System.out.println(autobuz.toString() + toString());


    }
}
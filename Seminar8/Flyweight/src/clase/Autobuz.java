package clase;

public class Autobuz {
    String model;
    int anFabricatie;
    int nrLocuri;

    public Autobuz(String model, int anFabricatie, int nrLocuri) {
        super();
        this.model = model;
        this.anFabricatie = anFabricatie;
        this.nrLocuri = nrLocuri;
    }

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        builder.append("Autobuz [model=");
        builder.append(model);
        builder.append(", anFabricatie=");
        builder.append(anFabricatie);
        builder.append(", nrLocuri=");
        builder.append(nrLocuri);
        builder.append("]");
        return builder.toString();
    }
}
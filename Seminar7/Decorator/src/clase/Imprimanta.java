package clase;

public class Imprimanta implements InterfataImprimanta {
    private float pretBilet;

    public Imprimanta(float pretBilet) {
        this.pretBilet = pretBilet;
    }

    @Override
    public void printeazaBilet() {
        System.out.println(pretBilet);
    }
}
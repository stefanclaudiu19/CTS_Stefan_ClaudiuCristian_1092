package clase;

public abstract class DecoratorAbstract implements InterfataImprimanta {
    private InterfataImprimanta interfataImprimanta;

    public DecoratorAbstract(InterfataImprimanta interfataImprimanta) {
        this.interfataImprimanta = interfataImprimanta;
    }

    @Override
    public void printeazaBilet() {
        interfataImprimanta.printeazaBilet();
    }

    public abstract void printeazaVerso();
}
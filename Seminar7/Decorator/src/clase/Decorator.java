package clase;

public class Decorator extends DecoratorAbstract {
    private String mesaj;

    public Decorator(InterfataImprimanta interfataImprimanta, String mesaj) {
        super(interfataImprimanta);
        this.mesaj = mesaj;
    }

    @Override
    public void printeazaVerso() {
        System.out.println("Verso: " + mesaj);
    }
}
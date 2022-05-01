package clase;

public class CardBancar implements ModPlata {
    @Override
    public void plateste(int suma) {
        System.out.println("S-a platit cu card bancar suma: " + suma);
    }
}
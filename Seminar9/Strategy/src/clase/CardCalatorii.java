package clase;

public class CardCalatorii implements ModPlata {
    @Override
    public void plateste(int suma) {
        System.out.println("S-a platit cu card calatorii suma: " + suma);
    }
}
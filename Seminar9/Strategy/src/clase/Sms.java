package clase;

public class Sms implements ModPlata {
    @Override
    public void plateste(int suma) {
        System.out.println("S-a platit cu sms suma: " + suma);
    }
}
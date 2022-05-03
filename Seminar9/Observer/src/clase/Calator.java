package clase;

public class Calator implements Observer {
    String nume;

    public Calator(String nume) {
        this.nume = nume;
    }

    @Override
    public void primesteAnunt(String anunt) {
        System.out.println(nume + ", ai primit urmatorul anunt: " + anunt);
    }
}
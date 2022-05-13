package clase;

public class LaReparat implements State {
    @Override
    public void schimbaStare(Autobuz autobuz) {
        if (autobuz.getState() instanceof LaCapatDeLinie) {
            autobuz.setState(this);
            System.out.println("Autobuzul " + autobuz.getNrAutobuz() + " este la reparat.");
        } else {
            System.out.println("Autobuzul " + autobuz.getNrAutobuz() + " nu poate fi la reparat deoarece nu a ajuns la capat de linie.");
        }
    }
}

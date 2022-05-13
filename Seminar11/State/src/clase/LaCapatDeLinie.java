package clase;

public class LaCapatDeLinie implements State {
    @Override
    public void schimbaStare(Autobuz autobuz) {
        if (!(autobuz.getState() instanceof LaCapatDeLinie)) {
            autobuz.setState(this);
            System.out.println("Autobuzul " + autobuz.getNrAutobuz() + " a ajuns la capat de linie.");
        } else {
            System.out.println("Autobuzul " + autobuz.getNrAutobuz() + " este deja la capat de linie.");
        }
    }
}

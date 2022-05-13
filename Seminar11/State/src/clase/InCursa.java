package clase;

public class InCursa implements State {
    @Override
    public void schimbaStare(Autobuz autobuz) {
        if (autobuz.getState() instanceof LaCapatDeLinie) {
            autobuz.setState(this);
            System.out.println("Autobuzul " + autobuz.getNrAutobuz() + " pleaca in cursa.");
        } else {
            System.out.println("Autobuzul " + autobuz.getNrAutobuz() + " este deja in cursa.");
        }
    }
}

package clase;

public class Autobuz {
    private int nrAutobuz;
    private State state;

    public Autobuz(int nrAutobuz) {
        this.state = new LaCapatDeLinie();
        this.nrAutobuz = nrAutobuz;
    }

    public int getNrAutobuz() {
        return nrAutobuz;
    }

    public State getState() {
        return state;
    }

    protected void setState(State state) {
        this.state = state;
    }

    public void pleacaInCursa() {
        State state = new InCursa();
        state.schimbaStare(this);
    }

    public void ajungeLaCapatDeLinie() {
        State state = new LaCapatDeLinie();
        state.schimbaStare(this);
    }

    public void intraInService() {
        State state = new LaReparat();
        state.schimbaStare(this);
    }

    public void ieseDinService() {
        State state = new LaCapatDeLinie();
        state.schimbaStare(this);
    }
}

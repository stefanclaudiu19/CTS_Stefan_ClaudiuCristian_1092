package clase;

public class Autobuz implements MijlocTransport {
    int nrPasageri;
    int nrLinie;

    public Autobuz(int nrPasageri, int nrLinie) {

        this.nrPasageri = nrPasageri;
        this.nrLinie = nrLinie;
    }

    public int getNrPasageri() {
        return nrPasageri;
    }

    public void setNrPasageri(int nrPasageri) {
        this.nrPasageri = nrPasageri;
    }

    public int getNrLinie() {
        return nrLinie;
    }

    @Override
    public void opresteInStatie() {
        System.out.println("Autobuzul de pe linia " + this.getNrLinie() + " opreste in statie cu " + this.getNrPasageri() + " calatori");
    }
}
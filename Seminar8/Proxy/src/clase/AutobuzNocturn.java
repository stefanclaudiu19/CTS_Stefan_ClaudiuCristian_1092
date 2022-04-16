package clase;

public class AutobuzNocturn implements MijlocTransport {
    Autobuz autobuz;

    public AutobuzNocturn(Autobuz autobuz) {
        this.autobuz = autobuz;
    }

    @Override
    public void opresteInStatie() {
        if (autobuz.getNrPasageri() > 0) {
            autobuz.opresteInStatie();
        } else {
            System.out.println("Autobuzul se retrage la capat de linie");
        }
    }

    @Override
    public void setNrPasageri(int nrPasageri) {
        autobuz.setNrPasageri(nrPasageri);
    }
}
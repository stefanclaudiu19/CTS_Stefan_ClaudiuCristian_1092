package clase;

public class ComandaPlecareTraseu implements Comanda {
    private Autobuz autobuz;
    private int nrLinie;

    public ComandaPlecareTraseu(Autobuz autobuz, int nrLinie) {
        this.autobuz = autobuz;
        this.nrLinie = nrLinie;
    }

    @Override
    public void executa() {
        autobuz.pleacaPeTraseu(nrLinie);
    }
}

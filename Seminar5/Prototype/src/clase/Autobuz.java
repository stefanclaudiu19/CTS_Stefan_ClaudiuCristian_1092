package clase;

import prototype.MijlocTransport;

public class Autobuz implements MijlocTransport {
    private String soferAutobuz;

    public Autobuz(String soferAutobuz) {
        this.soferAutobuz = soferAutobuz;
    }

    public void setSoferAutobuz(String soferAutobuz) {
        this.soferAutobuz = soferAutobuz;
    }

    public String getSoferAutobuz() {
        return soferAutobuz;
    }

    @Override
    public String toString() {
        return "Autobuz{" +
                "soferAutobuz='" + soferAutobuz + '\'' +
                '}';
    }

    @Override
    public MijlocTransport copiaza() throws CloneNotSupportedException {
        return (MijlocTransport) super.clone();
    }
}

package factory;

import clase.*;

public class Factory {
    public MijlocTransport creareMijlocTransport(TipMijlocTransport tip, String nrInmatriculare) {
        switch (tip) {
            case Autobuz:
                return new Autobuz(nrInmatriculare);
            case Tramvai:
                return new Tramvai(nrInmatriculare);
            case Troleibuz:
                return new Troleibuz(nrInmatriculare);
            default:
                return null;
        }
    }
}

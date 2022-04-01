package factory;

import clase.Autobuz;
import clase.MijlocTransport;

public class AutobuzFactory implements AbstractFactory {
    @Override
    public MijlocTransport creareMijlocTransport(String nrInmatriculare) {
        return new Autobuz(nrInmatriculare);
    }
}

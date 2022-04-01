package factory;

import clase.MijlocTransport;
import clase.Troleibuz;

public class TroleibuzFactory implements AbstractFactory {
    @Override
    public MijlocTransport creareMijlocTransport(String nrInmatriculare) {
        return new Troleibuz(nrInmatriculare);
    }
}

package factory;

import clase.MijlocTransport;
import clase.Tramvai;

public class TramvaiFactory implements AbstractFactory {
    @Override
    public MijlocTransport creareMijlocTransport(String nrInmatriculare) {
        return new Tramvai(nrInmatriculare);
    }
}

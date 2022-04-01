package factory;

import clase.MijlocTransport;

public interface AbstractFactory {
    public MijlocTransport creareMijlocTransport(String nrInmatriculare);
}

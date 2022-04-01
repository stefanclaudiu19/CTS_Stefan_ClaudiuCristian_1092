package main;

import clase.MijlocTransport;
import factory.AutobuzFactory;
import factory.TramvaiFactory;
import factory.TroleibuzFactory;

public class Main {
    public static void main(String[] args) {
        MijlocTransport autobuz = new AutobuzFactory().creareMijlocTransport("B-100-STB");
        MijlocTransport tramvai = new TramvaiFactory().creareMijlocTransport("B-200-STB");
        MijlocTransport troleibuz = new TroleibuzFactory().creareMijlocTransport("B-300-STB");

        autobuz.afisareNrInmatriculare();
        tramvai.afisareNrInmatriculare();
        troleibuz.afisareNrInmatriculare();
    }
}

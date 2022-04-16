package main;

import clase.Autobuz;
import clase.AutobuzNocturn;
import clase.MijlocTransport;

public class Main {
    public static void main(String[] args) {
        MijlocTransport autobuz = new Autobuz(6, 124);
        autobuz.opresteInStatie();

        MijlocTransport autobuzNoapte = new AutobuzNocturn((Autobuz) autobuz);
        autobuzNoapte.opresteInStatie();

        //sau simplu fara seter autobuz.setNrPasageri(0);
        autobuzNoapte.setNrPasageri(0);
        autobuzNoapte.opresteInStatie();
    }
}
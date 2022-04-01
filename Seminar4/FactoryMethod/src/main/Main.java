// 1. Companie de transport in comun - STB.
//  Trebuie implementat un modul care sa creeze obiecte de tipul MijlocTransport: Autobuz, Tramvai, Troleibuz
//  Modulul trebuie sa ajute la crearea de obiecte de familia de clase MijlocTransport
//  Tipurile de transport sunt salvate intr-un enum{Autobuz, Tramvai, Troleibuz}.

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

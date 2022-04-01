// 1. Companie de transport in comun - STB.
//  Trebuie implementat un modul care sa creeze obiecte de tipul MijlocTransport: Autobuz, Tramvai, Troleibuz
//  Modulul trebuie sa ajute la crearea de obiecte de familia de clase MijlocTransport
//  Tipurile de transport sunt salvate intr-un enum{Autobuz, Tramvai, Troleibuz}.

package main;

import clase.MijlocTransport;
import clase.TipMijlocTransport;
import factory.Factory;

public class Main {
    public static void main(String[] args) {
        Factory factory = new Factory();
        MijlocTransport autobuz = factory.creareMijlocTransport(TipMijlocTransport.Autobuz, "B-123-STB");
        MijlocTransport tramvai = factory.creareMijlocTransport(TipMijlocTransport.Tramvai, "B-456-STB");
        MijlocTransport troleibuz = factory.creareMijlocTransport(TipMijlocTransport.Troleibuz, "B-789-STB");

        autobuz.afisareNrInmatriculare();
        tramvai.afisareNrInmatriculare();
        troleibuz.afisareNrInmatriculare();
    }
}

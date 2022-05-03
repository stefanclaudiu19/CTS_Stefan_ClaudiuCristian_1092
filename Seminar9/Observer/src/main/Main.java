package main;

import clase.Autobuz;
import clase.Calator;

public class Main {
    public static void main(String[] args) {
        Autobuz autobuz = new Autobuz("Autobuzul a plecat de la capatul de linie.");

        Calator c1 = new Calator("Rares");
        Calator c2 = new Calator("Mihaela");
        Calator c3 = new Calator("Georgiana");
        Calator c4 = new Calator("Vlad");

        autobuz.anuntaCalator();

        autobuz.adaugaObserver(c1);
        autobuz.adaugaObserver(c2);
        autobuz.anuntaCalator();

        autobuz.eliminaObserver(c1);
        autobuz.eliminaObserver(c2);
        autobuz.adaugaObserver(c3);
        autobuz.adaugaObserver(c4);
        autobuz.anuntaCalator();
    }
}

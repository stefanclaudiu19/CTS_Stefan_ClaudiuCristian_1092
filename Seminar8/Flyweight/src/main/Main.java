package main;

import clase.Autobuz;
import clase.LinieFactory;

public class Main {
    public static void main(String[] args) {
        Autobuz a1 = new Autobuz("Mercedes", 2008, 30);
        Autobuz a2 = new Autobuz("Ford", 2001, 40);
        Autobuz a3 = new Autobuz("Renault", 2010, 35);
        Autobuz a4 = new Autobuz("BMW", 2012, 18);

        LinieFactory factory = new LinieFactory();
        factory.getLinie(137).afiseazaDescriereAutobuz(a1);
        factory.getLinie(137).afiseazaDescriereAutobuz(a2);
        factory.getLinie(140).afiseazaDescriereAutobuz(a3);
        factory.getLinie(158).afiseazaDescriereAutobuz(a4);
    }
}
package main;

import clase.Autobuz;
import clase.Comanda;
import clase.ComandaPlecareTraseu;
import clase.Operator;

public class Main {
    public static void main(String[] args) {
        Autobuz a1 = new Autobuz("B-123-STB");
        Autobuz a2 = new Autobuz("B-456-STB");

        Comanda c1 = new ComandaPlecareTraseu(a1, 1);
        Comanda c2 = new ComandaPlecareTraseu(a2, 2);
        Comanda c3 = new ComandaPlecareTraseu(a1, 2);
        Comanda c4 = new ComandaPlecareTraseu(a2, 5);

        Operator operator = new Operator();

        operator.adaugaComanda(c1);
        operator.adaugaComanda(c2);
        operator.adaugaComanda(c3);
        operator.adaugaComanda(c4);

        operator.executaComanda();
        operator.executaComanda();
        operator.executaComanda();
        operator.executaComanda();
    }
}

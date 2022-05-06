package main;

import clase.Autobuz;
import clase.ManagerAutobuz;

public class Main {
    public static void main(String[] args) {
        Autobuz autobuz = new Autobuz("Marian Mocanu", 3, 2019, "BMW", 30);

        ManagerAutobuz manager = new ManagerAutobuz();
        manager.add(autobuz.save());

        autobuz.setNume("Mihai Ionescu");
        manager.add(autobuz.save());

        autobuz.setConsumMediu(5);
        manager.add(autobuz.save());

        System.out.println(autobuz.toString());
        autobuz.undo(manager.getMemento(0));
        System.out.println(autobuz.toString());
    }
}
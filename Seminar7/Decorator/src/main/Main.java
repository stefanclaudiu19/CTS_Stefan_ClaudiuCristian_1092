package main;

import clase.Decorator;
import clase.DecoratorAbstract;
import clase.Imprimanta;
import clase.InterfataImprimanta;

public class Main {
    public static void main(String[] args) {
        InterfataImprimanta interfataImprimanta = new Imprimanta(5);
        interfataImprimanta.printeazaBilet();

        DecoratorAbstract decoratorAbstract = new Decorator(interfataImprimanta, "Paste fericit!");

        decoratorAbstract.printeazaBilet();
        decoratorAbstract.printeazaVerso();
    }
}

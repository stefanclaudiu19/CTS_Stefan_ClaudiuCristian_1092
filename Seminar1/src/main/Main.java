package main;

import clase.Girafa;
import clase.IngrijitorZOO;
import clase.ZOO;
import clase.Zebra;

public class Main {
    public static void main(String[] args) {
        Girafa g1 = new Girafa("Jana");
        Zebra z1 = new Zebra("Dona");
        IngrijitorZOO ingrijitor = new IngrijitorZOO("Johnny Douglas");
        ZOO zoo = new ZOO("NYC ZOO", ingrijitor);

        zoo.adaugaAnimal(g1);
        zoo.adaugaAnimal(z1);
        zoo.hranesteAnimale("fan");
    }
}
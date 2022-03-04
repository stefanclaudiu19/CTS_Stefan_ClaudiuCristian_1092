package clase;

import java.util.ArrayList;
import java.util.List;

public class ZOO {
    private String nume;
    private IngrijitorZOO ingrijitorZoo;
    private List<Animal> animale;

    public ZOO(String nume, IngrijitorZOO ingrijitorZoo) {
        this.nume = nume;
        this.ingrijitorZoo = ingrijitorZoo;
        this.animale = new ArrayList<>();
    }

    public String getNume() {
        return nume;
    }

    public void setNume(String nume) {
        this.nume = nume;
    }

    public IngrijitorZOO getIngrijitorZoo() {
        return ingrijitorZoo;
    }

    public void setIngrijitorZoo(IngrijitorZOO ingrijitorZoo) {
        this.ingrijitorZoo = ingrijitorZoo;
    }

    public List<Animal> getAnimale() {
        return animale;
    }

    public void setAnimale(List<Animal> animale) {
        this.animale = animale;
    }

    public void adaugaAnimal(Animal animal) {
        this.animale.add(animal);
    }

    public void hranesteAnimale(String mancare) {
        for (Animal animal : this.animale)
            this.ingrijitorZoo.hranesteAnimal(animal, mancare);
    }
}
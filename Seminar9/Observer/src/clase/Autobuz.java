package clase;

import java.util.ArrayList;
import java.util.List;

public class Autobuz implements Subiect {
    List<Observer> observers = new ArrayList<>();
    String anunt;

    public Autobuz(String anunt) {
        this.observers = observers;
        this.anunt = anunt;
    }

    @Override
    public void adaugaObserver(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void eliminaObserver(Observer observer) {
        observers.remove(observer);
    }

    @Override
    public void anuntaCalator() {
        for (Observer observer : observers) {
            observer.primesteAnunt(anunt);
        }
    }
}
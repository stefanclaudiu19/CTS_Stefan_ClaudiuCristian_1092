package clase;

import java.util.ArrayList;

public class ManagerAutobuz {
    ArrayList<MementoAutobuz> listaMemento;

    public ManagerAutobuz() {
        listaMemento = new ArrayList<>();
    }

    public ManagerAutobuz(ArrayList<MementoAutobuz> listaMemento) {
        this.listaMemento = listaMemento;
    }

    public void add(MementoAutobuz a) {
        listaMemento.add(a);
    }

    public MementoAutobuz getMemento(int index) {
        return listaMemento.get(index);
    }
}
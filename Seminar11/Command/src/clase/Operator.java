package clase;

import java.util.ArrayList;
import java.util.List;

public class Operator {
    private List<Comanda> comenzi;

    public Operator() {
        this.comenzi = new ArrayList<>();
    }

    public void adaugaComanda(Comanda comanda) {
        comenzi.add(comanda);
    }

    public void executaComanda() {
        if (!comenzi.isEmpty()) {
            comenzi.get(0).executa();
            comenzi.remove(0);
        } else {
            System.out.println("Nu exista comenzi de executat.");
        }
    }
}

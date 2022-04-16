package clase;

import java.util.HashMap;
import java.util.Map;

public class LinieFactory {
    Map<Integer, Linie> mapFactory;

    public LinieFactory() {
        this.mapFactory = new HashMap<>();
    }

    public Linie getLinie(int nrLinie) {
        if (mapFactory.containsKey(nrLinie)) {
            return mapFactory.get(nrLinie);
        } else {
            Linie linie = new Linie(nrLinie, "prima statie", "ultima statie");
            mapFactory.put(nrLinie, linie);
            return linie;
        }
    }
}
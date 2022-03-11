package clase;

import java.io.FileNotFoundException;
import java.util.List;

public interface Reader {
    List<Aplicant> readAplicanti(String numeFisier) throws FileNotFoundException;
}
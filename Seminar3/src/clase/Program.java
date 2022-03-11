package clase;

import java.io.FileNotFoundException;
import java.util.List;

public class Program {

    public static void main(String[] args) {
        List<Aplicant> listaAngajati;
        AngajatiReader readerAngajati = new AngajatiReader();

        try {
            listaAngajati = readerAngajati.readAplicanti("Seminar3/angajati.txt");
            for (Aplicant angajat : listaAngajati) {
                angajat.afisareAcceptanta();
                angajat.afisareSumaFinantare(1500);
                System.out.println(angajat);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
}

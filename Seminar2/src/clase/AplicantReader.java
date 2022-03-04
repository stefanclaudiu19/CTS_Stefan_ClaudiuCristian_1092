package clase;

import java.util.Scanner;

public class AplicantReader {
    public static void readAplicant(Scanner scanner, Aplicant aplicant) {
        String nume = scanner.next();
        String prenume = scanner.next();
        int varsta = scanner.nextInt();
        int punctaj = scanner.nextInt();
        int numarProiecte = scanner.nextInt();
        String[] denumiri = new String[numarProiecte];
        for (int i = 0; i < numarProiecte; i++) {
            denumiri[i] = scanner.next();
        }
        aplicant.setNume(nume);
        aplicant.setPrenume(prenume);
        aplicant.setVarsta(varsta);
        aplicant.setPunctaj(punctaj);
        aplicant.setDenumiriProiecte(numarProiecte, denumiri);
    }
}

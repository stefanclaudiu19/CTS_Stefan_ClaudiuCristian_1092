package clase;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class StudentiReader implements Reader {
    @Override
    public List<Aplicant> readAplicanti(String numeFisier) throws FileNotFoundException {
        Scanner scanner = new Scanner(new File(numeFisier));
        scanner.useDelimiter(",|\n");
        List<Aplicant> studenti = new ArrayList<>();

        while (scanner.hasNext()) {
            Student student = new Student();
            AplicantReader.readAplicant(scanner, student);
            int anStudii = scanner.nextInt();
            String facultate = scanner.next();
            student.setAnStudii(anStudii);
            student.setFacultate(facultate);
            studenti.add(student);
        }

        scanner.close();
        return studenti;
    }
}
package clase;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class StudentiReader implements Reader {
    @Override
    public List<Aplicant> readAplicanti(String numeFisier) throws FileNotFoundException {
        Scanner input = new Scanner(new File(numeFisier));
        input.useDelimiter(",|\n");
        List<Aplicant> studenti = new ArrayList<>();

        while (input.hasNext()) {
            Student student = new Student();
            AplicantReader.readAplicant(input, student);
            int anStudii = input.nextInt();
            String facultate = input.next();
            student.setAnStudii(anStudii);
            student.setFacultate(facultate);
            studenti.add(student);
        }
        input.close();
        return studenti;
    }
}

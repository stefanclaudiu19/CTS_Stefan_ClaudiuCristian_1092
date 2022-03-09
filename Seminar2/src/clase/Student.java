package clase;

import java.util.Arrays;

public class Student extends Aplicant {
    protected int anStudii;
    protected String facultate;

    public Student() {
        super();
    }

    public Student(String nume, String prenume, int varsta, int punctaj, int numarProiecte, String[] denumireProiect, int anStudii, String facultate) {
        super(nume, prenume, varsta, punctaj, numarProiecte, denumireProiect);
        this.anStudii = anStudii;
        this.facultate = facultate;
    }

    public int getAnStudii() {
        return anStudii;
    }

    public void setAnStudii(int anStudii) {
        this.anStudii = anStudii;
    }

    public String getFacultate() {
        return facultate;
    }

    public void setFacultate(String facultate) {
        this.facultate = facultate;
    }

    @Override
    public String toString() {
        return "Student: Nume = " + nume +
                ", Prenume = " + prenume +
                ", Varsta = " + varsta +
                ", Punctaj = " + punctaj +
                ", NumarProiecte = " + numarProiecte +
                ", DenumiriProiecte = " + Arrays.toString(denumireProiect) +
                ", AnStudii = " + anStudii +
                ", Facultate = " + facultate;
    }
}

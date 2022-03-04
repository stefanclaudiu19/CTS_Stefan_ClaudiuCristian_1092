package clase;

import java.util.Arrays;

public class Angajat extends Aplicant {
    private int salariu;
    private String ocupatie;

    public Angajat() {
        super();
    }

    public Angajat(String nume, String prenume, int varsta, int punctaj, int numarProiecte, String[] denumireProiect, int salariu, String ocupatie) {
        super(nume, prenume, varsta, punctaj, numarProiecte, denumireProiect);
        this.salariu = salariu;
        this.ocupatie = ocupatie;
    }

    public int getSalariu() {
        return salariu;
    }

    public void setSalariu(int salariu) {
        this.salariu = salariu;
    }

    public String getOcupatie() {
        return ocupatie;
    }

    public void setOcupatie(String ocupatie) {
        this.ocupatie = ocupatie;
    }

    @Override
    public String toString() {
        return "Angajat: Nume = " + nume +
                ", Prenume = " + prenume +
                ", Varsta = " + varsta +
                ", Punctaj = " + punctaj +
                ", NumarProiecte = " + numarProiecte +
                ", DenumiriProiecte = " + Arrays.toString(denumireProiect) +
                ", Salariu = " + salariu +
                ", Ocupatie = " + ocupatie;
    }
}

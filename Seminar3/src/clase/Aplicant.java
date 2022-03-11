package clase;

import java.util.Arrays;

public abstract class Aplicant {
    protected static int pragPunctaj = 80;
    protected String nume;
    protected String prenume;
    protected int varsta;
    protected int punctaj;
    protected int numarProiecte;
    protected String[] denumireProiect;

    public Aplicant() {
        super();
    }

    public String getNume() {
        return nume;
    }

    public void setNume(String nume) {
        this.nume = nume;
    }

    public String getPrenume() {
        return prenume;
    }

    public void setPrenume(String prenume) {
        this.prenume = prenume;
    }

    public void setVarsta(int varsta) {
        this.varsta = varsta;
    }

    public void setPunctaj(int punctaj) {
        this.punctaj = punctaj;
    }

    public void setDenumiriProiecte(int numarProiecte, String[] denumiriProiecte) {
        this.numarProiecte = numarProiecte;
        this.denumireProiect = new String[numarProiecte];
        for (int i = 0; i < numarProiecte; i++) {
            this.denumireProiect[i] = denumiriProiecte[i];
        }
    }

    public void afisareAcceptanta() {
        if (punctaj > pragPunctaj) {
            System.out.println("Aplicantul " + nume + " " + prenume + " a fost acceptat.");
        } else {
            System.out.println("Aplicantul " + nume + " " + prenume + " nu a fost acceptat.");
        }
    }

    public void afisareSumaFinantare(int sumaFinantata) {
        System.out.println("Aplicantul " + getNume() + " " + getPrenume() + " primeste " + sumaFinantata + " Euro/zi in proiect.");
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("nume=");
        sb.append(nume);
        sb.append(", prenume=").append(prenume);
        sb.append(", varsta=").append(varsta);
        sb.append(", punctaj=").append(punctaj);
        sb.append(", numarProiecte=").append(numarProiecte);
        sb.append(", denumireProiect=").append(Arrays.toString(denumireProiect));
        return sb.toString();
    }
}

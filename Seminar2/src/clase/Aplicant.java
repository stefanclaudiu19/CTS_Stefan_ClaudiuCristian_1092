package clase;

public abstract class Aplicant {
    protected String nume;
    protected String prenume;
    protected int varsta;
    protected int punctaj;
    protected int numarProiecte;
    protected String[] denumireProiect;
    public static int pragPunctaj = 80;

    public Aplicant() {
        super();
    }

    public Aplicant(String nume, String prenume, int varsta, int punctaj, int numarProiecte, String[] denumireProiect) {
        super();
        this.nume = nume;
        this.prenume = prenume;
        this.varsta = varsta;
        this.punctaj = punctaj;
        this.numarProiecte = numarProiecte;
        this.denumireProiect = denumireProiect;
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

    public int getVarsta() {
        return varsta;
    }

    public void setVarsta(int varsta) {
        this.varsta = varsta;
    }

    public int getPunctaj() {
        return punctaj;
    }

    public void setPunctaj(int punctaj) {
        this.punctaj = punctaj;
    }

    public int getNumarProiecte() {
        return numarProiecte;
    }

    public void setNumarProiecte(int nr_proiecte) {
        this.numarProiecte = nr_proiecte;
    }

    public void setDenumiriProiecte(int numarProiecte, String[] denumiriProiecte) {
        this.numarProiecte = numarProiecte;
        this.denumireProiect = new String[numarProiecte];
        for (int i = 0; i < numarProiecte; i++) {
            this.denumireProiect[i] = denumiriProiecte[i];
        }
    }

    public void afisareStatut() {
        if (punctaj > pragPunctaj)
            System.out.println("Aplicantul " + nume + " " + prenume + " a fost acceptat.");
        else
            System.out.println("Aplicantul " + nume + " " + prenume + " nu a fost acceptat.");
    }

    public void afisareSumaFinantata(int sumaFinantata) {
        System.out.println("Aplicantul " + getNume() + " " + getPrenume() + " primeste" + sumaFinantata + " Euro/zi in proiect.");
    }
}

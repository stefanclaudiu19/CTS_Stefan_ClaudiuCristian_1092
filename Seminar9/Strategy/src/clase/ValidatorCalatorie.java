package clase;

public class ValidatorCalatorie {
    private ModPlata modPlata;
    private int pret;

    public ValidatorCalatorie(int pret) {
        this.pret = pret;
        this.modPlata = new CardCalatorii();
    }

    public void setModPlata(ModPlata modPlata) {
        this.modPlata = modPlata;
    }

    public void platesteCalatorie() {
        modPlata.plateste(pret);
    }
}
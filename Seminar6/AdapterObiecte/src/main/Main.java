package main;

import adapter.Adapter;
import transportSubteran.ValidatorMetrou;
import transportSubteran.ValidatorSubteran;
import transportTerestru.ValidatorAutobuz;
import transportTerestru.ValidatorTerestru;

public class Main {
    public static void valideazaBilet(ValidatorTerestru validatorTerestru) {
        validatorTerestru.valideazaBilet();
    }

    public static void valideazaAbonament(ValidatorTerestru validatorTerestru) {
        validatorTerestru.valideazaAbonament();
    }

    public static void main(String[] args) {
        ValidatorTerestru validatorAutobuz = new ValidatorAutobuz();
        ValidatorSubteran validatorMetrou = new ValidatorMetrou();

        valideazaBilet(validatorAutobuz);
        valideazaAbonament(validatorAutobuz);
//        valideazaBilet(validatorMetrou);
//        valideazaAbonament(validatorMetrou);

        Adapter adapter = new Adapter(validatorMetrou);
        valideazaBilet(adapter);
        valideazaAbonament(adapter);
    }
}

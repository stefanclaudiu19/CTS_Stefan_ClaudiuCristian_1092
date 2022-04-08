package main;

import adapter.Adapter;
import transportTerestru.ValidatorAutobuz;
import transportTerestru.ValidatorTerestru;

public class Main {
    public static void main(String[] args) {
        ValidatorTerestru validatorAutobuz = new ValidatorAutobuz();
        validatorAutobuz.valideazaBilet();
        validatorAutobuz.valideazaAbonament();

        ValidatorTerestru validatorMetrou = new Adapter();
        validatorMetrou.valideazaBilet();
        validatorMetrou.valideazaAbonament();
    }
}
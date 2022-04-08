package adapter;

import transportSubteran.ValidatorMetrou;
import transportTerestru.ValidatorTerestru;

public class Adapter extends ValidatorMetrou implements ValidatorTerestru {
    @Override
    public void valideazaBilet() {
        super.valideazaCalatorie();
    }

    @Override
    public void valideazaAbonament() {
        super.valideazaAbonament();
    }
}

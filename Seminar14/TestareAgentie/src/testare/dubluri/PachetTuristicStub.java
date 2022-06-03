package testare.dubluri;

import clase.IPachetTuristic;

public class PachetTuristicStub implements IPachetTuristic {
    @Override
    public boolean poateRezerva() {
        return false;
    }

    @Override
    public void aplicaDiscountVarstnici(int procent) {

    }

    @Override
    public Double getPret() {
        return 1000.0;
    }
}

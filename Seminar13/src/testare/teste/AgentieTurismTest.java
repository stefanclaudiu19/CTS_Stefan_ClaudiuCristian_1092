package testare.teste;

import clase.AgentieTurism;
import clase.IPachetTuristic;
import org.junit.Test;
import testare.dubluri.PachetDummy;
import testare.dubluri.PachetFake;
import testare.dubluri.PachetStub;

import static org.junit.Assert.*;

public class AgentieTurismTest {
    @Test
    public void testAdaugaPachet() {
        AgentieTurism agentieTurism = new AgentieTurism();
        IPachetTuristic pachetDummy = new PachetDummy();
        agentieTurism.adaugaPachet(pachetDummy);
        assertEquals(1, agentieTurism.getNumarPacheteTuristice());
    }

    @Test
    public void testCalculareSumaTotalaPachetStub() {
        AgentieTurism agentieTurism = new AgentieTurism();
        agentieTurism.adaugaPachet(new PachetStub());
        agentieTurism.adaugaPachet(new PachetStub());
        assertEquals(2000.0, agentieTurism.calculareSumaTotalaPachete(), 0.01);
    }

    @Test
    public void testCalculareSumaTotalaPachetFake() {
        AgentieTurism agentieTurism = new AgentieTurism();
        PachetFake pachetFake = new PachetFake();
        PachetFake pachetFake2 = new PachetFake();

        pachetFake.setPret(2000.0);
        pachetFake2.setPret(300.0);

        agentieTurism.adaugaPachet(pachetFake);
        agentieTurism.adaugaPachet(pachetFake2);

        assertEquals(2300.0, agentieTurism.calculareSumaTotalaPachete(), 0.01);
    }
}
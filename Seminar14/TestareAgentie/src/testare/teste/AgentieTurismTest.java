package testare.teste;

import clase.AgentieTurism;
import clase.IPachetTuristic;
import org.junit.Test;
import org.junit.experimental.categories.Category;
import testare.categorii.*;
import testare.dubluri.PachetTuristicDummy;
import testare.dubluri.PachetTuristicFake;
import testare.dubluri.PachetTuristicStub;

import static org.junit.Assert.*;

public class AgentieTurismTest {
    @Test
    @Category(TestDummy.class)
    public void testAdaugaPachet() {
        AgentieTurism agentieTurism = new AgentieTurism();
        IPachetTuristic pachetTuristicDummy = new PachetTuristicDummy();
        agentieTurism.adaugaPachet(pachetTuristicDummy);
        assertEquals(1, agentieTurism.getNumarPacheteTuristice());
    }

    @Test
    @Category(TestStub.class)
    public void testCalculareSumaTotalaPachetStub() {
        AgentieTurism agentieTurism = new AgentieTurism();
        agentieTurism.adaugaPachet(new PachetTuristicStub());
        agentieTurism.adaugaPachet(new PachetTuristicStub());
        assertEquals(2000.0, agentieTurism.calculareSumaTotalaPachete(), 0.01);
    }

    @Test
    @Category(TestFake.class)
    public void testCalculareSumaTotalaPachetFake() {
        AgentieTurism agentieTurism = new AgentieTurism();
        PachetTuristicFake pachetTuristicFake1 = new PachetTuristicFake();
        PachetTuristicFake pachetTuristicFake2 = new PachetTuristicFake();

        pachetTuristicFake1.setPret(2000.0);
        pachetTuristicFake2.setPret(300.0);

        agentieTurism.adaugaPachet(pachetTuristicFake1);
        agentieTurism.adaugaPachet(pachetTuristicFake2);

        assertEquals(2300.0, agentieTurism.calculareSumaTotalaPachete(), 0.01);
    }

    @Test
    @Category({TestFake.class, TestInverse.class})
    public void testInverseCalculareSumaTotalaPachetFake() {
        AgentieTurism agentieTurism = new AgentieTurism();
        PachetTuristicFake pachetTuristicFake1 = new PachetTuristicFake();
        PachetTuristicFake pachetTuristicFake2 = new PachetTuristicFake();

        pachetTuristicFake1.setPret(2000.0);
        pachetTuristicFake2.setPret(300.0);

        agentieTurism.adaugaPachet(pachetTuristicFake1);
        agentieTurism.adaugaPachet(pachetTuristicFake2);

        double total = agentieTurism.calculareSumaTotalaPachete();
        assertEquals(pachetTuristicFake1.getPret(), total - pachetTuristicFake2.getPret(), 0.01);
    }

    @Test
    @Category({TestFake.class, TestBoundary.class})
    public void testInferiorBoundaryCalculareSumaTotalaPachetFake() {
        AgentieTurism agentieTurism = new AgentieTurism();
        assertEquals(0, agentieTurism.calculareSumaTotalaPachete(), 0.01);
    }

    @Test(timeout = 100)
    @Category({TestFake.class, TestPerformance.class})
    public void testPerformanceCalculareSumaTotalaPachetFake() {
        AgentieTurism agentieTurism = new AgentieTurism();
        for (int i = 0; i < 100; i++) {
            PachetTuristicFake pachetTuristicFake = new PachetTuristicFake();
            pachetTuristicFake.setPret(2000.0);
            agentieTurism.adaugaPachet(pachetTuristicFake);
        }
        agentieTurism.calculareSumaTotalaPachete();
    }
}
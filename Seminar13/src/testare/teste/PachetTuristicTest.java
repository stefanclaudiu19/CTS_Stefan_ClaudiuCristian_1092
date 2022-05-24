package testare.teste;

import clase.IPachetTuristic;
import clase.PachetTuristic;
import org.junit.Test;
import testare.dubluri.PersoanaFake;

import static org.junit.Assert.*;

public class PachetTuristicTest {
    @Test
    public void testPoateRezerva() {
        PersoanaFake persoanaFake = new PersoanaFake();
        persoanaFake.setVarsta(25);
        IPachetTuristic pachetTuristic = new PachetTuristic(persoanaFake, "Singapore", 5000.0);
        assertTrue(pachetTuristic.poateRezerva());
    }

    @Test
    public void testBoundary() {
        PersoanaFake persoanaFake = new PersoanaFake();
        persoanaFake.setVarsta(18);
        IPachetTuristic pachetTuristic = new PachetTuristic(persoanaFake, "Singapore", 5000.0);
        assertTrue(pachetTuristic.poateRezerva());
    }

    @Test
    public void testAplicaDiscountVarstniciFake() {
        PersoanaFake persoanaFake = new PersoanaFake();
        persoanaFake.setVarsta(75);
        IPachetTuristic pachetTuristic = new PachetTuristic(persoanaFake, "Singapore", 200.0);
        pachetTuristic.aplicaDiscountVarstnici(10);
        assertEquals(180.0, pachetTuristic.getPret(), 0.01);
    }

    @Test
    public void testNuAplicaDiscountVarstniciFake() {
        PersoanaFake persoanaFake = new PersoanaFake();
        persoanaFake.setVarsta(25);
        IPachetTuristic pachetTuristic = new PachetTuristic(persoanaFake, "Singapore", 200.0);
        pachetTuristic.aplicaDiscountVarstnici(10);
        assertEquals(200.0, pachetTuristic.getPret(), 0.01);
    }

    @Test
    public void testAplicaDiscountVarstniciBoundary() {
        PersoanaFake persoanaFake = new PersoanaFake();
        persoanaFake.setVarsta(65);
        IPachetTuristic pachetTuristic = new PachetTuristic(persoanaFake, "Singapore", 200.0);
        pachetTuristic.aplicaDiscountVarstnici(10);
        assertEquals(180.0, pachetTuristic.getPret(), 0.01);
    }

    @Test
    public void testProcentAplicaDiscountVarstniciBoundary() {
        PersoanaFake persoanaFake = new PersoanaFake();
        persoanaFake.setVarsta(65);
        IPachetTuristic pachetTuristic = new PachetTuristic(persoanaFake, "Singapore", 200.0);
        pachetTuristic.aplicaDiscountVarstnici(100);
        assertEquals(0, pachetTuristic.getPret(), 0.01);
    }
}
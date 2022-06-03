package testare.teste;

import clase.IPachetTuristic;
import clase.PachetTuristic;
import org.junit.Test;
import org.junit.experimental.categories.Category;
import testare.categorii.TestBoundary;
import testare.categorii.TestFake;
import testare.dubluri.PersoanaFake;

import static org.junit.Assert.*;

public class PachetTuristicTest {
    @Test
    @Category(TestFake.class)
    public void testPoateRezervaFake() {
        PersoanaFake persoanaFake = new PersoanaFake();
        persoanaFake.setVarsta(25);
        IPachetTuristic pachetTuristic = new PachetTuristic(persoanaFake, "Singapore", 5000.0);
        assertTrue(pachetTuristic.poateRezerva());
    }

    @Test
    @Category(TestFake.class)
    public void testNuPoateRezervaFake() {
        PersoanaFake persoanaFake = new PersoanaFake();
        persoanaFake.setVarsta(17);
        IPachetTuristic pachetTuristic = new PachetTuristic(persoanaFake, "Singapore", 5000.0);
        assertFalse(pachetTuristic.poateRezerva());
    }

    @Test
    @Category({TestFake.class, TestBoundary.class})
    public void testBoundaryPoateRezervaFake() {
        PersoanaFake persoanaFake = new PersoanaFake();
        persoanaFake.setVarsta(18);
        IPachetTuristic pachetTuristic = new PachetTuristic(persoanaFake, "Singapore", 5000.0);
        assertTrue(pachetTuristic.poateRezerva());
    }

    @Test
    @Category(TestFake.class)
    public void testAplicaDiscountVarstniciFake() {
        PersoanaFake persoanaFake = new PersoanaFake();
        persoanaFake.setVarsta(75);
        IPachetTuristic pachetTuristic = new PachetTuristic(persoanaFake, "Singapore", 200.0);
        pachetTuristic.aplicaDiscountVarstnici(10);
        assertEquals(180.0, pachetTuristic.getPret(), 0.01);
    }

    @Test
    @Category(TestFake.class)
    public void testNuAplicaDiscountVarstniciFake() {
        PersoanaFake persoanaFake = new PersoanaFake();
        persoanaFake.setVarsta(25);
        IPachetTuristic pachetTuristic = new PachetTuristic(persoanaFake, "Singapore", 200.0);
        pachetTuristic.aplicaDiscountVarstnici(10);
        assertEquals(200.0, pachetTuristic.getPret(), 0.01);
    }

    @Test
    @Category({TestFake.class, TestBoundary.class})
    public void testBoundaryAplicaDiscountVarstniciFake() {
        PersoanaFake persoanaFake = new PersoanaFake();
        persoanaFake.setVarsta(65);
        IPachetTuristic pachetTuristic = new PachetTuristic(persoanaFake, "Singapore", 200.0);
        pachetTuristic.aplicaDiscountVarstnici(10);
        assertEquals(180.0, pachetTuristic.getPret(), 0.01);
    }

    @Test
    @Category({TestFake.class, TestBoundary.class})
    public void testBoundaryProcentAplicaDiscountVarstniciFake() {
        PersoanaFake persoanaFake = new PersoanaFake();
        persoanaFake.setVarsta(65);
        IPachetTuristic pachetTuristic = new PachetTuristic(persoanaFake, "Singapore", 200.0);
        pachetTuristic.aplicaDiscountVarstnici(100);
        assertEquals(0, pachetTuristic.getPret(), 0.01);
    }
}
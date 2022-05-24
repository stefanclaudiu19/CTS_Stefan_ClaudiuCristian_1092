package teste;

import static org.junit.Assert.*;

import clase.Persoana;
import org.junit.Test;

public class CheckCNPTest {

    //TO DO: right-bicep, correct

    @Test
    public void checkCNPRight() {
        Persoana persoana = new Persoana("Alina Popescu", "6120509407251");
        assertTrue(persoana.checkCNP());
    }

    @Test
    public void checkCNPBoundaryInf() {
        Persoana persoana = new Persoana("Alin Popescu", "1000101010006");
        assertTrue(persoana.checkCNP());
    }

    @Test
    public void checkCNPBoundarySup() {
        Persoana persoana = new Persoana("Alin Popescu", "9999999999996");
        assertTrue(persoana.checkCNP());
    }

    @Test(expected = IllegalArgumentException.class)
    public void checkCNPErrorMissing13Characters() {
        Persoana persoana = new Persoana("Alin Popescu", "");
        persoana.checkCNP();
    }

    @Test(timeout = 100)
    public void checkCNPPerformanceTime() {
        Persoana persoana = new Persoana("Alin Popescu", "9999999999996");
        persoana.checkCNP();
    }
}

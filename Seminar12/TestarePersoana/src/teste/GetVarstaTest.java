package teste;

import clase.Persoana;
import exceptii.CNPInvalidException;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class GetVarstaTest {
    @Test
    public void getVarstaRight() {
        Persoana p = new Persoana("Maria", "6010410123456");
        assertEquals(21, p.getVarsta());
    }

    @Test
    public void getVarstaBoundaryInf() {
        Persoana p = new Persoana("Maria", "3000101123456");
        assertEquals(222, p.getVarsta());
    }

    @Test
    public void getVarstaBoundarySup() {
        Persoana p = new Persoana("Maria", "6220101123456");
        assertEquals(0, p.getVarsta());
    }

    @Test(expected = NullPointerException.class)
    public void getVarstaErrorCNPNull() {
        Persoana p = new Persoana("Maria", null);
        p.getVarsta();
    }

    @Test(expected = CNPInvalidException.class)
    public void getVarstaErrorCNPInvalid() {
        Persoana p = new Persoana("Maria", "6250101123456");
        p.getVarsta();
    }

    @Test(timeout = 100)
    public void testGetVarstaPerformance() {
        Persoana p = new Persoana("Maria", "6010410123456");
        p.getVarsta();
    }

    @Test
    public void getVarstaTestOrder() {
        Persoana p1 = new Persoana("Maria", "6000410123456");
        Persoana p2 = new Persoana("Ioana", "6010410123456");
        assertTrue(p1.getVarsta() > p2.getVarsta());
    }

    @Test
    public void getVarstaCardinality() {
        Persoana p = new Persoana("Maria", "6210410123456");
        assertEquals(1, p.getVarsta());
    }
}
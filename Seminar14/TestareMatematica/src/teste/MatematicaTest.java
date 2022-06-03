package teste;

import clase.Matematica;
import exceptii.NumitorIncorectException;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.function.Executable;

import java.time.Duration;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

public class MatematicaTest {
    @Test
    public void testRightSuma() {
        Matematica matematica = new Matematica();
        assertEquals(8, matematica.suma(6, 2));
    }

    @Test
    public void testBoundarySuma() {
        Matematica matematica = new Matematica();
        assertEquals(0, matematica.suma(0, 0));
    }

    @Test
    public void testInverseSuma() {
        Matematica matematica = new Matematica();
        int suma = matematica.suma(6, 2);
        assertEquals(6, suma - 2, "Testul a picat.");
    }

    @Test
    public void testPerformanceSuma() {
        Matematica matematica = new Matematica();
        assertTimeout(Duration.ofMillis(10), () -> matematica.suma(6, 2));
    }

    @Test
    public void testRaportExceptie() {
        Matematica matematica = new Matematica();
        assertThrows(NumitorIncorectException.class, () -> matematica.raport(6, 0));
    }

    @Test
    public void testRightRaport() {
        Matematica matematica = new Matematica();
        assertEquals(4, matematica.raport(8, 2), 0.01, "Test picat");
    }

    @Test
    public void testInferiorBoundaryRaport() {
        Matematica matematica = new Matematica();
        assertEquals(-8, matematica.raport(8, -1), 0.01, "Test picat");
    }

    @Test
    public void testSuperiorBoundaryRaport() {
        Matematica matematica = new Matematica();
        assertEquals(8, matematica.raport(8, 1), 0.01, "Test picat");
    }

    @Test
    public void testCrossCheckRaport() {
        Matematica matematica = new Matematica();
        int contor = 0;
        int numarator = 6;
        int numaratorCopy = 6;
        int numitor = 2;
        while (numaratorCopy > 0) {
            numaratorCopy = numaratorCopy - numitor;
            contor++;
        }
        assertEquals(contor, matematica.raport(numarator, numitor));
    }

    @Test
    public void testPerformanceRaport() {
        Matematica matematica = new Matematica();
        assertTimeout(Duration.ofMillis(10), new Executable() {
            @Override
            public void execute() throws Throwable {
                matematica.raport(8, 2);
            }
        });
    }

    @Test
    public void testRightEstePar() {
        Matematica matematica = new Matematica();
        assertTrue(matematica.estePar(4));
    }

    @Test
    public void testRightNuEstePar() {
        Matematica matematica = new Matematica();
        assertFalse(matematica.estePar(5));
    }

    @Test
    public void testPerformanceEstePar() {
        Matematica matematica = new Matematica();
        assertTimeout(Duration.ofMillis(10), new Executable() {
            @Override
            public void execute() throws Throwable {
                matematica.estePar(2);
            }
        });
    }

    @Test
    public void testRightNNumerePare() {
        Matematica matematica = new Matematica();
        assertArrayEquals(new Integer[]{0, 2, 4}, matematica.nNumerePare(3).toArray());
    }

    @Test
    public void testConformanceNNumerePare() {
        Matematica matematica = new Matematica();
        List<Integer> listaNNumerePare = matematica.nNumerePare(3);
        assertEquals(3, listaNNumerePare.size());
    }

    @Test
    public void testPerformanceNNumerePare() {
        Matematica matematica = new Matematica();
        assertTimeout(Duration.ofMillis(10), new Executable() {
            @Override
            public void execute() throws Throwable {
                matematica.nNumerePare(100);
            }
        });
    }
}
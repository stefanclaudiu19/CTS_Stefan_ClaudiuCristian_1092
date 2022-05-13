package teste;

import clase.Matematica;
import org.junit.Test;

import static org.junit.Assert.*;

public class MatematicaTest {
    //    @Test
//    public void test() {
//        fail("Not yet implemented");
//    }

    Matematica matematica = new Matematica();

    @Test
    public void test() {
        int suma;
        suma = matematica.suma(3, 5);
        assertEquals(8, suma);
    }
}
package testare.suite;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import testare.teste.AgentieTurismTest;
import testare.teste.PachetTuristicTest;

@RunWith(Suite.class)
@Suite.SuiteClasses({AgentieTurismTest.class, PachetTuristicTest.class})
public class SuitaTesteComplete {
}

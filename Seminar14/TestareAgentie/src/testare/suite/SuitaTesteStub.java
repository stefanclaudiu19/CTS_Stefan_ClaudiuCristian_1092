package testare.suite;

import org.junit.experimental.categories.Categories;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import testare.categorii.TestStub;
import testare.teste.AgentieTurismTest;
import testare.teste.PachetTuristicTest;

@RunWith(Categories.class)
@Suite.SuiteClasses({AgentieTurismTest.class, PachetTuristicTest.class})
@Categories.IncludeCategory(TestStub.class)
public class SuitaTesteStub {
}

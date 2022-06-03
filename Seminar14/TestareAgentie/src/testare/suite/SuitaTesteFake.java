package testare.suite;

import org.junit.experimental.categories.Categories;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import testare.categorii.TestBoundary;
import testare.categorii.TestFake;
import testare.categorii.TestInverse;
import testare.categorii.TestPerformance;
import testare.teste.AgentieTurismTest;
import testare.teste.PachetTuristicTest;

@RunWith(Categories.class)
@Suite.SuiteClasses({AgentieTurismTest.class, PachetTuristicTest.class})
@Categories.IncludeCategory(TestFake.class)
@Categories.ExcludeCategory({TestBoundary.class, TestInverse.class, TestPerformance.class})
public class SuitaTesteFake {
}

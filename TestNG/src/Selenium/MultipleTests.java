package Selenium;
import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import org.testng.Assert;
import org.testng.SkipException;
import org.testng.annotations.Test;

public class MultipleTests {

	@Test(priority = 0)
	public void z_test() {
		AssertJUnit.fail();
	}
	@Test(priority = 2)
	public void a_test() {
		AssertJUnit.assertTrue(17>14);
	}
	@Test(priority = 1)
	public void t_test() {
		throw new SkipException("Skip Test T");
	}
}
 
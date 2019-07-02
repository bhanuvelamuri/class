package TestNG.Listner;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Listeners;

import SeleniumConstreants.constrants;

@Listeners(TestNG.Listner.TestNgListner.class)
public class TestClass {
	public WebDriver driver;
	@BeforeTest
	public void testClassBegin() {
		
	}
	@AfterTest
	public void testClassEnd() {
		
	}
	@Test
	public void Login() {
		System.setProperty(constrants.chromeKey, constrants.chromeDriverPath);
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		String baseUrl = "http://www.scribd.com/";
		String Expectedtitle= null;
		String Actualtitle= null;
	}
}

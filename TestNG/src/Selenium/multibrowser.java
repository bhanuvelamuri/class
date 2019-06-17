package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import SeleniumConstreants.constrants;

public class multibrowser {

	public WebDriver driver;
	@Parameters("browser")
	@Test
	public void BeforeTest(String browser) {
		if(browser.equalsIgnoreCase("firefox")) {
		System.setProperty(constrants.geckoKey, constrants.geckoDriverPath);
		driver = new FirefoxDriver();
	} else if(browser.equalsIgnoreCase("chrome")) {
			System.setProperty(constrants.chromeKey, constrants.chromeDriverPath);
			driver = new ChromeDriver();
		}else if(browser.equalsIgnoreCase("ie")) {
			System.setProperty(constrants.internetExplorer, constrants.IEDriverPath);
			driver = new InternetExplorerDriver();
		}
	driver.get("http://www.google.com");
	
}
	@Test
	public void GoogleTest() {
		WebElement element= driver.findElement(By.name("q"));
		element.sendKeys("google");
		element.submit();
		driver.close();
	}

}
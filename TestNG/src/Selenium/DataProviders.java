package Selenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import SeleniumConstreants.constrants;

public class DataProviders {

	public static WebDriver driver;
	public String baseUrl = "http://newtours.demoaut.com";
	@DataProvider(name="Auth")
	public static String[][] credentials() {
		return new String[][] {{"mercury","mercury1"},{"mercury1","mercury"},{"mercury1","mercury1"},{"mercury","mercury"}};
}
	@Test(dataProvider = "Auth")
	public void testData(String sUser, String sPass) {
		System.setProperty(constrants.chromeKey, constrants.chromeDriverPath);
		driver = new ChromeDriver();
		driver.manage().window().maximize(); 
		driver.get(baseUrl);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.findElement(By.xpath("//input[@name='userName']")).sendKeys(sUser);
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys(sPass);
		driver.findElement(By.xpath("//input[@value='Login']")).click();
		driver.close();
	}
	

}

package Selenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import SeleniumConstreants.constrants;

public class GmailData {
	public static WebDriver driver;
	public String baseUrl = "https://www.gmail.com";
	@DataProvider(name="Auth")
	public static String[][] credentials() {
		return new String[][] {{"bpr1406.v@gmail.com","mercury1"},{"bpr1406.bp@gmail.com","mercury"},{"bpr1406.v@gmail.com","mercury1"},{"bhanu.velamuri@gmail.com","mercury"}};
}
	@Test(dataProvider = "Auth")
	public void testData(String sUser, String sPass) {
		System.setProperty(constrants.chromeKey, constrants.chromeDriverPath);
		driver = new ChromeDriver();
		driver.manage().window().maximize(); 
		driver.get(baseUrl);
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.findElement(By.xpath("//input[@id='identifierId']")).sendKeys(sUser);
		driver.findElement(By.xpath("//span[@class='RveJvd snByac']")).click();
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys(sPass);
		WebDriverWait wait = new WebDriverWait(driver, 10);
		WebElement el = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//span[contains(text(),'Next')]")));
		el.click();
		System.out.println(driver.getTitle());
		driver.close();
	}
	

}

package Selenium;

import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import SeleniumConstreants.constrants;

public class otherAnnotations {
	public WebDriver driver;
	public String baseUrl = "http://demo.guru99.com/test/newtours/";
	@BeforeTest
	public void launcher() {
		System.setProperty(constrants.chromeKey, constrants.chromeDriverPath);
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get(baseUrl);
		
	}
	@AfterTest
	public void close() {
		driver.close();
	}
	@Test(priority = 0)
	public void titlecheck() {
		System.out.println(driver.getTitle());
		String Expectedtitle= "Welcome: Mercury Tours";
		String Actualtitle= driver.getTitle();
		AssertJUnit.assertEquals(Actualtitle, Expectedtitle);
	}
	@Test(priority = 1)
	public void homePage() {
		driver.findElement(By.xpath("//a[contains(text(),'Home')]")).click();
	}
}

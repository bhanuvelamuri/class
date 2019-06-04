package Selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import SeleniumConstreants.constrants;

public class otherAnnotations {
	public WebDriver driver;
	public String baseUrl = "http://demo.guru99.com/test/";
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
	@Test
	public void titlecheck() {
		System.out.println(driver.getTitle());
		String Expectedtitle= "Select Date from DatePicker Demo Page";
		String Actualtitle= driver.getTitle();
		Assert.assertEquals(Actualtitle, Expectedtitle);
	}
}

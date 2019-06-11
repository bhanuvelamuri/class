package Selenium;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.AssertJUnit;
import org.testng.annotations.Test;

import SeleniumConstreants.constrants;

public class grouping {
	
	public WebDriver driver;
	public String baseUrl = "http://demo.guru99.com/test/";
	@Test(groups = "titlecheck")
	public void titlecheck() {
		System.setProperty(constrants.chromeKey, constrants.chromeDriverPath);
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get(baseUrl);
		System.out.println(driver.getTitle());
		String Expectedtitle= "Select Date from DatePicker Demo Page";
		String Actualtitle= driver.getTitle();
		AssertJUnit.assertEquals(Actualtitle, Expectedtitle);
		driver.close();
	}
}

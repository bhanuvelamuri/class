package Selenium;

import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import SeleniumConstreants.constrants;

public class w3schools {
	public WebDriver driver;
	public String baseUrl = "https://www.w3schools.com/html/html5_canvas.asp";
	@BeforeSuite
	public void runningTest() {
		System.out.println( "Stating Test");
		System.setProperty(constrants.chromeKey, constrants.chromeDriverPath);
		driver = new ChromeDriver();
	}
	@AfterSuite
	public void closeTest() {
		System.out.println("Test Completed");
	}
	@BeforeTest
	public void launcher() {
		System.out.println( "opening launcher");
	}
	@AfterTest
	public void close() {
		driver.quit();
		System.out.println("closed driver");
	}
	@BeforeClass
	public void url() {
		driver.manage().window().maximize(); 
		driver.get(baseUrl);
		System.out.println("opening url and maximize window");
	}
	@AfterClass
	public void closetab() {
		System.out.println("closing driver");
		driver.close();
	}
	@BeforeMethod
	public void teststart() {
		driver.manage().window().maximize(); 
		driver.get(baseUrl);
		System.out.println("test loading");
	}
	@AfterMethod
	public void testend() {
		System.out.println("test passed");
	}
	
	@Test(priority = 0)
	public void homePage() {
		driver.findElement(By.xpath("//div[@id='main']//div[6]//a[1]")).click();
		ArrayList<String> tabs = new ArrayList<String> (driver.getWindowHandles());
	    driver.switchTo().window((String) tabs.get(1));
	    WebElement run = driver.findElement(By.xpath("//button[@class='w3-button w3-bar-item w3-green w3-hover-white w3-hover-text-green']"));
	    System.out.println("**"+run.getTagName()+"**");
	    System.out.println("**"+run.getText()+"**");
	    
		
	}

}

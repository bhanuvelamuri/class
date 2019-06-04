package Selenium;

import org.testng.annotations.AfterClass;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.AssertJUnit;
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

public class TestAnnotations {
	public class exercise {
		
		public WebDriver driver;
		public String baseUrl = "http://demo.guru99.com/test/newtours/";
		String Expectedtitle= null;
		String Actualtitle= null;
		@BeforeSuite
		public void runningTest() {
			System.out.println( "opening launcher");
			System.setProperty(constrants.chromeKey, constrants.chromeDriverPath);
			driver = new ChromeDriver();
		}
		@AfterSuite
		public void closeTest() {
			System.out.println("Test Completed");
		}
		@BeforeTest
		public void launcher() {  
			System.out.println( "Stating Test");
		}
		@AfterTest
		public void close() {
			System.out.println("closed driver");
		}
		@BeforeClass
		public void url() {
			driver.manage().window().maximize(); 
			driver.get(baseUrl);
			System.out.println("maximize window opening url and maximize window");
		}
		@AfterClass
		public void closetab() {
			System.out.println("closing driver");
			driver.close();
		}
		@BeforeMethod
		public void titlecheck() {
			System.out.println(driver.getTitle() + "@BeforeMethod");
		}
		@Test(priority = 0)
		public void homePage() {
			System.out.println(driver.getTitle() + "priority = 0");
			
		}
		
		@Test(priority = 1)
		public void hotel() {
			System.out.println(driver.getTitle() + "priority = 1");
		}
		@Test(priority = 2)
		public void vacations() {
			System.out.println(driver.getTitle() + "priority = 2");
		}
		@AfterMethod
		public void titlecheck1() {
			System.out.println(driver.getTitle() + "@AfterMethod");
			
		}

}

}

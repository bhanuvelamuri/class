package Selenium;

import org.testng.annotations.AfterClass;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.testng.AssertJUnit;
import org.testng.annotations.AfterClass;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.testng.AssertJUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
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

public class exercise {
	
		public WebDriver driver;
		public String baseUrl = "http://demo.guru99.com/test/newtours/";
		String Expectedtitle= null;
		String Actualtitle= null;
		@BeforeSuite
		public void runningTest() {
			System.setProperty(constrants.chromeKey, constrants.chromeDriverPath);
			driver = new ChromeDriver();
			System.out.println( "Stating Test");
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
		public void titlecheck() {
			System.out.println(driver.getTitle() + "@BeforeMethod");
			String Expectedtitle= "Welcome: Mercury Tours";
			String Actualtitle= driver.getTitle();
			AssertJUnit.assertEquals(Actualtitle, Expectedtitle);
		}
		@Test(priority = 0)
		public void homePage() {
			driver.findElement(By.xpath("//a[contains(text(),'Home')]")).click();
			String Expectedtitle= "Welcome: Mercury Tours";
			String Actualtitle= driver.getTitle();
			AssertJUnit.assertEquals(Actualtitle, Expectedtitle);
			
		}
		
		@Test(priority = 1)
		public void hotel() {
			driver.findElement(By.xpath("//a[contains(text(),'Hotels')]")).click();
			String Expectedtitle= "Under Construction: Mercury Tours";
			String Actualtitle= driver.getTitle();
			AssertJUnit.assertEquals(Actualtitle, Expectedtitle);
		}
		@Test(priority = 2)
		public void vacations() {
			driver.findElement(By.xpath("//a[contains(text(),'Vacations')]")).click();
			String Expectedtitle= "Under Construction: Mercury Tours";
			String Actualtitle= driver.getTitle();
			AssertJUnit.assertEquals(Actualtitle, Expectedtitle);
		}
		@AfterMethod
		public void titlecheck1() {
			driver.navigate().back();
			System.out.println(driver.getTitle() + "@AfterMethod");
			String Expectedtitle= "Welcome: Mercury Tours";
			String Actualtitle= driver.getTitle();
			AssertJUnit.assertEquals(Actualtitle, Expectedtitle);
		}

}

package Selenium;

import org.testng.annotations.AfterClass;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;

import SeleniumConstreants.constrants;

public class exercise {
	
		public WebDriver driver;
		public String baseUrl = "http://automationpractice.com/index.php";
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
			driver.findElement(By.xpath("//a[@title='Contact Us']")).click();
			Select country = new Select(driver.findElement(By.xpath("//select[@id='id_contact']")));
			country.selectByIndex(1);
			driver.findElement(By.xpath("//input[@id='email']")).sendKeys("bhanu@gmail.com");
			driver.findElement(By.xpath("//input[@id='id_order']")).sendKeys("6545156154");
			driver.findElement(By.xpath("//textarea[@id='message']")).sendKeys("bhanu@gmail.com");
			WebElement uploadElement = driver.findElement(By.xpath("//input[@id='fileUpload']"));
			uploadElement.sendKeys("C:\\Users\\st307_1019.MCIT\\Downloads\\1.1_Introduction_to_program.pdf");
			driver.findElement(By.xpath("//button[@id='submitMessage']")).click();
			
		}


}

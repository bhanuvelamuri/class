package Selenium;

import org.testng.annotations.AfterClass;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;

import SeleniumConstreants.constrants;

public class exercise2 {
	
		public WebDriver driver;
		public String baseUrl = "http://demo.guru99.com/insurance/v1/register.php";
		String Expectedtitle= null;
		String Actualtitle= null;
		@BeforeSuite
		public void runningTest() {
			System.setProperty(constrants.geckoKey, constrants.geckoDriverPath);
			driver = new FirefoxDriver();
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
			driver.close();
		}
		
		@Test(priority = 0)
		public void homePage() throws InterruptedException {
			Select title = new Select(driver.findElement(By.xpath("//select[@id='user_title']")));
			title.selectByIndex(0);
			Thread.sleep(1000);
			driver.findElement(By.xpath("//input[@id='user_firstname']")).sendKeys("bhanu");
			Thread.sleep(1000);
			driver.findElement(By.xpath("//input[@id='user_surname']")).sendKeys("pratap");
			Thread.sleep(1000);
			driver.findElement(By.xpath("//input[@id='user_phone']")).sendKeys("4306544155");
			Thread.sleep(1000);
			driver.findElement(By.xpath("//input[@id='licencetype_f']")).click();
			Thread.sleep(1000);
			Select year = new Select(driver.findElement(By.xpath("//select[@id='user_dateofbirth_1i']")));
			year.selectByVisibleText("1995");
			Thread.sleep(1000);
			Select month = new Select(driver.findElement(By.xpath("//select[@id='user_dateofbirth_2i']")));
			month.selectByIndex(5);
			Thread.sleep(1000);
			Select day = new Select(driver.findElement(By.xpath("//select[@id='user_dateofbirth_3i']")));
			day.selectByVisibleText("14");
			Thread.sleep(1000);
			driver.findElement(By.xpath("//input[@id='licencetype_f']")).click();
			Thread.sleep(1000);
			Select licenceperiod = new Select(driver.findElement(By.xpath("//select[@id='user_licenceperiod']")));
			licenceperiod.selectByIndex(3);
			Thread.sleep(1000);
			Select occupation = new Select(driver.findElement(By.xpath("//select[@id='user_occupation_id']")));
			occupation.selectByVisibleText("Student");
			Thread.sleep(1000);
			driver.findElement(By.xpath("//input[@id='user_address_attributes_street']")).sendKeys("ridgewood ave");
			Thread.sleep(1000);
			driver.findElement(By.xpath("//input[@id='user_address_attributes_city']")).sendKeys("Montreal");
			Thread.sleep(1000);
			driver.findElement(By.xpath("//input[@id='user_address_attributes_county']")).sendKeys("Canada");
			Thread.sleep(1000);
			driver.findElement(By.xpath("//input[@id='user_address_attributes_postcode']")).sendKeys("H3V 5H1");
			Thread.sleep(1000);
			driver.findElement(By.xpath("//input[@id='user_user_detail_attributes_email']")).sendKeys("bhanu@gmail.com");
			Thread.sleep(1000);
			driver.findElement(By.xpath("//input[@id='user_user_detail_attributes_password']")).sendKeys("Bhanu12354%");
			Thread.sleep(1000);
			driver.findElement(By.xpath("//input[@id='user_user_detail_attributes_password_confirmation']")).sendKeys("Bhanu12354%");
			Thread.sleep(1000);
			driver.findElement(By.xpath("//input[@value='Create']")).click();
			Thread.sleep(1000);
			
		}


}

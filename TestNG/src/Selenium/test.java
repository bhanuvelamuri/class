package Selenium;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
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

public class test {
	public static WebDriver driver;
	@Test(dependsOnMethods = {"OpenBrowser"})
	public void login() throws InterruptedException
	{
	
		// TODO Auto-generated method stub
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.findElement(By.xpath("//input[@name='userName']")).sendKeys("mercury");
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys("mercury");
		driver.findElement(By.xpath("//input[@value='Login']")).click();
		Thread.sleep(2000);
		driver.navigate().back();
	}

	@Test
	public void OpenBrowser() {
		System.setProperty(constrants.chromeKey, constrants.chromeDriverPath);
		driver = new ChromeDriver();
		driver.manage().window().maximize(); 
		driver.get(constrants.NEWTOURSURL);
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	}
	@Test(dependsOnMethods = {"login"})
	public void TitleCheck() 
	{
		System.out.println(driver.getTitle());
		Assert.assertEquals("Welcome: Mercury Tours", driver.getTitle());
		
	}
	@Test(dependsOnMethods = {"TitleCheck"})
	public void Support() 
	{
		driver.findElement(By.xpath("//a[contains(text(),'SUPPORT')]")).click();

	}
	@Test(dependsOnMethods = {"Support"})
	public void SourceCode() 
	{
		System.out.println(driver.getPageSource());
		driver.close();
	}
	@Test(dependsOnMethods = {"SourceCode"})
	public void Printing() {
		System.out.println("Test Sucessfull");
	}
	
	
	/*public WebDriver driver;
	public String baseUrl = "http://newtours.demoaut.com";
	@BeforeSuite
	public void runningTest() {
		System.out.println( "+---------------------------------------------+");
		System.out.println( "|        opening launcher                     |");
		System.out.println( "+---------------------------------------------+");
		System.setProperty(constrants.chromeKey, constrants.chromeDriverPath);
		driver = new ChromeDriver();
	}
	
	@BeforeTest
	public void launcher() {  
		driver.manage().window().maximize(); 
		System.out.println( "+---------------------------------------------+");
		System.out.println( "|        maximizing window                    |");
		System.out.println( "+---------------------------------------------+");
		driver.get(baseUrl);
		System.out.println("|        opening url                          |");
		System.out.println( "+---------------------------------------------+");
		
	}
	
	@BeforeClass
	public void url() {
		System.out.println( "|        Stating Test                         |");
		System.out.println( "+---------------------------------------------+");
	}
	
	@Test
	public void login() throws InterruptedException {
		// TODO Auto-generated method stub
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.findElement(By.xpath("//input[@name='userName']")).sendKeys("mercury");
		System.out.println("Entering Username");
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys("mercury");
		System.out.println("Entering Password");
		driver.findElement(By.xpath("//input[@value='Login']")).click();
		System.out.println("clicking on submit");
		String expetedurl = "http://newtours.demoaut.com/mercuryreservation.php";
		String actualurl = driver.getCurrentUrl();
		if(actualurl.contains(expetedurl)) {
			System.out.println("login successfull");
		}
		else {
			System.out.println("login failed");
		}
		
		driver.navigate().back();
	}
	@AfterClass
	public void closetab() {
		System.out.println(driver.getTitle());
		Assert.assertEquals("Welcome: Mercury Tours", driver.getTitle());
		System.out.println("Title Printed");
	}
	
	@AfterTest
	public void close() {
		driver.findElement(By.xpath("//a[contains(text(),'SUPPORT')]")).click();
		System.out.println(driver.getPageSource());
		System.out.println( "+----------------------------------------------");
	}
	@AfterSuite
	public void closeTest() {
		driver.close();
		System.out.println("Test Completed");
	}*/
}

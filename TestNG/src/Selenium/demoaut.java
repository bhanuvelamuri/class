package Selenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import SeleniumConstreants.constrants;

public class demoaut {
	public WebDriver driver;
	public String baseUrl = "http://newtours.demoaut.com";
	@BeforeSuite
	public void runningTest() {
		System.out.println( "+----------------------------------------------");
		System.out.println( "|        opening launcher");
		System.out.println( "+----------------------------------------------");
		System.setProperty(constrants.chromeKey, constrants.chromeDriverPath);
		driver = new ChromeDriver();
	}
	
	@BeforeTest
	public void launcher() {  
		driver.manage().window().maximize(); 
		System.out.println( "+----------------------------------------------");
		System.out.println( "|        maximizing window");
		System.out.println( "+----------------------------------------------");
		driver.get(baseUrl);
		System.out.println("|        opening url");
		System.out.println( "+----------------------------------------------");
		
	}
	
	@BeforeClass
	public void url() {
		System.out.println( "|        Stating Test");
		System.out.println( "+----------------------------------------------");
	}
	
	@Test
	public void login() throws InterruptedException {
		// TODO Auto-generated method stub
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.findElement(By.xpath("//input[@name='userName']")).sendKeys("mercury");
		System.out.println("|        Entering Username");
		System.out.println( "+----------------------------------------------");
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys("password");
		System.out.println("|        Entering Password");
		System.out.println( "+----------------------------------------------");
		driver.findElement(By.xpath("//input[@value='Login']")).click();
		System.out.println("|        clicking on submit");
		System.out.println( "+----------------------------------------------");
		System.out.println("|        clicking on submit" + driver.getCurrentUrl());
		System.out.println( "+----------------------------------------------");
	}
	@AfterClass
	public void closetab() {
		System.out.println("|        closing driver");
		System.out.println( "+----------------------------------------------");
	}
	
	@AfterTest
	public void close() {
		driver.close();
		System.out.println("|        driver closed");
		System.out.println( "+----------------------------------------------");
	}
	@AfterSuite
	public void closeTest() {
		System.out.println("Test Completed");
	}
}

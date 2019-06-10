package Selenium;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import SeleniumConstreants.constrants;

public class demoaut2 {
	
	 
	public static void main(String args[]) throws InterruptedException {
		WebDriver driver;
		String baseUrl = "http://newtours.demoaut.com";
		System.out.println( "+---------------------------------------------+");
		System.out.println( "|        opening launcher                     |");
		System.out.println( "+---------------------------------------------+");
		System.setProperty(constrants.internetExplorer, constrants.IEDriverPath);
		driver = new InternetExplorerDriver();
 
		driver.manage().window().maximize(); 
		System.out.println( "+---------------------------------------------+");
		System.out.println( "|        maximizing window                    |");
		System.out.println( "+---------------------------------------------+");
		driver.get(baseUrl);
		System.out.println("|        opening url                          |");
		System.out.println( "+---------------------------------------------+");
		
 
	
 
		// TODO Auto-generated method stub
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.findElement(By.xpath("//input[@name='userName']")).sendKeys("mercury");
		System.out.println("|        Entering Username                    |");
		System.out.println( "+---------------------------------------------+");
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys("mercury");
		System.out.println("|        Entering Password                    |");
		System.out.println( "+---------------------------------------------+");
		driver.findElement(By.xpath("//input[@value='Login']")).click();
		System.out.println("|        clicking on submit                   |");
		System.out.println( "+---------------------------------------------+");
		String expetedurl = "http://newtours.demoaut.com/mercuryreservation.php";
		String actualurl = driver.getCurrentUrl();
		if(actualurl.contains(expetedurl)) {
			System.out.println("|        login successfull                |");
		}
		else {
			System.out.println("|        login failed                     |");
		}
		System.out.println( "+---------------------------------------------+");
		System.out.println("|        clicking on submit                   |");
		System.out.println( "+---------------------------------------------+");
		driver.findElement(By.xpath("//input[@value='oneway']")).click();
		Thread.sleep(1000);
		Select Passengers = new Select(driver.findElement(By.xpath("//select[@name='passCount']")));
		Passengers.selectByValue("3");
		Thread.sleep(1000);
		Select Departing  = new Select(driver.findElement(By.xpath("//select[@name='fromPort']")));
		Departing.selectByValue("Seattle");
		Thread.sleep(1000);
		Select On  = new Select(driver.findElement(By.xpath("//select[@name='fromMonth']")));
		On.selectByValue("9");
		Thread.sleep(1000);
		Select onDate  = new Select(driver.findElement(By.xpath("//select[@name='fromDay']")));
		onDate.selectByValue("19");
		Thread.sleep(1000);
		Select Arriving   = new Select(driver.findElement(By.xpath("//select[@name='toPort']")));
		Arriving.selectByValue("Sydney");
		Thread.sleep(1000);
		Select Returning   = new Select(driver.findElement(By.xpath("//select[@name='toMonth']")));
		Returning.selectByValue("3");
		Thread.sleep(1000);
		Select ReturningIn   = new Select(driver.findElement(By.xpath("//select[@name='toDay']")));
		ReturningIn.selectByValue("5");
		Thread.sleep(1000);
		//driver.findElement(By.xpath("//input[@value='Business']")).click();
		List<WebElement> Service  = driver.findElements(By.name("servClass"));
		Service.get(1).click();
		Thread.sleep(1000);
		Select Airline   = new Select(driver.findElement(By.xpath("//select[@name='airline']")));
		Airline.selectByVisibleText("Blue Skies Airlines");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@name='findFlights']")).click();
	 
	 
		driver.close();
		System.out.println("|        driver closed");
		System.out.println( "+----------------------------------------------");
	 
	}
}

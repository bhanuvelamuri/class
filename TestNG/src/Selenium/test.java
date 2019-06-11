package Selenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
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
}

package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import org.testng.Assert;
import org.testng.annotations.Parameters;
import SeleniumConstreants.constrants;

public class parameter32 {

	public WebDriver driver;
	@Test
	@Parameters({"sUser","sPass"})
	public void Login(String sUser, String sPass) {
		System.setProperty(constrants.chromeKey, constrants.chromeDriverPath);
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://newtours.demoaut.com/");
		WebElement email = driver.findElement(By.xpath("//input[@name='userName']\r\n" + 
				""));
		email.sendKeys(sUser);
		
		WebElement pass = driver.findElement(By.xpath("//input[@name='password']"));
		pass.sendKeys(sPass);
		
		WebElement button = driver.findElement(By.xpath("//input[@value='Login']"));
		button.click();
		
		String EUrl = "http://newtours.demoaut.com/mercuryreservation";
		String AUrl = driver.getCurrentUrl();
		boolean check = false;
		if (AUrl.contains(EUrl)) {
			check =true;
		}
		Assert.assertTrue(check);
		driver.close();
		
		

	}
}

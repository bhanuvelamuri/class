package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import org.testng.annotations.Parameters;
import SeleniumConstreants.constrants;

public class parameter {

	public WebDriver driver;
	@Test
	@Parameters({"sUsername","sPassword"})
	public void Login(String sUsername, String sPassword) {
		System.setProperty(constrants.chromeKey, constrants.chromeDriverPath);
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://demo.guru99.com/test/login.html");
		WebElement email = driver.findElement(By.xpath("//input[@id='email']"));
		email.sendKeys(sUsername);
		
		WebElement pass = driver.findElement(By.xpath("//input[@id='passwd']"));
		pass.sendKeys(sPassword);
		
		WebElement button = driver.findElement(By.xpath("//button[@id='SubmitLogin']"));
		button.click();
		driver.close();
		
		

	}
}

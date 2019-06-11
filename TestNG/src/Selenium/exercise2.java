package Selenium;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import SeleniumConstreants.constrants;

public class exercise2 {
	public static WebDriver driver;
	@Test
	public void OpenBrowser() throws InterruptedException {
		System.setProperty(constrants.chromeKey, constrants.chromeDriverPath);
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().window().maximize(); 
		driver.get("http://demo.guru99.com/test/newtours/register.php");
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		Select drpCountry = new Select(driver.findElement(By.xpath("//select[@name='country']")));
		List<WebElement> listofC = drpCountry.getOptions();
		for(int i=0; i<5; ++i) {
			SearchCountry(listofC.get(i).getText());
			driver.quit();
		}
		
		System.out.println(listofC);
		
	}
	private void SearchCountry(String country) throws InterruptedException {
		// TODO Auto-generated method stub
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get("http://google.com");
		WebElement a = driver.findElement(By.xpath("//input[@title='Search']"));
		a.sendKeys("Visiting places in " + country);
		a.submit();
		
	}
}

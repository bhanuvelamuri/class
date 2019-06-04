package Selenium;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class basics {
	@Test
	public void frames() throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\bhanu\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://demo.guru99.com/selenium/deprecated.html");
		driver.switchTo().frame("classFrame");
		driver.findElement(By.linkText("Deprecated")).click();
		Thread.sleep(5000);
		driver.navigate().back();
		driver.switchTo().frame("packageFrame");
		driver.findElement(By.linkText("AddApplicationCache")).click();
		Thread.sleep(5000);
		driver.navigate().back();
		driver.switchTo().frame("packageListFrame");
		driver.findElement(By.linkText("com.thoughtworks.selenium")).click();
		Thread.sleep(5000); 
		driver.close();
		}
	@Test
	public void dropdown() throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\bhanu\\chromedriver.exe");
		WebDriver  driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://demo.guru99.com/test/newtours/register.php");
		Select country = new Select(driver.findElement(By.xpath("//select[@name='country']")));
		country.selectByValue("HUNGARY");
		country.selectByValue("FAROE ISLANDS");
		Thread.sleep(5000);
		driver.findElement(By.xpath("//a[@class='dropdown-toggle']")).click();
		driver.manage().timeouts().implicitlyWait(10,  TimeUnit.SECONDS);
		driver.findElement(By.xpath("//a[contains(text(),'Login')]")).click();
		driver.navigate().back();
		Thread.sleep(5000);
		driver.get("http://jsbin.com/osebed/2");
		Select fruits = new Select(driver.findElement(By.xpath("//*[@id='fruits']")));
		fruits.selectByVisibleText("Banana");
		fruits.selectByVisibleText("Orange");
		Thread.sleep(5000);
		driver.close();
		}
}

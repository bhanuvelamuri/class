package selenium.basics;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class Hoveramazon {
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\bhanu\\chromedriver.exe");
		WebDriver  driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20,  TimeUnit.SECONDS);
		driver.get("https://www.amazon.ca/");
		WebElement hover = driver.findElement(By.xpath("//a[@id='icp-nav-flyout']"));
		Actions a= new Actions(driver);
		a.moveToElement(hover).build().perform();
		driver.findElement(By.linkText("Fran�ais - FR")).click();
		
		
	}

}

package selenium.basics;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class mouseElements {
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\bhanu\\chromedriver.exe");
		WebDriver  driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		WebElement email = driver.findElement(By.xpath("//input[@id='email']"));
		Actions action = new Actions(driver);
		Action shift = action.moveToElement(email).keyDown(email, Keys.SHIFT).sendKeys("bhanu@gmail.com").build();
		shift.perform();
		WebElement birthdayhelp = driver.findElement(By.xpath("//a[@id='birthday-help']"));
		Thread.sleep(2000);
		Action hover = action.moveToElement(birthdayhelp).moveToElement(driver.findElement(By.xpath("//a[@href='/privacy/explanation/']"))).click().build();
		hover.perform();
		
	}
}

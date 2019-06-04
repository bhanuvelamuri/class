package selenium.basics;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class ecommerceExercise {
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\bhanu\\chromedriver.exe");
		WebDriver  driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10,  TimeUnit.SECONDS);
		driver.get("https://demostore.x-cart.com/toys/");
		WebElement email = driver.findElement(By.cssSelector("div.productid-13"));
		Actions a= new Actions(driver);
		Action shift = a.moveToElement(email).build();
		shift.perform();
		driver.findElement(By.xpath("//span[contains(text(),'Add to cart')]")).click();
		driver.findElement(By.xpath("//body[contains(@class,'area-c skin-customer skin-crisp_white-customer skin-theme_tweaker-customer unauthorized target-category one-sidebar sidebar-first responsive-desktop added-product')]/div[14]/div[1]/button[1]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[contains(@type,'submit')]")).click();
		driver.close();
		
	}
}
import static org.testng.Assert.assertEquals;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import SeleniumConstreants.constrants;

public class dependsOnMethods {
	public static WebDriver driver;
	@Test(dependsOnMethods = {"OpenBrowser"})
	public void search() 
	{
		WebElement element = driver.findElement(By.name("q"));
		element.sendKeys("montreal");
		element.submit();
		
	}

	@Test
	public void OpenBrowser() {
		System.setProperty(constrants.chromeKey, constrants.chromeDriverPath);
		driver = new ChromeDriver();
		driver.manage().window().maximize(); 
		driver.get(constrants.URL);
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	}
	@Test(dependsOnMethods = {"search"})
	public void TitleCheck() 
	{
		System.out.println(driver.getTitle());
		Assert.assertEquals("montreal - Google Search", driver.getTitle());
		
	}
	@Test(dependsOnMethods = {"TitleCheck"})
	public void close() 
	{
		driver.close();
	}
}

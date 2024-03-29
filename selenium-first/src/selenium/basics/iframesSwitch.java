package selenium.basics;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class iframesSwitch {
	@Test
	public static void main(String[] args) throws InterruptedException {
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

		
		/*
		System.out.println(driver.findElements(By.className("demo-frame")).size());
		driver.switchTo().frame(driver.findElement(By.className("demo-frame")));
		driver.findElement(By.xpath("//*[@id=\'draggable\']")).click();
		Actions a=new Actions(driver);
		WebElement source= driver.findElement(By.id("draggable"));
		WebElement target= driver.findElement(By.id("droppable"));
		a.dragAndDrop(source, target).build().perform();
		driver.switchTo().defaultContent();
		driver.findElement(By.xpath("/html/body/div[1]/div[2]/div/div[1]/div[1]/ul/li[2]/a")).click();
		*/
		driver.close();
		
	}

}




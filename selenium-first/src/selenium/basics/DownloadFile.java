package selenium.basics;

import java.util.ArrayList;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DownloadFile {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "C:\\bhanu\\chromedriver.exe");
		WebDriver  driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20,  TimeUnit.SECONDS);
		driver.get("http://chromedriver.chromium.org/");
		driver.findElement(By.xpath("//*[@id=\"sites-canvas-main-content\"]/table/tbody/tr/td/div/div[4]/ul/li[1]/a")).click();;
		ArrayList<String> tabs = new ArrayList<String> (driver.getWindowHandles());
		    System.out.println(tabs.size());
		    driver.switchTo().window((String) tabs.get(1));
		    /* Actions action= new Actions(driver);
			Thread.sleep(5000);
			Action a = action.keyDown(Keys.CONTROL).sendKeys(Keys.TAB).build(); */
		driver.findElement(By.linkText("chromedriver_linux64.zip")).click();
		//a.perform();
		
		
	}

}

package selenium.basics;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class aLocateUiElements {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String title ="Scribd - Read books, audiobooks, and more";
		System.setProperty("webdriver.chrome.driver", "C:\\bhanu\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10,  TimeUnit.SECONDS);
		driver.get("https://www.scribd.com/");
		//finding tag names
		/*System.out.println("Class Name");
		List<WebElement> cl = driver.findElements(By.className("w3-main"));
		for(WebElement we : cl) {
			System.out.println(we.getTagName());
		}
		System.out.println("Link Text");
		List<WebElement> lt = driver.findElements(By.linkText("Try it Yourself �"));
		for(WebElement wel : lt) {
			System.out.println(wel.getTagName());
		}*/
		String actualTitle = "";
		actualTitle = driver.getTitle();
		System.out.println("Actual Title : " + actualTitle);
		System.out.println("============================================================");
		if(title.equals(actualTitle)) {
			System.out.println( "Expected title : " + title);
			System.out.println("Actual Title : " + actualTitle );
			System.out.println("============================================================");
			System.out.println("Matched");
		}
		else if(title != actualTitle) {
			System.out.println( "Expected title : " + title);
			System.out.println("Actual Title : " + actualTitle );
			System.out.println("============================================================");
			System.out.println("not Matched");
		}
		driver.close();
	}

}
 
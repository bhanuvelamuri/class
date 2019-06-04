package selenium.basics;

import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class commonMeathods {
	@Test
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\bhanu\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://linkedin.com");
		String e = driver.getTitle();
		System.out.println(e);
		Thread.sleep(500);
		driver.navigate().to("https://www.scribd.com/");
		String e1 = driver.getTitle();
		System.out.println(e1);
		Thread.sleep(300);
		driver.navigate().refresh();
		String e11 = driver.getTitle();
		System.out.println(e11);
		Thread.sleep(300);
		driver.navigate().back();
		String e12 = driver.getTitle();
		System.out.println(e12);
		Thread.sleep(300);
		driver.navigate().forward();
		String e13 = driver.getTitle();
		System.out.println(e13);
		Thread.sleep(300);
		driver.navigate().to("http://popuptest.com/popuptest1.html");
		String e14 = driver.getTitle();
		System.out.println(e14);
		Thread.sleep(300);
		driver.close();
		driver.quit();
}
}
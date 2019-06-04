package selenium.basics;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class alertExceptionHandling {
	@Test
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\bhanu\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		try {
		driver.get("http://output.jsbin.com/usidix/1");
		driver.findElement(By.xpath("//input[@value='Go!']")).click();
		Thread.sleep(2000);
		System.out.println(driver.switchTo().alert().getText());
		driver.switchTo().alert().accept();
		}
		catch(Exception e){
			System.out.println(e.getMessage());
			System.out.println("No Alert Box");
		}
		Thread.sleep(2000);
		driver.close();	
		
	}
}

package selenium.basics;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class UploadFiles {
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\bhanu\\chromedriver.exe");
		WebDriver  driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20,  TimeUnit.SECONDS);
		driver.get("https://smallpdf.com/compress-pdf");
		WebElement uploadElement = driver.findElement(By.xpath("/html/body/div/div/div[1]/div[4]/div/div/div/div[2]/form/label/input"));
		uploadElement.sendKeys("C:\\Users\\st307_1019.MCIT\\Downloads\\1.1_Introduction_to_program.pdf");
		
		
	}

}

package selenium.basics;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class GmailLogin {
	@Test
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\bhanu\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		//driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);      //implicit wait
		WebDriverWait myWait = new WebDriverWait(driver, 10);  //Explicit wait
		driver.get("https://www.gmail.com"); 
		driver.findElement(By.xpath("//input[@id='identifierId']")).sendKeys("bhanu.velamuri@gmail.com");
		driver.findElement(By.xpath("//span[@class='RveJvd snByac']")).click();               //Explicit wait
		myWait.until(ExpectedConditions.visibilityOfElementLocated(By.name("password")));
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys("Bhanu_8686");
		driver.findElement(By.xpath("//div[@id='passwordNext']")).click();
		driver.close();

	}

} 

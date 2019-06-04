package selenium.basics;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class jFormHandling {
	@Test
	public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver", "C:\\bhanu\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("http://demo.guru99.com/test/login.html");
	WebElement email =driver.findElement(By.xpath("//input[@id='email']"));
	email.sendKeys("bhanu@al.ca");
	WebElement password =driver.findElement(By.xpath("//input[@id='passwd']"));
	password.sendKeys("bha51651");
	WebElement submit =driver.findElement(By.xpath("//button[@id='SubmitLogin']"));
	submit.click();
	driver.navigate().back();
	email = driver.findElement(By.xpath("//input[@id='email']"));
	email.clear();
	email.sendKeys("bhshjkkhs@al.ca");
	password =driver.findElement(By.xpath("//input[@id='passwd']"));
	password.clear();
	password.sendKeys("bha51651");
	submit =driver.findElement(By.xpath("//button[@id='SubmitLogin']"));
	submit.click();
	driver.get("http://demo.guru99.com/test/radio.html");
	//radio butons
	WebElement option1 = driver.findElement(By.xpath("//input[@id='vfb-7-1']"));
	WebElement option2 = driver.findElement(By.xpath("//input[@id='vfb-7-2']"));
	WebElement option3 = driver.findElement(By.xpath("//input[@id='vfb-7-3']"));
	//checkboxes
	WebElement checkbox1 = driver.findElement(By.xpath("//input[@id='vfb-6-0']"));
	WebElement checkbox2 = driver.findElement(By.xpath("//input[@id='vfb-6-1']"));
	WebElement checkbox3 = driver.findElement(By.xpath("//input[@id='vfb-6-2']"));
	//clickin radio buttons
	option1.click();
	option2.click();
	option3.click();
	//clicking checkboxes
	for(int i=0; i<2; i++) {
		checkbox1.click();
		Thread.sleep(2000);
		System.out.println(checkbox1.isSelected());
		}
	
	for(int i=0; i<2; i++) {
		checkbox2.click();
		Thread.sleep(2000);
		System.out.println(checkbox1.isSelected());
		}
	
	for(int i=0; i<2; i++) {
		checkbox3.click();
		Thread.sleep(2000);
		System.out.println(checkbox1.isSelected());
		}
	
	driver.get("http://demo.guru99.com/test/facebook.html");
	WebElement persistbox = driver.findElement(By.xpath("//input[@id='persist_box']"));
		for(int i=0; i<2; i++) {
		persistbox.click();
		Thread.sleep(2000);
		System.out.println(persistbox.isSelected());
		}
			driver.close();
	}
}

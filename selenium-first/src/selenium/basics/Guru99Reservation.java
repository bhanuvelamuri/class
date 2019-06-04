package selenium.basics;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Guru99Reservation {
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\bhanu\\chromedriver.exe");
		WebDriver  driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://demo.guru99.com/test/newtours/reservation.php");
		driver.findElement(By.xpath("//input[@value='oneway']")).click();
		Thread.sleep(1000);
		Select Passengers = new Select(driver.findElement(By.xpath("//select[@name='passCount']")));
		Passengers.selectByValue("3");
		Thread.sleep(1000);
		Select Departing  = new Select(driver.findElement(By.xpath("//select[@name='fromPort']")));
		Departing.selectByValue("Seattle");
		Thread.sleep(1000);
		Select On  = new Select(driver.findElement(By.xpath("//select[@name='fromMonth']")));
		On.selectByValue("9");
		Thread.sleep(1000);
		Select onDate  = new Select(driver.findElement(By.xpath("//select[@name='fromDay']")));
		onDate.selectByValue("19");
		Thread.sleep(1000);
		Select Arriving   = new Select(driver.findElement(By.xpath("//select[@name='toPort']")));
		Arriving.selectByValue("Sydney");
		Thread.sleep(1000);
		Select Returning   = new Select(driver.findElement(By.xpath("//select[@name='toMonth']")));
		Returning.selectByValue("3");
		Thread.sleep(1000);
		Select ReturningIn   = new Select(driver.findElement(By.xpath("//select[@name='toDay']")));
		ReturningIn.selectByValue("5");
		Thread.sleep(1000);
		//driver.findElement(By.xpath("//input[@value='Business']")).click();
		List<WebElement> Service  = driver.findElements(By.name("servClassg ,"));
		Service.get(2).click();
		Thread.sleep(1000);
		Select Airline   = new Select(driver.findElement(By.xpath("//select[@name='airline']")));
		Airline.selectByVisibleText("Blue Skies Airlines");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@name='findFlights']")).click();
		driver.close();
	}
}

package testcases;

import static org.testng.Assert.assertTrue;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import utilities.constrants;
import webpages.OrderPage;
import webpages.PaymentDetails;
import webpages.PaymentSuccess;

public class TestPaymentOrder {
	WebDriver driver;
	OrderPage addingcart;
	PaymentDetails Card;
	@BeforeMethod
	public void setup() {
		System.setProperty(constrants.chromeKey, constrants.chromeDriverPath);
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}
	@Test
	public void adding() {
		driver.get(constrants.PAYMENTGATEWAYURL);
		OrderPage addingcart = new OrderPage(driver);
		addingcart.orderMade("3");
		PaymentDetails Card = new PaymentDetails(driver);
		Card.carddetails("4353706246962226", "12", "2027", "147");
		PaymentSuccess text = new PaymentSuccess(driver);
		text.Sucess();
	}
	@AfterTest
	public void close() { 
		driver.close();
	}
}

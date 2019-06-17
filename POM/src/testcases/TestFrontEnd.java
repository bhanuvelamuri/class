package testcases;

import static org.testng.Assert.assertTrue;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import utilities.constrants;
import webpages.FrontEndLogin;

public class TestFrontEnd  {
	WebDriver driver;
	FrontEndLogin frontLogin;
	@BeforeMethod
	public void setup() {
		System.setProperty(constrants.chromeKey, constrants.chromeDriverPath);
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}
	@Test
	public void login() {
		driver.get("https://www.phptravels.net/admin-portal/admin");
		frontLogin = new FrontEndLogin(driver);
		boolean loginstatus;
		loginstatus = frontLogin.loginFrontEnd("admin@phptravels.com","demoadmin");
		assertTrue(loginstatus);
	}


}

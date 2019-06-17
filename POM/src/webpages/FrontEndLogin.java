package webpages;

import org.openqa.selenium.WebDriver;

import org.openqa.selenium.By;

public class FrontEndLogin {
	WebDriver driver;
			By user = By.xpath("//input[@placeholder='Email']");
			By pass = By.xpath("//input[@placeholder='Password']");
			By remember = By.xpath("//*[@class='iCheck-helper']");
			By click = By.xpath("//button[@type='submit']");
		public FrontEndLogin(WebDriver driver) {
			// TODO Auto-generated constructor stub
			this.driver = driver;
		}


		public boolean loginFrontEnd(String username, String password) {
			// TODO Auto-generated method stub
			driver.findElement(user).sendKeys(username);
			driver.findElement(pass).sendKeys(password);
			driver.findElement(remember).click();
			driver.findElement(click).click();
			String expectedUrlUrl = "https://www.phptravels.net/admin-portal/";
			String currentUrl = driver.getCurrentUrl();
			if(driver.getCurrentUrl().contains(expectedUrlUrl)) 
				return true;
			else
				return false;
			
		}
		}

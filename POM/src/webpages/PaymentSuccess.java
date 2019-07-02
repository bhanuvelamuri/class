package webpages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class PaymentSuccess {
	WebDriver driver;
	By cardnumber = By.xpath("//input[@id='card_nmuber']");
	By month = By.xpath("//select[@id='month']");
	By year = By.xpath("//select[@id='year']");
	By cvv = By.xpath("//input[@id='cvv_code']");
	By click = By.xpath("//*[@name='submit']");
public PaymentSuccess(WebDriver driver) {
	// TODO Auto-generated constructor stub
	this.driver = driver;
}


public void Sucess() {
	// TODO Auto-generated method stub
	WebElement s = driver.findElement(By.xpath("/html[1]/body[1]/section[1]/div[1]/div[1]/table[1]/tbody[1]/tr[1]/td[2]/h3[1]/strong[1]"));
	System.out.println(s.getText());
	

	
}

}

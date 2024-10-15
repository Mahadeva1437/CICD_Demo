package emp.qa.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Sleeper;

public class LoginPage  extends LandingPage{
	
	
	public LoginPage(WebDriver driver) {
		super(driver);
		this.driver=driver;
		PageFactory.initElements(driver, this);	}

	@FindBy(css="#userEmail")
	WebElement emailBox;
	
	
	public HomePage verifyLoginPage(String emai) throws InterruptedException {
	Thread.sleep(1000);
		emailBox.sendKeys(emai);
		Thread.sleep(1000);

		return new HomePage(driver);
	}
	
	

}

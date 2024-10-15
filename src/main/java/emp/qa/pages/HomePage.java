package emp.qa.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import emp.qa.base.TestBase;

public class HomePage extends TestBase {
	public HomePage(WebDriver driver) {
		 WebDriver webDriver = super.driver;
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	
	@FindBy(xpath="//a[text()=\"Earnings\"]")
	WebElement earnBtn;
	
	@FindBy(xpath="//input[@placeholder=\"Enter Your Password\"]")
	WebElement pwdBox;
	
	@FindBy(xpath="//button[text()=\"Login\"]")
	WebElement loginBtn;
	
	
	public void EarnPageVerificationPage() {
		earnBtn.click();
		
	}
}

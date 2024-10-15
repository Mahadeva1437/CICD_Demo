package emp.qa.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import emp.qa.base.TestBase;

public class LandingPage extends TestBase {
	WebDriver driver;
	private WebDriver webDriver;
	
	//@FindBy(css="#userEmail")
	@FindBy(xpath="//input[@placeholder=\"Enter Your Email\"]")
	WebElement emailBox;
	
	@FindBy(xpath="//input[@placeholder=\"Enter Your Password\"]")
	WebElement pwdBox;
	
	@FindBy(xpath="//button[text()=\"Login\"]")
	WebElement loginBtn;
	
	
	////input[@placeholder="Enter Your Password"]
	
	
	public LandingPage(WebDriver driver) {
		webDriver = super.driver;
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	public HomePage goToUrl() throws InterruptedException {
		driver.get("https://powerpoints.powerdao.ai/");
		
		emailBox.sendKeys("wipiyin954@mposhop.com");	
		pwdBox.sendKeys("@Power123");
		loginBtn.click();
		
		return new HomePage(driver);
	}


	
	
	
	
//	public void verifyLoginPage() {
//		emailBox.sendKeys("sadfsfv asfgzvf");
////		return new HomePage();
//	}
	
	
}

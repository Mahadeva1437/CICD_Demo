package FieldTracking.EMPFieldTracking;

import java.nio.channels.Selector;
import java.time.Duration;
import java.util.Arrays;
import java.util.concurrent.TimeUnit;

import javax.swing.Action;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

public class FieldTracking {
//	@FindBy(xpath="//input[@placeholder=\"Search Employee\"]")
//	@FindBy(css = "input[placeholder='Search Employee']")
//	WebElement button;
//
//	@FindBy(css = "div[id='radix-:rca:'] div:nth-child(3)")
//	String selectName;

	
	//@FindBy(xpath="//button[@aria-haspopup=\"dialog\"]")
	@FindBy(xpath="//div[@class=\"flex\"]")
	WebElement CalenderBtn;
	
	@Test
	public void VerifyLiveTracking() throws InterruptedException {
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--incognito");
		
		WebDriver driver = new ChromeDriver(options);
		JavascriptExecutor js = (JavascriptExecutor) driver;
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("https://field-tracking-dev.empmonitor.com/admin/login");
		driver.findElement(By.xpath("//input[@placeholder=\"Email Address\"]")).sendKeys("track2024@blondmail.com");
		driver.findElement(By.xpath("//input[@placeholder=\"Password\"]")).sendKeys("@Mahantesh123");
		driver.findElement(By.xpath("//button[text()=\"Login\"]")).click();
		Thread.sleep(1000);
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));

		// Wait until the element Trending Now is visible
		wait.until(
				ExpectedConditions.visibilityOfElementLocated(By.cssSelector("input[placeholder='Search Employee']")));

		driver.findElement(By.cssSelector("input[placeholder='Search Employee']")).click();

		wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("div[id='radix-:r6:']")));

		System.out.println(driver.findElement(By.xpath("//*[@id=\"radix-:r6:\"]")).getText());

		driver.findElement(By.xpath("//*[@id=\"radix-:r6:\"]/div/h3[text()=\"vedha h\"]")).click();
		driver.findElement(By.xpath("//div[@class=\"flex\"]")).click();
		driver.findElement(By.xpath("//button[.=\"Select\"]")).click();
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[.=\"Today\"]")));
	driver.findElement(By.xpath("//span[.=\"Today\"]")).click();
String Actual=driver.findElement(By.xpath("//div[@class=\"grid grid-cols-6 md:grid-cols-8 justify-between items-center\"]")).getText();
		//CalenderBtn.click();
//		selectName=driver.findElement(By.xpath("//input[@value=\"Anjali A\"]")).getText();
//		System.out.println("Selected user Name = "+ selectName);
//		System.out.println(driver.findElement(By.xpath("//h3[text()=\"Anjali A\"]")).getText());
//		
Assert.assertEquals(Actual, "Logged In Successfully");

System.out.println("===== Employee is successfully Login======== ");

driver.findElement(By.xpath("//img[@alt=\"profile-img\"]")).click();
driver.findElement(By.xpath("//div[@role=\"menuitem\"]//div[.=\"Logout\"]")).click();
		//driver.close();
	}
	
	
	public void highLighterMethod(WebDriver driver, WebElement element){
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].setAttribute('style', 'background: green; border: 2px solid red;');", element);
	}
	

}

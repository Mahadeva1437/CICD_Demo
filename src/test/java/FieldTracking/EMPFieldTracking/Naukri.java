package FieldTracking.EMPFieldTracking;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class Naukri {


	@Test
	public void verifycheckbox() throws InterruptedException {
		
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--incognito");
		
		WebDriver driver = new ChromeDriver(options);
		driver.manage().window().maximize();
		
		driver.get("https://www.naukri.com/");
		driver.findElement(By.xpath("//a[.=\"Login\"]")).click();
		
		
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

		 

	     // Find the element which may not be initially interactable

	        WebElement element = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//div[@class=\"drawer-wrapper \"]//input[@placeholder=\"Enter your active Email ID / Username\"]")));

		
		//element.sendKeys("Har Har Mahadev");
		
		element.sendKeys("mahanteshsb1437@gmail.com");
		
		
//		Thread.sleep(10);
//		driver.findElement(By.xpath("//div[@class=\"drawer-wrapper \"]//input[@placeholder=\"Enter your active Email ID / Username\"]")).sendKeys("mahanteshsb1437@gmail.com");
		Thread.sleep(10);
		driver.findElement(By.xpath("//div[@class=\"naukri-drawer right open\"]//input[@placeholder=\"Enter your password\"]")).sendKeys("Mantu777@");
		driver.findElement(By.xpath("//div[@class=\"naukri-drawer right open\"]//button[.=\"Login\"]")).click();
		
	}
	
}

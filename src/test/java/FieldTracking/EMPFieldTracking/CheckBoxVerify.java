package FieldTracking.EMPFieldTracking;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;

public class CheckBoxVerify {

	
	@Test
	public void verifycheckbox() {
		
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--incognito");
		
		WebDriver driver = new ChromeDriver(options);
		driver.manage().window().maximize();
		
		driver.get("https://www.tutorialspoint.com/selenium/practice/selenium_automation_practice.php");
		
		if(!driver.findElement(By.xpath("//input[@id=\"gender\"]")).isSelected()) {
			
			System.out.println(driver.findElement(By.xpath("//input[@id=\"gender\"]")).isDisplayed());
			driver.findElement(By.xpath("//input[@id=\"gender\"]")).click();
			driver.findElement(By.xpath("//input[@id=\"picture\"]")).sendKeys("C:\\Users\\Official\\Desktop\\MAC Issues\\UI.png");
		}
	}
}

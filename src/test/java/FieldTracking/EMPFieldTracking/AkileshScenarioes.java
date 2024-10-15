package FieldTracking.EMPFieldTracking;

import java.awt.Desktop.Action;
import java.nio.channels.Selector;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class AkileshScenarioes {
	
	@Test
	public void TaskVerify() throws InterruptedException {
		
		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://testautomationpractice.blogspot.com/");
		
		driver.switchTo().frame("frame-one796456169");
		
		driver.findElement(By.id("RESULT_TextField-0")).sendKeys("Har Har Mahadeva");
		
		driver.findElement(By.xpath("//span[@class=\"icon_calendar\"]")).click();
		
		Select ss=new Select(driver.findElement(By.xpath("//select[@aria-label=\"Select year\"]")));
		ss.selectByValue("2016");
		
		
		for (int i = 0; i < 12-6; i++){
			 //click the button
			driver.findElement(By.xpath("//span[text()=\"Prev\"]")).click();
			 //wait 2 seconds
			  Thread.sleep(2000);
			  //check that data is being generated correctly
			 
			}
//		driver.findElement(By.xpath("//span[text()=\"Prev\"]")).click();
		
		driver.findElement(By.xpath("(//div[@id=\"ui-datepicker-div\"]//td//a[@class=\"ui-state-default\"])[29]")).click();
		
		Select ss1=new Select(driver.findElement(By.xpath("//select[@name=\"RESULT_RadioButton-3\"]")));
		//ss1.selectByValue("Radio-3");
		ss1.selectByVisibleText("Manager");
		WebElement Submit=driver.findElement(By.xpath("//input[@id=\"FSsubmit\"]"));
		Actions a=new Actions(driver);
		a.moveToElement(Submit).click().build();
		
//	String	errorValue=driver.findElement(By.xpath("//h1[text()=\"An error has occurred\"]")).getText();
//	System.out.println(errorValue);
	}

}

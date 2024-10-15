package FieldTracking.EMPFieldTracking;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

public class HighlightElement {

	@Test
	public void HighLightElementTest() {
		
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.gmail.com");
		WebElement ele = driver.findElement(By.xpath("//input[@id=\"identifierId\"]"));
                //Call the highlighterMethod and pass webdriver and WebElement which you want to highlight as arguments.
		highLighterMethod(driver,ele);
		ele.sendKeys("SoftwareTestingMaterial.com");
		driver.close();
	}
	
        //Creating a custom function
	public void highLighterMethod(WebDriver driver, WebElement element){
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].setAttribute('style', 'background: green; border: 2px solid red;');", element);
	}
	



}
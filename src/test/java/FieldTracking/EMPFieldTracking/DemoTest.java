package FieldTracking.EMPFieldTracking;

import java.io.IOException;
import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

import emp.qa.base.TestBase;
import emp.qa.pages.LandingPage;
import emp.qa.pages.LoginPage;
import io.github.bonigarcia.wdm.WebDriverManager;

public class DemoTest extends TestBase {
	LoginPage Lpp;
	@Test
	public void OpenUrlHomeapge() throws IOException, InterruptedException {
	    WebDriver driver1 = new ChromeDriver();
        driver1.get("https://field-tracking-dev.empmonitor.com/admin/login");

        // Perform any actions in the normal window
        // ...

        // Now switch to Incognito Mode
        ChromeOptions incognitoOptions = new ChromeOptions();
        incognitoOptions.addArguments("--incognito");

        WebDriver driver = new ChromeDriver(incognitoOptions);
//        driver.get("https://field-tracking-dev.empmonitor.com/admin/login");

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

		System.out.println(driver.findElement(By.xpath("//*[@id=\"radix-:r6:\"]/div[2]")).getText());

		driver.findElement(By.xpath("//*[@id=\"radix-:r6:\"]/div/h3[text()=\"Mahantesh B\"]")).click();

//		String selectName = driver.findElement(By.xpath("//input[@value=\"Anjali A\"]")).getText();
//		System.out.println("Selected user Name = "+ selectName);
//		System.out.println(driver.findElement(By.xpath("(//h3[@class=\"tracking-tight text-xs 2xl:text-sm font-bold text-white\"])[1]")).getText());
        driver1.quit();
  String     ActualResult=driver.findElement(By.xpath("(//h3[@class=\"tracking-tight text-xs 2xl:text-sm font-bold text-white\"])[1]")).getText();
  
  Assert.assertEquals("Mahantesh B", ActualResult);
        driver1.quit();
    //    driver.quit();
    
	}
}

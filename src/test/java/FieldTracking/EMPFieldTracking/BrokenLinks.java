package FieldTracking.EMPFieldTracking;

import java.io.IOException;
import java.net.URL;
import java.nio.file.spi.FileSystemProvider;
import java.util.List;
import java.util.concurrent.TimeUnit;

import javax.net.ssl.HttpsURLConnection;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class BrokenLinks {
	
	
	@Test
	public void VerifyBrokenLinks(){
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://powerdao.ai/");
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		List<WebElement> links=driver.findElements(By.tagName("a"));
		System.out.println(links.size());
		
		for(WebElement E:links) {
			
			String URLs=E.getAttribute("href");
			System.out.println("==========================================");
			System.err.println(URLs);
			if(URLs==null || URLs.isEmpty()) {
				System.out.println("********************************");
				System.out.println("URLis not found");
				continue;				
			}
			 if(!URLs.startsWith("https://powerdao.ai/")){
				 System.out.println("********************************");
	                System.out.println("URL belongs to another domain, skipping it.");
	                continue;
	            }
	            
			try {
				HttpsURLConnection huc= (HttpsURLConnection) (new URL(URLs).openConnection());
				  
				huc.connect();
				
				if(huc.getResponseCode() >=400) {
					
					System.out.println(URLs +"=This url is Broken");
					
				} else {
					System.out.println(URLs +"=This uls is valid ");
				}
				
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		
		driver.close();
		
	
		
	}

	

}

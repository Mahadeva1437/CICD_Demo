package emp.qa.base;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import emp.qa.pages.LandingPage;
import emp.qa.util.ReadConfig;
import io.github.bonigarcia.wdm.WebDriverManager;

public class TestBase {

	public WebDriver driver;
	public static ReadConfig readconfig = new ReadConfig();
	String TestUrl;

//	@BeforeMethod
	public WebDriver initailizeDriver() throws IOException {

		Properties prop = new Properties();

		FileInputStream ip = new FileInputStream(
				"C:\\Users\\Official\\eclipse-workspace\\ZZEMPFieldTracking\\src\\main\\java\\emp\\qa\\properties\\config.properties");
		prop.load(ip);
		String browserName = prop.getProperty("browser");

		// C:\Users\Official\eclipse-workspace\ZZEMPFieldTracking\src\main\java\emp\qa\properties\properties
		// C:\Users\Official\eclipse-workspace\ZZEMPFieldTracking\src\main\java\emp\qa\properties\config.properties

		if (browserName.equalsIgnoreCase("chrome")) {
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
		} else if (browserName.equalsIgnoreCase("firefox")) {
			// firefox set up
		}

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));		// rp.getApplicationUrl(TestUrl);
		driver.manage().window().maximize();
		//driver.get(readconfig.getApplicationUrl("Dev"));
		// driver.get(prop.getProperty(TestUrl));

		return driver;
	}

//	@BeforeMethod
	public LandingPage LaunchApplication() throws IOException, InterruptedException {
		initailizeDriver();
		LandingPage lp = new LandingPage(driver);
		//lp.goToUrl(readconfig.getUserName(), readconfig.getPassword());
		lp.goToUrl();
		
		return lp;
	}

//	@AfterMethod
	public void tearDown() {

		driver.close();
	}

}

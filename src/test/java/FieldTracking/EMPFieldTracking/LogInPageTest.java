package FieldTracking.EMPFieldTracking;

import java.io.IOException;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import emp.qa.base.TestBase;
import emp.qa.pages.HomePage;
import emp.qa.pages.LandingPage;
import emp.qa.pages.LoginPage;

public class LogInPageTest extends TestBase{
	LandingPage pg;
	HomePage mp;
	 
	@BeforeMethod
	public void setUp() throws IOException, InterruptedException {
		initailizeDriver();
	 pg = new LandingPage(driver);
	 LandingPage mp=	 pg.LaunchApplication();
		 
		 
	}
	
	@Test
	
	public void testLoginPage() throws IOException, InterruptedException {
		mp.EarnPageVerificationPage();
	
	}

}


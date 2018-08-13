package testCases.LOS;


import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.*;
import org.testng.annotations.Test;

import pageObjects.Login;
import utils.Constants;
import utils.GetBrowserInstance;
import utils.Keywords;

public class LOS_1_Login {

	GetBrowserInstance browser = new GetBrowserInstance();         	//Creating object for GetBrowserInstance class.
	Login login = new Login();										//Creating object for Login class.
	Keywords keys = new Keywords();	


	WebDriver driver;
	String User = Constants.userName;
	String pwd = Constants.password;
    String actualTitle= "My Ascent Account";
    String testStep ="";

	@BeforeClass
	public void openBrowser()
	{
		driver = browser.getBrowser();
		System.out.println(driver);
	}
    
	@Test()
	public void testLogin() {
		
		try{
			testStep = "Invalid user login";
			invalidUserLogin();
			
			
			testStep = "Valid User Login";
			validUserLogin();
		
		
		}catch(Exception e) {
			System.out.println(e);
			Assert.fail(testStep);
		}
		
	}
     
	
	@AfterClass
	public void closeBrowser()
	{
		driver.close();
		
	}
	
	 public void invalidUserLogin()
	  { 
		System.out.println("TC1 Priority 1");
		System.out.println(driver);
       login.unSuccessfulLogin(driver,"ascent.team@gmail.com", "invalidpassword");
	   Assert.assertEquals(driver.getTitle() ,actualTitle);
	  }
	
	public void validUserLogin() {
		System.out.println("TC1 Priority 2");
		login.login(driver,User,pwd);
		Assert.assertEquals(driver.getTitle() ,actualTitle);
	}

}

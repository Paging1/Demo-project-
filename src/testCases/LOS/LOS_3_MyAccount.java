package testCases.LOS;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import pageObjects.Login;
import pageObjects.MyAccount;
import utils.Constants;
import utils.GetBrowserInstance;
import utils.Keywords;

public class LOS_3_MyAccount 
{
	    WebDriver driver;
		GetBrowserInstance browser = new GetBrowserInstance(); 
		Login login = new Login();										//Creating object for Login class.
		Keywords keys = new Keywords();	
		MyAccount myaccountPage=  new MyAccount();
	
		@BeforeClass
		public void openBrowser()
		{
		 driver = browser.getBrowser();
		}

		@Test(priority=1 ,enabled=true)
		public void ValidUserLogin() 
		{
		 login.login(driver,Constants.userName,Constants.password);
		}
		

        @ Test(priority=2 , enabled=true)
        public void MyAccoountUpdate()
        {
        	myaccountPage.myAccountEditCheck(driver,"Paula","Paula1");
        }





}

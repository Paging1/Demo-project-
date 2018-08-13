package testCases.LOS.CreditCheck;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import pageObjects.LoanOffer;
import pageObjects.Login;
import utils.Constants;
import utils.GetBrowserInstance;
import utils.Keywords;

public class LOS_2_LoanOffer extends GetBrowserInstance
{
	Login login = new Login();	
	Keywords keys = new Keywords();	
	LoanOffer loanoffer= new LoanOffer ();
	GetBrowserInstance browser = new GetBrowserInstance(); 
		
	
	WebDriver driver;
	String User = Constants.userName;
	String pwd = Constants.password;


	@BeforeClass
	public void openBrowser()
	{
		driver = browser.getBrowser();
	}

	@Test(priority=10 ,enabled=true)
	public void ValidUserLogin() 
	{
		login.login(driver,Constants.userName,Constants.password);
	}


   @Test(priority=11 ,enabled=true)
   public void IndependentLoanOffer()
   {
	  loanoffer.SelectIndependentLoanOffer(driver);
   }

  @Test(priority=12 ,enabled=false)
  public void TutionLoanOffer()
   {
	  loanoffer.SelectTutionLoanOffer(driver);
   }

  @AfterClass
	public void closeBrowser()
	 {
	   driver.close();
	 }


}

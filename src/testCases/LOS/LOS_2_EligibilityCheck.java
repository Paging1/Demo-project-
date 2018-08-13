package testCases.LOS;

import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.WebElement;
//import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;


import pageObjects.Reapply;
import pageObjects.ApplicationForm;
import pageObjects.Login;
import utils.Constants;
import utils.GetBrowserInstance;
import utils.Keywords;

public class LOS_2_EligibilityCheck {
    WebDriver driver;
	GetBrowserInstance browser = new GetBrowserInstance(); 
	Login login = new Login();										//Creating object for Login class.
	Keywords keys = new Keywords();	
	Reapply eligibilitycheckpage= new Reapply();
	ApplicationForm AppForm = new ApplicationForm();

	String User = Constants.userName;
	String pwd = Constants.password;

	@BeforeClass
	public void openBrowser()
	{
		 driver = browser.getBrowser();
		 login.login(this.driver,Constants.userName,Constants.password);
	}

	/*@Test (priority=1 ,enabled= true)
	public void ValidUserLogin()
	{
		System.out.println("TC2 Priority 1");
		login.login(this.driver,Constants.userName,Constants.password);
	}
*/

	@Test(priority=1 ,enabled= true)
	public void checkIndependentEligibiltyTest()
	{
	   eligibilitycheckpage.eligibilityTestIndependent(driver,"AL","University of Alabama at","Undergraduate - Senior" ,"full-time");
	   Assert.assertTrue(AppForm.independentheaderVisible(driver), "Element is not visible on the page");
    }

	//@Test(priority=3 ,enabled= true , dependsOnMethods ="checkIndependentEligibiltyTest")
	@Test(priority=2 ,enabled= false)
	public void checkTutionEligibiltyTest()
	{
	 eligibilitycheckpage.eligibilityTestTution(driver,"CO","Denver College of Nursing");
     Assert.assertTrue(AppForm.tutionHeaderVisible(driver), "Element is not visible on the page ");
    }
	

	//@Test(priority=4 ,enabled=true , dependsOnMethods ="checkTutionEligibiltyTest")
	@Test(priority=3,enabled=true)
	public void checkschoolNotFound()
	{
	  eligibilitycheckpage.eligibilityTestSchoolNotFound(driver, "AL"," Testing school" ,"ascent.team.testing@gmail.com");
    }
	
	//@Test(priority=5 , enabled =true ,dependsOnMethods ="checkschoolNotFound")
	@Test(priority=4 , enabled =true)
	public void reapplyExistingLoans()
	{
		eligibilitycheckpage.reapplyWithExistingLoans(driver);
	}

	@AfterClass
	public void closeBrowser()
	{
		driver.close();
    }


}













package testCases.LOS.CreditCheck;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import pageObjects.ApplicationForm;
import pageObjects.Login;
import pageObjects.Reapply;
import utils.Constants;
import utils.GetBrowserInstance;


public class LOS_1_CreditCheck extends GetBrowserInstance {
	GetBrowserInstance browser = new GetBrowserInstance(); 
	Login login = new Login();								
//	Keywords keys = new Keywords();
    ApplicationForm applicationform = new ApplicationForm();
    Reapply eligibilitycheckpage= new Reapply();


	@BeforeClass
	public void openBrowser()
	{
	 driver = browser.getBrowser();
	 login.login(driver,Constants.userName,Constants.password);
	}

	/*@Test(priority=1 ,enabled=true)
	public void ValidUserLogin() 
	{
		login.login(driver,Constants.userName,Constants.password);
	}
	
	*/
	
	@Test(priority=5 ,enabled=false)
   public void CreditCheckIndLoanApp()
  {
	 eligibilitycheckpage.eligibilityTestIndependent(driver,"AL","University of Alabama at","Undergraduate - Senior","full-time");
	 applicationform.schoolinfo(driver,"Undergraduate - Freshman","Registered nursing/registered nurse","Fall 2018","June","2021", "1000" , "10000");
	 applicationform.applicantinfo(driver,"ISABEL","MARINES","123456789012345","ascent.team.testing@gmail.com","666686490","666686490","Jun","11","1981","11881 TOWNSITE RD","ALTA VISTA","KS","66834-9194");
     applicationform.housingInfo(driver,"Own","1000","300","200","100");
	 applicationform.employmentInfo(driver,"HOURLY","2-5 years","150000","Test Name","Test Address");
     applicationform.disclsoureInfo(driver);
	 applicationform.termsConditionssubmit(driver);
	 applicationform.submitapplication(driver);
	 applicationform.referenceinfo(driver,"Test Reference First name","Test Reference last name","1234567890123","US Address" ,"Test Street Address","Test City","KS","66834-9194");
  }

	@Test(priority=6,enabled=false)
	public void CreditCheckTutionLoanApp()
	{
		eligibilitycheckpage.eligibilityTestTution(driver,"CO","Denver College of Nursing");
		applicationform.schoolinfo(driver,"Undergraduate - Freshman","Registered nursisng/registered nurse","Fall 2018","June","2021", "1000" , "5000");
		applicationform.applicantinfo(driver,"ISABEL","MARINES","123456789012345","ascent.team.testing@gmail.com","666686490","666686490","Jun","11","1981","11881 TOWNSITE RD","ALTA VISTA","KS","66834-9194");
	    applicationform.housingInfo(driver,"Own","1000" ,"300" ,"200","100");
		applicationform.employmentInfo(driver ,"HOURLY","2-5 years","150000","Test Name","Test Address");
	    applicationform.disclsoureInfo(driver);
		applicationform.termsConditionssubmit(driver);
		applicationform.continueWithCosigner(driver);
		applicationform.CosignerSubmit(driver);
		   
	}
	
	@Test(priority=7 , enabled=false)
	public void CreditCheckPtfi()
	{
		 applicationform.PtfiCheck(driver);
	}
	
	@Test(priority=8 , enabled= false)
	public void hardKOCheck()
	{
		applicationform.hardKoCheck(driver);
	}
	
	@Test(priority=9, enabled=false)
	public void  pendingCheck()
	{
	 applicationform.pendingCheck(driver);
	}

	
	@AfterClass
	public void closeBrowser()
	{
	   driver.close();
	}

	

}

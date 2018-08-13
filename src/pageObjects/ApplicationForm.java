package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import utils.Keywords;

public class ApplicationForm {

	Keywords keys = new Keywords();
	Reapply eligibilitycheckpage= new Reapply();


	//........ Page objects for  School- application form....................

	public By previous_btn= By.xpath("//input[@name='previous']");
	public By next_btn= By.xpath("//input[@name='next']");
	public By applicant_tab= By.xpath("//*[@data-section='applicant']");
	public By school_state= By.id("school_state");
	public By school_list= By.xpath("//*[@role='presentation']");
	public By selected_school= By.className("select2-results");   
	public By academic_year= By.id("academic_level");
	public By major= By.xpath("//*[@data-field_name='Major']");
	public By Loan_year= By.id("school_loan_term");
	//public By Loan_year =By.xpath("//*[@id='school_loan_term']/option[2]");
	public By Exp_Grad_date_Month= By.name("grad_mm");
	public By Exp_Grad_date_year= By.name("grad_yyyy");
	public By Exp_Financial_Aid= By.xpath("//*[@placeholder='Enter Amount']");
	public By Req_Loan_Amt= By.xpath("//input[@type='text' and @placeholder='$']");
	public By school_attending_SearchField= By.xpath("//*[@class='select2-search__field']");
	//public By school_instate= By.xpath("//label[contains(.,'In-State')]/input");
	public By school_instate= By.xpath("//*[@value= 'in_state']");
	public By school_outstate=By.xpath("//label[contains(.,'Out-State')]/input");
	public By month_element= By.id("monthdropdown");
	public By year_element= By.id("yeardropdown");
	public By day_element1= By.id("daydropdown");



	//********************* Page objects for  Applicant tab**********************

	public By first_name= By.id("first_name");
	public By last_name= By.id("last_name");
	public By primary_phone= By.id("phone_primary");
	public By primary_email=By.id("email_primary");
	public By social_security=By.id("ssn");
	public By confirm_social_security =By.id("confirm_ssn");
	public By date_of_birth= By.id("dob");
	public By citizenship_status= By.id("is_citizen");
	public By age_of_majority_yes= By.xpath("//input[@id='has_age_of_majority_yes']");
	public By street_address= By.id("perm_addr1");
	public By city= By.id("perm_city");
	public By state= By.id("perm_state");
	public By zipcode= By.id("perm_zipcode");
	public By applicant_next= By.xpath("(//input[@name='next'])[2]");
	public By is_mailing_address_permanent= By.xpath("//*[@name='is_mailing_addr_perm']");


	//************************* Page objects for Housing Tab***********************

	public By house_status= By.id("house_status");
	public By Monthly_mortgage_rent = By.id("monthly_housing");
	public By Monthly_Hoa= By.id("monthly_hoa_housing");
	public By Monthly_Property_tax= By.id("monthly_property_tax_housing");
	public By Monthly_Outstanding_Mortgage_Balance= By.id("outstanding_mortgage_housing");
	public By Housing_next= By.xpath("(//input[@name='next'])[3]");
	public By housing_tab=By.xpath("//li[@data-section='housing']");
	public By housing_tab_active =By.xpath("//*[@class='housing active']");

	//******************** Page Objects for  Employment page*************

	public By employment_status= By.name("employment_status");
	public By years_employed =By.name("employment_history");
	public By annual_income = By.name("annual_income");
	public By employer_name= By.name("employer_name");
	public By employer_address=By.name("employer_address");
	public By employment_next= By.xpath("(//input[@name='next'])[3]");
	public By employment_tab_active = By.xpath("//*[@class='employment active']");
	public By employment_tab= By.xpath("//*[@data-section='employment']");

	//****************  Page Objects for Reference page **************************

	public By reference_first_name= By.name("refer_first_name");
	public By reference_last_name= By.name("refer_last_name");
	public By reference_primary_number=By.name("refer_phone_primary");
	public By reference_address_region=By.name("refer_address_region");
	public By reference_street_address=By.id("refer_perm_addr1");
	public By reference_city=By.name("refer_perm_city");
	public By reference_state= By.name("refer_perm_state");
	public By reference_zipcode= By.name("refer_perm_zipcode");
	public By reference_next= By.xpath("(//input[@name='next'])[4]");
	public By reference_tab= By.xpath("//*[@data-section='references']");
	public By reference_tab_active= By.xpath("//*[@class='references active']");
	public By reference_submit=By.xpath("//button[@type='submit'][1]");


	// ********** Page Objects for Disclosure Page ***************
	public By disclosure_tab=By.xpath("//*[@data-section='disclosure']");
	public By elect_disclosure_accpt_btn= By.xpath("//button[@id='electronic_communication_election_accept_button']");
	public By elect_disclosure_decline_btn= By.id("electronic_communication_election_decline_button");
	public By mobile_phone_disclosure= By.name("mobile_phone_disclosure");
	public By financial_literacy_disclosure = By.name("financial_literacy_disclosure");
	public By privacy_policy= By.name("privacy_policy");
	public By esign_through_docusign= By.name("esign_by_docusign");
	public By terms_and_conditions = By.name("terms_condition");
	public By terms_and_conditions_tab= By.xpath("//*[@data-section='terms']");
	public By terms_and_conditions_submit_btn= By.name("Submit");
	public By submit_application_btn= By.xpath("//*[@value='SUBMIT APPLICATION']");
	public By ele_comm_election_Box = By.xpath("//div[contains(@class ,'offset-1')]/h3");
	public By disclosure_chkbox= By.xpath("//input[@type='checkbox']");
	public By disclosure_next_btn=By.xpath("(//input[@name='next'])[5]");
	public By php_debugar_Messages = By.xpath("//span[text()='Messages']");
	public By php_debugbar_closebtn= By.xpath("//a[@class='phpdebugbar-close-btn']");
	public By disclosure_tab_active=By.xpath("//*[@class='disclosure active']");
	public By terms_tab_active =By.xpath("//*[@class ='terms active']");


	//******** Page Objects for Cosigner page *****************
	public By Continue_Btn= By.xpath("(//button[@class='action-button action-button-large'])[1]");
	public By email_CosignerField= By.xpath("//input[@name='email']");
	public By password_CosignerField= By.xpath("//input[@name='password']");
	public By Login_btn= By.xpath("//button[@class='a_btn']");

	//*********** Page Objects for Credit check result screen**************
	public By ptfi_uploadMyDocuments_btn =By.xpath("//button[text()='UPLOAD MY DOCUMENTS']");
	public By hardKoScreen = By.xpath("//h2[text()=\"Your application has not been approved\"]");
	public By pendingScreen= By.xpath("//h2[text()='You’re almost there']");



	public By ind_HeaderElement = By.xpath("//h2[text()=\"Ascent Independent loan application\"]");
	public By Tution_HeaderElement= By.xpath("//h2[text()=\"Ascent Tution loan application\"]");





	public void schoolinfo(WebDriver driver , String val_academic_year , String val_Major , String val_Loan_Year , String val_Exp_Grad_date_Month , String val_Exp_Grad_date_year , String val_Exp_financial_aid , String val_req_Loan_amt )
	{
		keys.wait(driver,academic_year);
		keys.selectDropDownValue(driver,academic_year, val_academic_year);
		keys.selectDropDownValue(driver,major, val_Major);
		keys.pause(2000);
		int iselementPresent = driver.findElements(By.xpath("//div[@class='phpdebugbar-header']")).size() ;
		int isBarHidden = driver.findElements(By.xpath("//div[@class='phpdebugbar-header' and @style='display: none;']")).size() ;

		//System.out.println("Bar " + iselementPresent);
		//System.out.println("Bar hidden " + isBarHidden);

		if(iselementPresent>0 && isBarHidden<1)
		{
			keys.click(driver,php_debugar_Messages);
			keys.click(driver,php_debugbar_closebtn);

		}
		keys.pageScroll(driver,"scrollBy(0,350)");
		keys.pause(2000);
		keys.selectDropDownValue(driver,Loan_year,val_Loan_Year);
		keys.pause(2000);
		JavascriptExecutor jse = (JavascriptExecutor)driver;
		keys.selectDropDownValue(driver,Exp_Grad_date_Month,val_Exp_Grad_date_Month);
		jse.executeScript("document.getElementsByName('grad_yyyy')[0].setAttribute('type','text');");
		keys.selectDropDownValue(driver,Exp_Grad_date_year,val_Exp_Grad_date_year);
		keys.pause(2000);
		keys.click(driver,school_instate);
		keys.pageScroll(driver,"scrollBy(0,250)");
		keys.enterText(driver,Exp_Financial_Aid,val_Exp_financial_aid);
		//jse.executeScript("document.getElementsByName('request_loan_amt')[0].setAttribute('type','text');");
		keys.enterText(driver,Req_Loan_Amt,val_req_Loan_amt);
		keys.click(driver,next_btn);
	}

	public void applicantinfo(WebDriver driver , String val_first_name , String val_last_name , String val_primary_phone , String val_primary_email , String val_social_security , 
			String val_confirm_social_security , String val_month_element , String val_day_element1 , String val_year_element,
			String val_street_addres , String val_city , String val_state ,String val_zipcode)
	{
		keys.wait(driver,first_name);
		keys.clearText(driver,first_name);
		keys.enterText(driver , first_name ,val_first_name);
		keys.clearText(driver,last_name);
		keys.enterText(driver,last_name,val_last_name);
		keys.clearText(driver,primary_phone);
		keys.enterText(driver,primary_phone,val_primary_phone);
		keys.clearText(driver,primary_email);
		keys.enterText(driver,primary_email,val_primary_email);
		keys.clearText(driver,social_security);
		keys.enterText(driver,social_security, val_social_security);
		keys.clearText(driver,confirm_social_security);
		keys.enterText(driver,confirm_social_security,val_confirm_social_security);
		keys.pageScroll(driver,"scrollBy(0,250)");
		keys.pause(3000);
		keys.selectDropDownValue(driver, month_element,val_month_element);
		keys.selectDropDownValue(driver,day_element1,val_day_element1);
		keys.selectDropDownValue(driver, year_element,val_year_element);
		keys.pause(3000);
		keys.click(driver,age_of_majority_yes);
		keys.selectDropDownValue(driver,citizenship_status,"U.S CITIZEN");
		keys.clearText(driver,street_address);
		keys.enterText(driver,street_address , val_street_addres);
		keys.clearText(driver,city);
		keys.enterText(driver,city,val_city);
		keys.selectDropDownValue(driver,state, val_state);
		keys.clearText(driver,zipcode);
		keys.enterText(driver,zipcode,val_zipcode);
		keys.click(driver,is_mailing_address_permanent);
		
        JavascriptExecutor jse = (JavascriptExecutor)driver;
		jse.executeScript("arguments[0].scrollIntoView(false);", driver.findElement(housing_tab));
		jse.executeScript("arguments[0].click();", driver.findElement(housing_tab));

	}
	public void housingInfo(WebDriver driver , String val_house_status ,String val_Monthly_mortgage_rent, String val_Monthly_Outstanding_Mortgage_Balance ,
			String  val_Monthly_Property_tax, String val_Monthly_Hoa )
	{
		keys.wait(driver,housing_tab_active);
		keys.selectDropDownValue(driver,house_status ,val_house_status);
		keys.clearText(driver,Monthly_mortgage_rent);
		keys.enterText(driver,Monthly_mortgage_rent,val_Monthly_mortgage_rent);
		keys.clearText(driver,Monthly_Outstanding_Mortgage_Balance);
		keys.enterText(driver,Monthly_Outstanding_Mortgage_Balance,val_Monthly_Outstanding_Mortgage_Balance);
		keys.clearText(driver,Monthly_Property_tax);
		keys.enterText(driver,Monthly_Property_tax, val_Monthly_Property_tax);
		keys.clearText(driver,Monthly_Hoa);
		keys.enterText(driver,Monthly_Hoa,val_Monthly_Hoa);
		keys.pageScroll(driver, "scrollBy(0,-250)");
		keys.pause(2000);
        JavascriptExecutor jse = (JavascriptExecutor)driver;
	    jse.executeScript("arguments[0].scrollIntoView(false);", driver.findElement(employment_tab));
	    jse.executeScript("arguments[0].click();", driver.findElement(employment_tab));
 

	}

	public void employmentInfo(WebDriver driver , String val_employment_status , String val_years_employed , String val_annual_income ,
			String val_employer_name , String val_employer_address )
	{
		//	keys.wait(driver, employment_tab_active);
		keys.pause(3000);
		keys.pageScroll(driver,"scrollBy(0,250)");
		System.out.println("exec emp info");
		keys.selectDropDownValue(driver,employment_status,val_employment_status);
		keys.selectDropDownValue(driver,years_employed,val_years_employed);
		JavascriptExecutor jse = (JavascriptExecutor)driver;
		jse.executeScript("document.getElementsByName('annual_income')[0].setAttribute('type','text');");
		keys.clearText(driver, annual_income);
		keys.enterText(driver,annual_income,val_annual_income);
		jse.executeScript("document.getElementsByName('employer_name')[0].setAttribute('type','text');");
		keys.clearText(driver, employer_name);
		System.out.println("exec emp info name-----");
        keys.enterText(driver,employer_name, val_employer_name);
		jse.executeScript("document.getElementsByName('employer_address')[0].setAttribute('type','text');");
		keys.clearText(driver,employer_address);
		keys.enterText(driver,employer_address,val_employer_address);
		keys.pageScroll(driver,"scrollBy(0,-400)");
		keys.pause(2000);
		keys.click(driver,disclosure_tab);

	}

	public void referenceinfo(WebDriver driver , String val_reference_first_name , String val_reference_last_name , String val_reference_primary_number
			,String val_address_region,String val_reference_street_address, String val_reference_city , String val_reference_state, String val_reference_zipcode)

	{
		keys.wait(driver,reference_first_name );
		keys.clearText(driver,reference_first_name);
		keys.enterText(driver,reference_first_name,"Test Reference First name");
		keys.enterText(driver,reference_first_name,val_reference_first_name);
		keys.clearText(driver, reference_last_name);
		keys.enterText(driver,reference_last_name,val_reference_last_name);
		keys.clearText(driver,reference_primary_number);
		keys.enterText(driver,reference_primary_number , val_reference_primary_number);
		keys.selectDropDownValue(driver,reference_address_region, "US Address");
		keys.selectDropDownValue(driver,reference_address_region,val_address_region);
		keys.clearText(driver,reference_street_address);
		keys.enterText(driver,reference_street_address,val_reference_street_address);
		keys.clearText(driver ,reference_city);
		keys.enterText(driver,reference_city,val_reference_city );
		keys.selectDropDownValue(driver,reference_state, val_reference_state);
		keys.clearText(driver,reference_zipcode);
		keys.enterText(driver ,reference_zipcode,val_reference_zipcode);
		keys.pageScroll(driver,"scrollBy(0,-250)");
		keys.click(driver, reference_submit);

	}

	public void disclsoureInfo(WebDriver driver)
	{
		keys.wait(driver,disclosure_tab_active);
		keys.click(driver,ele_comm_election_Box);
		keys.scrollToElementView(driver,elect_disclosure_accpt_btn);
		keys.click(driver,elect_disclosure_accpt_btn);
		keys.pause(5000);
		keys.click(driver,mobile_phone_disclosure);
		keys.click(driver,financial_literacy_disclosure);
		keys.click(driver,privacy_policy);
		keys.click(driver,esign_through_docusign);
		keys.click(driver,terms_and_conditions);
		keys.pageScroll(driver,"scrollBy(0,-250)");
		keys.click(driver, terms_and_conditions_tab);
		keys.pause(5000);

	}

	public void termsConditionssubmit(WebDriver driver)
	{
		keys.wait(driver,terms_tab_active);
		keys.wait(driver, terms_and_conditions_submit_btn);
		JavascriptExecutor jse = (JavascriptExecutor)driver;
		jse.executeScript("arguments[0].scrollIntoView(false);", driver.findElement(terms_and_conditions_submit_btn));
		jse.executeScript("arguments[0].click();", driver.findElement(terms_and_conditions_submit_btn));
	}

	public void submitapplication(WebDriver driver)
	{
		keys.wait(driver,submit_application_btn);
		keys.pause(5000);
		keys.click(driver,submit_application_btn);
	}

	public void creditCheck(WebDriver driver)
	{
		eligibilitycheckpage.eligibilityTestIndependent(driver,"AL","University of Alabama at","Undergraduate - Senior","full-time");
		schoolinfo(driver,"Undergraduate - Freshman","Accounting","Fall 2018","June","2021", "1000" , "10000");
		applicantinfo(driver,"ISABEL","MARINES","123456789012345","ascent.team.testing@gmail.com","666686490","666686490","Jun","11","1981","11881 TOWNSITE RD","ALTA VISTA","KS","66834-9194");
		housingInfo(driver,"Own","1000" ,"300" ,"200","100");
		employmentInfo(driver,"HOURLY","2-5 years","150000","Test Name","Test Address");
		disclsoureInfo(driver);
		termsConditionssubmit(driver);
		submitapplication(driver);
		referenceinfo(driver,"Test Reference First name","Test Reference last name","1234567890123","US Address","Test Street Address","Test City","KS","66834-9194");
	}

	public void creditCheckCosigner(WebDriver driver)
	{

		eligibilitycheckpage.eligibilityTestTution(driver,"CO","Denver College of Nursing");
		schoolinfo(driver,"Undergraduate - Freshman","Registered nursing/registered nurse","Fall 2018","June","2021", "1000" , "10000");
		applicantinfo(driver,"ISABEL","MARINES","123456789012345","ascent.team.testing@gmail.com","666686490","666686490","Jun","11","1981","11881 TOWNSITE RD","ALTA VISTA","KS","66834-9194");
		housingInfo(driver,"Own","1000" ,"300" ,"200","100");
		employmentInfo(driver,"HOURLY","2-5 years","150000","Test Name","Test Address");
		disclsoureInfo(driver);
		termsConditionssubmit(driver);
		continueWithCosigner(driver);
		CosignerSubmit(driver);
	}

	public void  continueWithCosigner(WebDriver driver )
	{
		keys.wait(driver,Continue_Btn);
		keys.click(driver,Continue_Btn);
		keys.wait(driver,email_CosignerField);
		keys.enterText(driver, email_CosignerField,"ascent.team.testing2@gmail.com");
		keys.enterText(driver,password_CosignerField,"ascenttesting");
		keys.click(driver,Login_btn);
	}

	public void CosignerSubmit(WebDriver driver)
	{
		keys.wait(driver,first_name);
		applicantinfo(driver,"LAWRENCE","ROSMAN","123456789012345","ascent.team.testing2@gmail.com","666482251","666482251","Jan","1","1962","10768 CREEK STONE CI","STRONGSVILLE","OH","44149-2110");
		housingInfo(driver,"Own","1000" ,"300" ,"200","100");
		employmentInfo(driver,"HOURLY","2-5 years","150000","Test Name","Test Address");
		disclsoureInfo(driver);
		termsConditionssubmit(driver);
		submitapplication(driver);
		referenceinfo(driver,"Test Reference First name","Test Reference last name","1234567890123","US Address","Test Street Address","Test City","KS","66834-9194");
	}

	public void PtfiCheck(WebDriver driver)
	{
		eligibilitycheckpage.eligibilityTestIndependent(driver,"AL","University of Alabama at","Undergraduate - Senior","full-time");
		schoolinfo(driver,"Undergraduate - Freshman","Registered nursing/registered nurse","Fall 2018","June","2021", "1000" , "10000");
		applicantinfo(driver,"ISABEL","MARINES","123456789012345","ascent.team.testing@gmail.com","666686490","666686490","Jun","11","1981","11881 TOWNSITE RD","ALTA VISTA","KS","66834-9194");
		housingInfo(driver,"Own","1000","300","200","100");
		employmentInfo(driver,"HOURLY","2-5 years","2401","Test Name","Test Address");
		disclsoureInfo(driver);
		termsConditionssubmit(driver);
		submitapplication(driver);
		keys.wait(driver,ptfi_uploadMyDocuments_btn);
		keys.click(driver,ptfi_uploadMyDocuments_btn);
	}

	public void hardKoCheck(WebDriver driver)
	{
		eligibilitycheckpage.eligibilityTestIndependent(driver,"AL","University of Alabama at","Undergraduate - Senior","full-time");
		schoolinfo(driver,"Undergraduate - Freshman","Registered nursing/registered nurse","Fall 2018","June","2021", "1000" , "10000");
		applicantinfo(driver,"CARLY","GONZALES","123456789012345","ascent.team.testing@gmail.com","666049802","666049802","Jun","11","1981","1807 STONE MANOR CI","BRUNSWICK","OH","44212-4829");
		housingInfo(driver,"Own","1000","300","200","100");
		employmentInfo(driver,"HOURLY","2-5 years","2401","Test Name","Test Address");
		disclsoureInfo(driver);
		termsConditionssubmit(driver);
		submitapplication(driver);
		keys.wait(driver,hardKoScreen);
		keys.click(driver,hardKoScreen);

	}

	public void  pendingCheck(WebDriver driver)
	{
		eligibilitycheckpage.eligibilityTestIndependent(driver,"AL","University of Alabama at","Undergraduate - Senior","full-time");
		schoolinfo(driver,"Undergraduate - Freshman","Registered nursing/registered nurse","Fall 2018","June","2021", "1000" , "10000");
		applicantinfo(driver,"TRUDY","HUTCHINS","123456789012345","ascent.team.testing@gmail.com","666211285","666211285","Jun","11","1981","RR 1","GLASGOW","MT","59230-9801");
		housingInfo(driver,"Own","1000","300","200","100");
		employmentInfo(driver,"HOURLY","2-5 years","2401","Test Name","Test Address");
		disclsoureInfo(driver);
		termsConditionssubmit(driver);
		submitapplication(driver);
		keys.wait(driver,pendingScreen);
		keys.click(driver,pendingScreen);

	}

	public boolean independentheaderVisible(WebDriver driver)
	{

		try {
			WebElement Display = driver.findElement(ind_HeaderElement);
			if(Display.isDisplayed())
			{
				System.out.println("Independent Element is present on the page");
				return true;
			}
			else 
			{
				System.out.println("Independent Element is not present on the page");
				return false;
			}
		}
		catch(Exception e)
		{
			System.out.println("Inside exception");
			return false;
		}


	}

	public boolean tutionHeaderVisible(WebDriver driver)
	{
		WebElement Display = driver.findElement(Tution_HeaderElement);
		if(Display.isDisplayed())
		{
			System.out.println("Tution Element is present on the page");
		}
		else 
		{
			System.out.println("Tution Element is not present on the page");
		}
		return false;
	}





}





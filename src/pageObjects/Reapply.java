package pageObjects;

//import org.testng.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import utils.GetBrowserInstance;
import utils.Keywords;

public class Reapply  extends GetBrowserInstance 
{
	Keywords keys = new Keywords();
	//Reapply eligibilitycheckpage=  new Reapply();

	 
	//...............Page objects for eligibility check...................
	public By school_state = By.id("school_state");
	public By school_list= By.xpath("//*[@role='presentation']");
  //  public By cosigner= By.id("has_cosigner");
    public By school_name_dropdown= By.xpath("//input[@placeholder='Type your full school name']");
    public By New_application_Btn=By.xpath("//*[@value='New Application']");
    public By cancel_btn = By.name("cancel");
    public By ReApply_Btn= By.xpath("//*[@data-hover='ReApply']");
    public By school_search_field = By.xpath("//*[@class='select2-search__field']");
    public By selected_school= By.className("select2-results");   
   // public By confirm_btn=By.xpath("//input[@value='Confirm']");
 
    public By tution_product=By.xpath("//img[contains(@src,'Producttext-2')]");
    public By independent_product=By.xpath(".//img[contains(@src,'Producttext-1')]");
    public By independent_product_link= By.xpath("(.//img[contains(@src,'Producttext-1')])[2]");
    public By tution_product_link= By.xpath("(.//img[contains(@src,'Producttext-2')])[2]");
    public By product_cancel_btn= By.xpath("(//input[@value='Cancel'])[2]");
  //public By product_continue_btn= By.xpath("(//input[@name='continue'])[2]");
    public By product_continue_btn= By.id("save_prequal");
    public By school_state_error= By.id("school_state-error");
    public By school_list_error=  By.id("school_list-error");
    public By loan_amount_error=  By.id("loan_amount_hidden-error");
    public By reapply_continue_btn= By.id("goto_application_form");
    public By incomplete_loans= By.xpath("//li[contains(@class,'incomplete_loans')]");
    public By existing_continue_btn = By.xpath("//*[@class='application_list']/div[1]/div[1]/div/div[3]/a ");
    public By application_header = By.id("application_header_container");
    public By next_btn_1= By.xpath("//input[@name='next']");
    public By next_btn_2=By.xpath("(//input[@name='next'])[2]");
    public By academic_field=By.id("verified_grade_level");
    public By enrollment_status= By.id("enrollment_status");
    public By schoolNotFound_link= By.xpath("//a[contains(text(),'Click Here.')]");
    public By email_field= By.xpath("//input[@name='email']");
    public By school_submit_btn = By.xpath("//input[@name= 'Submit']");
    public By school_submit_text= By.xpath("// div[@class='bg-success text-success']");
    public By refresh_icon=By.id("refresh_state");
    public By refresh_StateList= By.xpath("//*[@id='school_state']");
    public By refresh_schoolList= By.xpath("//*[contains(text(),'Type your full school name')]");
    
    
    
    

   //............Page functions.....................
    public void reApply_Btn(WebDriver driver)
    {
    	keys.pause(2000);
    	keys.click(driver,ReApply_Btn);
        keys.pause(2000);
        keys.click(driver,cancel_btn); 
    }
     
    
    
    public void eligibilityTestIndependent(WebDriver driver ,String val_school_state, String val_school_search_field, String val_academic_field , String val_enrollment_field)

    {
    	reApply_Btn(driver);
    	keys.selectDropDownValue(driver,school_state, val_school_state);
    	keys.pause(2000);
    	keys.click(driver,school_list);
    	keys.pause(2000);
    	keys.enterText(driver,school_search_field, val_school_search_field);
    	keys.pause(2000);
    	keys.click(driver,selected_school);
    //	keys.click(driver,refresh_icon);
        //AssertTrue("State values has not been cleared ", keys.getElementAttribute(driver,refresh_StateList).isEmpty());
     //   Assert.assertTrue(keys.getElementAttribute(driver,refresh_StateList).isEmpty(),"State values has not been cleared");
       // keys.elementPresent(driver,refresh_schoolList);
    //	keys.selectDropDownValue(driver,school_state,val_school_state);
    //	keys.pause(2000);
    //	keys.click(driver,school_list);
    //	keys.pause(2000);
    //	keys.enterText(driver,school_search_field, val_school_search_field);
    //	keys.pause(2000);
    //	keys.click(driver,selected_school);
        keys.click(driver,next_btn_1);
    	keys.pause(2000);
        keys.selectDropDownValue(driver,academic_field, val_academic_field);
    	keys.selectDropDownValue(driver,enrollment_status,val_enrollment_field);
    	keys.click(driver,next_btn_2);
    	keys.pause(3000);
    	keys.elementPresent(driver,independent_product);
    	keys.elementPresent(driver,tution_product);
    	keys.click(driver,independent_product_link);
        keys.pause(3000);
    }

    
    public void eligibilityTestTution(WebDriver driver, String val_school_state, String val_school_search_field) 
    {
    	reApply_Btn(driver);
     	keys.selectDropDownValue(driver,school_state, val_school_state);
 	    keys.pause(2000);
 	    keys.click(driver,school_list);
 	    keys.pause(2000);
 	    keys.enterText(driver,school_search_field, val_school_search_field);
 	    keys.pause(2000);
 	    keys.click(driver,selected_school);
        keys.click(driver,next_btn_1);
 	    keys.pause(2000);
 	    keys.elementPresent(driver,tution_product);
 	    keys.click(driver,tution_product);
    	
    }
    
   public void eligibilityTestSchoolNotFound(WebDriver driver, String val_school_state, String val_school_search_field , String val_email_id) 
   {
	    reApply_Btn(driver);
    	keys.selectDropDownValue(driver,school_state, val_school_state);
	    keys.pause(2000);
	    keys.click(driver,school_list);
	    keys.pause(2000);
	    keys.enterText(driver,school_search_field, val_school_search_field);
	    keys.click(driver, schoolNotFound_link);
	    keys.enterText(driver,email_field,val_email_id);
	    keys.click(driver,school_submit_btn);
	    keys.elementPresent(driver,school_submit_text);
   }
    
    public void eligibilitySubmit(WebDriver driver,String val_school_state, String val_school_search_field, String val_cosigner, String val_loan_amount)
    {
    	keys.click(driver,ReApply_Btn);
        keys.pause(2000);
        keys.click(driver,cancel_btn);
        keys.selectDropDownValue(driver,school_state, val_school_state);
 	    keys.pause(2000);
 	    keys.click(driver,school_list);
 	    keys.enterText(driver,school_search_field, val_school_search_field);
 	    keys.click(driver,selected_school);
        keys.pause(4000);
 	    keys.click(driver,product_continue_btn);
    }
    
    
 

   public void reapplyWithExistingLoans(WebDriver driver)
   {
	   keys.refresh(driver);
	   keys.wait(driver, reapply_continue_btn);
	   keys.click(driver,reapply_continue_btn);
	   keys.elementPresent(driver,incomplete_loans);
	   keys.click(driver, existing_continue_btn);
	   keys.elementPresent(driver,application_header);
   }

    
   


}

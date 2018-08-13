package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;

import utils.Keywords;

public class LoanOffer 
{
	 ApplicationForm  creditcheckPage= new ApplicationForm();
	 Keywords keys = new Keywords();
	 Reapply eligibilitycheckpage= new Reapply();
	
	public By previous_btn= By.xpath("//input[@name='previous']");
	public By repayMonths120_Slider= By.xpath("//div[contains(@class, 'slider-tick-label') and  contains( ./text(),'120')]");
	public By repayMonths180_Slider= By.xpath("//div[contains(@class, 'slider-tick-label') and  contains( ./text(),'180')]");
	public By repayMonths60_Slider= By.xpath("//div[contains(@class, 'slider-tick-label') and  contains( ./text(),'60')]");
	public By deferred_RepayPlan = By.id("deferredRepayment");
	public By interestOnly_RepayPlan = By.id("interestOnly");
	public By minimumpayment_RepayPlan= By.id("minimumPayment");
    public By variable_loanOffer_btn= By.xpath("//input[@name='variable_loan_offer_form_button']");
    public By Fixed_LoanOffer_btn= By.xpath("//input[@name='fixed_loan_offer_form_button']");
    public By getLoanOffer_Btn= By.id("get-offer-btn");
    public By approval_Disclosure_AcceptandSave= By.id("accept_and_save_btn");
    public By back_btn= By.xpath("//*[@class='btn btn-default action-button']");

   public void SelectIndependentLoanOffer(WebDriver driver)
   
   {
	 creditcheckPage.creditCheck(driver);
	 keys.wait(driver,deferred_RepayPlan);
	/* keys.elementPresent(driver,deferred_RepayPlan);
	keys.elementPresent(driver, repayMonths120_Slider);
	keys.elementPresent(driver,repayMonths180_Slider);
    keys.elementNotPresent(driver,repayMonths60_Slider);
	keys.elementNotPresent(driver,interestOnly_RepayPlan );
   keys.elementNotPresent(driver,minimumpayment_RepayPlan);
   */
	 keys.click(driver,repayMonths180_Slider);
	 keys.wait(driver,variable_loanOffer_btn);
	// keys.elementNotPresent(driver,Fixed_LoanOffer_btn);
     keys.click(driver,variable_loanOffer_btn);
	 keys.wait(driver,approval_Disclosure_AcceptandSave);
	 JavascriptExecutor jse = (JavascriptExecutor)driver;
	 jse.executeScript("arguments[0].scrollIntoView(false);", driver.findElement(approval_Disclosure_AcceptandSave));
	 jse.executeScript("arguments[0].click();", driver.findElement(approval_Disclosure_AcceptandSave));
	 keys.wait(driver,back_btn);
	 keys.click(driver,back_btn);
	
   }

  public void validateTutionRepayPlan(WebDriver driver)
  
  {
	 creditcheckPage.creditCheckCosigner(driver);
	 keys.wait(driver,deferred_RepayPlan);
	 keys.elementPresent(driver,deferred_RepayPlan);
	 keys.elementPresent(driver,repayMonths120_Slider);
	 keys.elementPresent(driver,repayMonths180_Slider);
	 keys.elementPresent(driver,repayMonths60_Slider);
	 keys.elementPresent(driver,interestOnly_RepayPlan);
     keys.elementPresent(driver,minimumpayment_RepayPlan);
  }

  public void selectLoanOffer(WebDriver driver)
  {
	  keys.wait(driver,getLoanOffer_Btn);
	  keys.click(driver,getLoanOffer_Btn);
	  keys.wait(driver,variable_loanOffer_btn );
	  keys.click(driver,variable_loanOffer_btn);
 }

  public void SelectTutionLoanOffer(WebDriver driver) 
  
  {
     creditcheckPage.creditCheckCosigner(driver);
	 keys.wait(driver,deferred_RepayPlan);
	 keys.click(driver,getLoanOffer_Btn);
	 keys.wait(driver,variable_loanOffer_btn);
	 keys.click(driver,variable_loanOffer_btn);
	 acceptApprovalDislcosure(driver);
	 
  }
 
   public void acceptApprovalDislcosure(WebDriver driver)
  {
	   keys.wait(driver,approval_Disclosure_AcceptandSave);
	   JavascriptExecutor jse = (JavascriptExecutor)driver;
	   jse.executeScript("arguments[0].scrollIntoView(false);", driver.findElement(approval_Disclosure_AcceptandSave));
	   jse.executeScript("arguments[0].click();", driver.findElement(approval_Disclosure_AcceptandSave)); 
  }

}
package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import utils.Constants;
import utils.Keywords;

public class Task 
{
	Keywords keys = new Keywords();
	ApplicationForm  creditcheckPage= new ApplicationForm();
	LoanOffer loanofferpage = new LoanOffer();
	 
	 
	 public By Task_list_table= By.xpath("//tbody//td[2]/a");
	 public By My_Task_Link=By.xpath("//span[@class='fa fa-tasks']");
	 public By Back_Button=By.xpath("//*[@class='btn btn-default action-button']");

    public void TaskCreationWhenCreditCheckPassed (WebDriver driver)
    {
    	creditcheckPage.creditCheck(driver);
        loanofferpage.selectLoanOffer(driver);
        loanofferpage.acceptApprovalDislcosure(driver);
        keys.click(driver,Back_Button);
    	keys.wait(driver,My_Task_Link);
    	keys.click(driver,My_Task_Link);
    	keys.getTaskListwhenCreditCheckPassed(driver,Task_list_table ,Constants.CreditCheckPassedTasks);
    	
    }

   



}

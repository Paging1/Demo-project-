package testCases.LOS.TaskList;


import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import pageObjects.Login;
import pageObjects.Task;
import utils.Constants;
import utils.GetBrowserInstance;
import utils.Keywords;

public class LOS_1_Task 
{
	 GetBrowserInstance browser = new GetBrowserInstance();   //Creating object for GetBrowserInstance class.
	 Task  task=new Task();
	 Login login = new Login();										//Creating object for Login class.
	 Keywords keys = new Keywords();	
	 WebDriver driver;


	String User = Constants.userName;
	String pwd = Constants.password;

	@BeforeClass
	public void openBrowser()
	{
		 driver = browser.getBrowser();
	}

	@Test (priority=1 ,enabled= true)
	public void ValidUserLogin() 
	{
		login.login(this.driver,Constants.userName,Constants.password);
	}

   @Test (priority=2 ,enabled= false)
   public void TaskListCreation()
   {
	   task.TaskCreationWhenCreditCheckPassed(driver);
   }

   @Test(priority=3 ,enabled=true)
   public void ptfiTasks()
   {
	  
   }


}

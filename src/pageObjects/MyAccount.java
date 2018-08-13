package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

import utils.Keywords;

public class MyAccount {

	Keywords keys = new Keywords();
	
    
	public  By FirstName_field = By.name("first_name");
	public  By lastName_field = By.name("last_name");
	public  By update_btn = By.xpath("//input[@value='Update']");
	public  By MyAccount_Btn= By.xpath("//span[@data-hover='My Account']");
	


   public void myAccountEditCheck(WebDriver driver , String first_name_val, String first_name_updated_val)
  {
	 keys.click(driver,MyAccount_Btn);
	 keys.wait(driver, FirstName_field);
	 keys.clearText(driver,FirstName_field);
	 keys.enterText(driver,FirstName_field, "Paula1");
	 JavascriptExecutor jse = (JavascriptExecutor)driver;
	 jse.executeScript("arguments[0].scrollIntoView(false);", driver.findElement(update_btn));
	 jse.executeScript("arguments[0].click();", driver.findElement(update_btn));
	 keys.refresh(driver);
	 keys.click(driver, MyAccount_Btn);
	 keys.getElementAttribute(driver,FirstName_field);
	 keys.clearText(driver,FirstName_field);
	 keys.enterText(driver,FirstName_field, "Paula");
	 jse.executeScript("arguments[0].scrollIntoView(false);", driver.findElement(update_btn));
	 jse.executeScript("arguments[0].click();", driver.findElement(update_btn));
}

    public void myAccountupdate(WebDriver driver , String first_name_val ,String first_name_updated_val)
    {
     keys.clearText(driver,FirstName_field);
   	 keys.enterText(driver,FirstName_field,first_name_updated_val );
   	 JavascriptExecutor jse = (JavascriptExecutor)driver;
   	 jse.executeScript("arguments[0].scrollIntoView(false);", driver.findElement(update_btn));
   	 jse.executeScript("arguments[0].click();", driver.findElement(update_btn));
   
   
    }
}

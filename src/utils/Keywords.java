package utils;

import java.awt.AWTException;
import java.awt.Robot;
import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;




public class Keywords extends GetScreenshot {

	//WebDriver driver;
	Actions action;
	Robot robot;
	JavascriptExecutor jse = (JavascriptExecutor)driver;

	String downloadpathFirefox ="";

	//Method to enter text in any text field.
	public void enterText(WebDriver driver, By element , String text)
	{
		try 
		{
			
		 driver.findElement(element).sendKeys(text);
		}
		catch(Exception e)
		{
			System.out.println("Exception is coming while entering text "+ e.getMessage());	
			GetScreenshot.capture("EnterText_Error");
		}
	}

	//Method to click on any of the web element on Web Page
	public void click(WebDriver driver, By element)
	{
		try 
		{
			driver.findElement(element).click();
		}
		catch (Exception e)
		{
			System.out.println("Exception is coming while clicking element " + element);	
			e.printStackTrace();
			GetScreenshot.capture("ClickElement_Error");
		}
	}
	
	// Navigate to given URL
	public void navigate(WebDriver driver, String URL)
	{
		try
		{
			driver.get(URL);
		}
		catch(Exception e)
		{
			System.out.println("Exception is coming while navigating to the given url" +e.getMessage());
			GetScreenshot.capture("navigate_Error");
		}
	}

	//Method for Explicit waiting for element to get visible on web page.
	public void wait(WebDriver driver, By element)
	{
		WebDriverWait wait = new WebDriverWait(driver, 50);
		wait.until(ExpectedConditions.visibilityOfElementLocated(element));
	}

	//Method to pause the execution flow.
	public void pause(int i){
		try {
			Thread.sleep(i+000);
		} catch (InterruptedException e) 
		{
			e.printStackTrace();
		}
	}


	//Function to refresh current page.
	public void refresh(WebDriver driver) {
		driver.navigate().refresh();
	}


	//Function to close the driver
	public void close(WebDriver driver)
	{
		try{
			driver.close();
		}catch (Exception e)
		{
			System.out.println("Exception is coming on closing the driver" + e.getMessage());
			GetScreenshot.capture("Driver_Close_Error");
		}
	}

	//Function to get text from Web Element.
	public String getText(WebDriver driver, By element){
		String elementText="";
		try {
			elementText = driver.findElement(element).getText();

		} catch(Exception e)
		{
			System.out.println("Exception is coming on extracting the text" + e.getMessage());
			GetScreenshot.capture("Get_Text_Error");
		}
		return elementText;
	}


	/**
	 * Method to check if actual contains expected.
	 * @param driver
	 * @param actual, type: By
	 * @param expected, type: String
	 */
	public void assertText(WebDriver driver, By actual, String expected){
		String Actual = driver.findElement(actual).getText();
		Actual.contains(expected);
	}

	public void assertText(WebDriver driver, String actual, String expected){
		actual.contentEquals(expected);

	}

	public void containsText(WebDriver driver, String actual, String expected)
	{
		actual.contains(expected);
	}


	public void containsText(WebDriver driver, By actual, String expected)
	{
		String actualTxt = driver.findElement(actual).getText();
		Assert.assertTrue(actualTxt.contains(expected));	
	}

	public void textnotPresent(WebDriver driver, By actual, String expected){
		String Actual = driver.findElement(actual).getText();
		if(Actual.isEmpty()){
			System.out.println(expected+" donot matches with "+actual);
		}
	}

	/**
	 * Method to match actual and expected text.
	 * @param driver
	 * @param actual, type: By
	 * @param expected, type: By
	 */
	public void matchtext(WebDriver driver, By actual, By expected){
		String Actual = driver.findElement(actual).getText();
		String Expected = driver.findElement(expected).getText();
		Actual.matches(Expected);
	}

	public void dragdrop(WebDriver driver, By source, int xOffset, int yOffset){
		action = new Actions(driver);
		action.dragAndDropBy((WebElement) source, xOffset, yOffset);

	}

	public void drag(WebDriver driver, int xOffset, int yOffset) throws AWTException{
		robot = new Robot();
		robot.mouseMove(xOffset, yOffset);

	}

	private File getLatestFilefromDir(String downloadpathFirefox2) {

		File dir = new File(downloadpathFirefox);
		File[] files = dir.listFiles();
		if (files == null || files.length == 0) {
			return null;
		}

		File lastModifiedFile = files[0];
		for (int i = 1; i < files.length; i++) {
			if (lastModifiedFile.lastModified() < files[i].lastModified()) {
				lastModifiedFile = files[i];
			}
		}
		return lastModifiedFile;
	}


	//@SuppressWarnings("deprecation")
	public void downloadFile(WebDriver driver, String browser) {
		if(browser.matches("Firefox")){
			File getLatestFile = getLatestFilefromDir(downloadpathFirefox);
			String fileName = getLatestFile.getName();
			Assert.assertTrue(fileName.startsWith("ExportUser"));

		}
		else {
			System.out.println("Not handled for chrome yet");
		}

	}

	public void selectDropDownValue(WebDriver driver, By webelement ,String dropDownValue)
	{
		try
		{
			WebElement element = driver.findElement(webelement);
			Select dropDownElement = new Select(element);
			dropDownElement.selectByVisibleText(dropDownValue);
		} catch (Exception e) {
			System.out.println("Exception is coming while selecting  drop down value" + webelement);
			e.printStackTrace();
			GetScreenshot.capture("Select_DropDownValue_Error");
		}
	}


	public void elementPresent(WebDriver driver , By element)
	{
		try
		{
			boolean iselementPresent= driver.findElements(element).size()!=0;
			if (iselementPresent==true)
			{ 
				System.out.println("WebElement is present on the page" + element);
			}
			else 
			{
				System.out.println("WebElement is not present on the page" + element);
			}
		} catch (Exception e){
			System.out.println("Element is not present on the  web page" +e.getMessage());
			GetScreenshot.capture("Element_Not_found_Error");

		}
	}

	public void elementNotPresent( WebDriver driver , By element)
	{
		try
		{
			boolean iselementPresent= driver.findElements(element).size()!=0;
			if (iselementPresent==false)
			{ 
				System.out.println("WebElement is not present on the page" + element);
			}
			else 
			{
				System.out.println("WebElement is present on the page" + element);
			}
		} catch (Exception e){
			System.out.println("Element is present on the  web page" +e.getMessage());
			GetScreenshot.capture("Element_Not_found_Error");

		}
	}
	
	 public void getTitle()
	 {
		try {
			driver.getTitle();
		} catch(Exception e)
		{
			System.out.println("Exception is coming while getting page title"+ e.getMessage());
			GetScreenshot.capture("Page_Title_Error");
		}
	}

	public void clearText(WebDriver driver , By element)
	{
		try
		{
			driver.findElement(element).clear();
		} catch (Exception e)
		{
			System.out.println("Exception is coming while clearing the text for :" + element);
			GetScreenshot.capture("Clear_Text_Error");
			e.printStackTrace();
			
		}
	}
   
	
	public String getElementAttribute(WebDriver driver , By element)
	{
	
		String  elementText= driver.findElement(element).getAttribute("value");
		System.out.println(elementText);
		/*if (elementText.isEmpty())
		{
			System.out.println("Element  value is null for" + element );
		}*/
		return elementText;
	}
	
	
	public void selectRadioBtn(WebDriver driver , By radio_element_to_beselected)
	{
		WebElement radio = driver.findElement(radio_element_to_beselected);
		radio.click();
	}

	public void selectCheckBoxBtn( WebDriver driver ,By checkbox_element_to_beselected)
	{

		List<WebElement> checkbox = driver.findElements(checkbox_element_to_beselected);
		int noOfElements = checkbox.size();
		for(int i=0; i<noOfElements;i++)
			checkbox.get(i).click();
	}

    // This function will scroll the page 
	public void pageScroll(WebDriver driver , String scrolling_element)
	{
		try
		{
			JavascriptExecutor jse = (JavascriptExecutor)driver;
			// jse.executeScript("scrollBy(0,250)");
			jse.executeScript(scrolling_element);
		} catch(Exception e)
		{
			System.out.println("Exception while scrolling the page"); 
			GetScreenshot.capture("Page_Scroll_Error");
			e.printStackTrace();
		}
	}
	
	// This function will select the Date value from the Date of birth drop down.
	public void selectDOB(WebDriver driver, By month_element , By year_element,By day_element ,String monthdropDownValue ,String yeardropDownValue)
	{
		try {
			selectDropDownValue(driver , month_element ,monthdropDownValue);
			selectDropDownValue(driver , year_element ,yeardropDownValue);
			driver.findElement(day_element).click();
		} catch(Exception e)
		{
			System.out.println("Exception while selecting the date in date picker");
			GetScreenshot.capture("Select_DOB_Error");
			e.printStackTrace();
		}
	}

	 public void mouseMovement(WebDriver driver , By element)
   {
	 
	   action = new Actions(driver);
       WebElement target_element= driver.findElement(element);
	   action.moveToElement(target_element).perform();

   }
	 

	public void scrollToElementView(WebDriver driver , By element)
	{

       WebElement element1 = driver.findElement(element);
	  ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", element1);
		pause(5000);
	}
	
    //This function will scroll towards the bottom of the page.
	public void scrollToElementViewBottom(WebDriver driver , By element)
	{
           WebElement element1 = driver.findElement(element);
		  ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(false);", element1);
			
	}
	
	//  This function  will hide the webelement on the page.
	public void displayNone(WebDriver driver , By element)
	{
           WebElement element1 = driver.findElement(element);
		  ((JavascriptExecutor) driver).executeScript("arguments[0].setAttribute('style', 'display: none;')", element1);
			
	}
	
	
	public void manageWindowhandles( WebDriver driver)
	{
		try {
			Set<String> winIds= driver.getWindowHandles();
			if(winIds.size()==2)
			{
				Iterator<String> it= winIds.iterator();
				String mainID= it.next();
				String popUpId= it.next();
				driver.switchTo().window(popUpId);
				driver.switchTo().window(mainID);
            }
		} catch(Exception e)
		  {
          System.out.println("Exception is coming while  switching to multiple windows" + e.getMessage());
          e.printStackTrace();
          }
	}
	//..........................Application specific Functions...............................

	public void getTaskListwhenCreditCheckPassed(WebDriver driver , By element , String val_names)
	{
	//List to store tasks elements in table.	
	List<WebElement> tasks= driver.findElements(element);
	System.out.println("List 1st size" + tasks.size());
    ArrayList<String> alltasks = new ArrayList<String>();
	
    for (WebElement ele: tasks)
    {
    	alltasks.add(ele.getText());
        System.out.println(ele.getText());
    }
	
    // To add the tasks names to the list
   //  String tasks1 = Constants.CreditCheckPassedTasks;
    String tasks1=val_names;
    String[] elements= tasks1.split(",");
    List<String> alltasks1 = Arrays.asList(elements);
    System.out.println(alltasks1);
   
    if (alltasks.containsAll(alltasks1))
    {
     System.out.println(" Tasks in both lists are  equal");
    }
	 else
	 {
      System.out.println(" Tasks in both lists are equal");
	 }
	
	
	}
  
	// To  Perform click on the web element using  java script click
	public void javascriptClick( WebDriver driver, By element )
	{
		jse.executeScript("arguments[0].scrollIntoView(false);", driver.findElement(element));
		jse.executeScript("arguments[0].click();", driver.findElement(element));
    }


	 public void javascriptEnable( WebDriver driver , By element_name)
	 {
			JavascriptExecutor jse = (JavascriptExecutor)driver; 
			jse.executeScript("document.getElementsByName('element_name')[0].setAttribute('type','text');");
		
	 }
}




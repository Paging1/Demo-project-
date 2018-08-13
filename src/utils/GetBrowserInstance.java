package utils;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class GetBrowserInstance {

	public static WebDriver driver;

	private String browsername = Constants.Browser; // Gets browser name from Constants file for which test needs to be
													// executed.

	public static Logger Log = LogManager.getLogger(GetBrowserInstance.class.getName().toString()); // Initializing
																									// logger class.

	// Checks which browser needs to be invoked.
	public WebDriver getBrowser() {

		if (browsername.equalsIgnoreCase("Firefox"))
			driver = launchFirefox();
		else if (browsername.equalsIgnoreCase("Chrome"))
			driver = launchChrome();
		else
			System.err.println("Please mention correct browser name");
	

		return driver;

	}

	// Function to launch Firefox browser.
	public WebDriver launchFirefox() {
		System.setProperty("webdriver.gecko.driver", System.getProperty("user.dir") + "\\Drivers\\geckodriver.exe");
		driver = new FirefoxDriver();
		return driver;
	}

	// function to launch Chrome Browser.
	public WebDriver launchChrome() {
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + "\\Drivers\\chromedriver.exe");
		//Log.error("For testing purpose only, throwing uncollectable error");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		return driver;
	}

	public String getBrowserUrl() {
		return driver.getCurrentUrl();

	}

}

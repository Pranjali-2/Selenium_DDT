package utility;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class helper
{
	public static WebDriver startBrowser(String Browser)
	{
	WebDriver driver=null;

	if(Browser.equalsIgnoreCase("Chrome")||Browser.equalsIgnoreCase("GC")||Browser.equalsIgnoreCase("Google Chrome"))

	{

	

	System.setProperty("webdriver.chrome.driver","C:\\Selenium\\SeleniumCheckBox\\Chrome Driver jar\\chromedriver.exe");

	driver=new ChromeDriver();

	}

	else if(Browser.equalsIgnoreCase("Edge")|| Browser.equalsIgnoreCase("ME")||Browser.equalsIgnoreCase("Microsoft Edge"))

	{

	System.setProperty("webdriver.edge.driver","C:\\Selenium Wipro\\Selenium_Locators\\Edge Browser Drivers\\msedgedriver.exe");

	driver=new EdgeDriver();

	}

	else

	{

	System.out.println("sorry we do not support this browser");

	}

	return driver;
}
}

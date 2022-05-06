package utility;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Helper {

	public static WebDriver startBrowser(String browser) // static method to reuse
	{
		WebDriver driver = null;
		
		if (browser.equalsIgnoreCase("Chrome") || browser.equalsIgnoreCase("GC") || browser.equalsIgnoreCase("Google Chrome")) 
		{
			
			System.setProperty("webdriver.chrome.driver","C:\\Madhusmita works\\chromedriver_win32\\chromedriver.exe");
			
			driver=new ChromeDriver();
		}
		else if (browser.equalsIgnoreCase("FF") || browser.equalsIgnoreCase("Firefox") || browser.equalsIgnoreCase("Mozila"))
		{
			System.setProperty("webdriver.gecko.driver", "c:\\Batch Recordings \\Selenium Jan 2022\\geckodriver.exe");
			
			driver=new FirefoxDriver();
		}
		
		
		else if(browser.equalsIgnoreCase("Edge") || browser.equalsIgnoreCase("EG") || browser.equalsIgnoreCase("Microsoft Edge"))
		{
			System.setProperty("webdriver.edge.driver","C:\\Madhusmita works\\edgedriver_win64\\msedgedriver.exe");
			
			driver=new EdgeDriver();
		
		}
		else
		{
			System.out.println("Sorry we do not support this browser");
		}
		return driver; //returns webdriver
	}
	
	public static void closeBrowser(WebDriver driver)
	{
		driver.quit();
	}
	
	//Generic method  where pass the locator & value it is going to check run a condition if matches break the loop
	//List of multiple values you need to iterate and click on it and get the text this method applicable
	public static void selectValuesFromList(WebDriver driver,By locator,String value)
	{
		List<WebElement> allElements=driver.findElements(locator);
		
		for (WebElement ele : allElements) 
		{
			if (ele.getText().contains(value)) 
			{
				ele.click();
				break;
			}
		}
	}
}

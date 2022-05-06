package day8.findElements;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriver.Options;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

public class FindElementExample {

	public static void main(String[] args) 
	{
		
		
		System.setProperty("webdriver.chrome.driver","C:\\Madhusmita works\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://opensource-demo.orangehrmlive.com/");
		
		List<WebElement> allLinks=driver.findElements(By.tagName("a"));
		
		System.out.println(allLinks.size());
		
		for(WebElement ele:allLinks)
		{
			System.out.println(ele.isDisplayed());
			System.out.println(ele.isDisplayed());
			System.out.println(ele.getAttribute("href"));
		}
		
		//Click on 4th Link
		WebElement ele=allLinks.get(3);
		ele.click();
		
		//Click on 6th Link
		allLinks.get(5).click();
		
		//Click the last element
		allLinks.get(allLinks.size()-1).click();
		

	}

}

package day8.findElements;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriver.Options;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

public class FindElementExample2 {

	public static void main(String[] args) 
	{
		
		
		System.setProperty("webdriver.chrome.driver","C:\\Madhusmita works\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.naukri.com/");
		
		List<WebElement> allLinks=driver.findElements(By.tagName("a"));
		
		System.out.println(allLinks.size()); // To get count of all links i.e. present
		
		for(WebElement ele:allLinks)
		{
			System.out.println(ele.getText());
			System.out.println(ele.getAttribute("href"));
			System.out.println("**********");
		}
		
		List<WebElement> allImages=driver.findElements(By.tagName("img"));
		
		System.out.println("Total images on this page"+allImages.size());
		
		for(WebElement ele:allImages)
		{
			System.out.println("src "+ele.getAttribute("src"));
		}
		
		

	}

}

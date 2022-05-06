package day8.findElements;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriver.Options;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

public class FindElementExample3 {

	public static void main(String[] args) 
	{
		
		
		System.setProperty("webdriver.chrome.driver","C:\\Madhusmita works\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://opensource-demo.orangehrmlive.com/");
		
		List<WebElement> allElements=driver.findElements(By.id("Hemankshi"));
		
		System.out.println(allElements.size());
		
		driver.findElement(By.tagName("a")).click();
		
		driver.findElements(By.tagName("a")).get(3).click();

		driver.findElements(By.tagName("a")).get(4).click();


	}

}

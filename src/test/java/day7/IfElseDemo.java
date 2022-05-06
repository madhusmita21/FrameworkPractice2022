package day7;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class IfElseDemo {

	public static void main(String[] args) {
		
		int marks=100;
		
		System.out.println("Welcome");
		
		if (marks<=35) {
			System.out.println("Fail- Please try again");	
		}
		else 
		{
			System.out.println("Success");
		}
		
		String browser="Edge";
		
		if(browser.equalsIgnoreCase("Chrome"))
		{
			System.setProperty("webdriver.chrome.driver","C:\\Madhusmita works\\chromedriver_win32\\chromedriver.exe");
			
			WebDriver driver=new ChromeDriver();
		
		}
		else
		{
			System.setProperty("webdriver.edge.driver","C:\\Madhusmita works\\edgedriver_win64\\msedgedriver.exe");
			
			WebDriver driver=new EdgeDriver();
		}
		
		System.out.println("Thank You");
	}

}

package day7;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class IfDemo {

	public static void main(String[] args) {
		
		int marks=100;
		
		System.out.println("Welcome");
		
		if (marks<30) {
			System.out.println("Fail- Please try again");	
		}
		
		String browser="Edge";
		
		if(browser.equalsIgnoreCase("Chrome"))
		{
			System.setProperty("webdriver.chrome.driver","C:\\Madhusmita works\\chromedriver_win32\\chromedriver.exe");
			
			WebDriver driver=new ChromeDriver();
		
		}
		
		System.out.println("Thank You");
	}

}

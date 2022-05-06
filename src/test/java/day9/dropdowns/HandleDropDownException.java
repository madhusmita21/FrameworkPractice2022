package day9.dropdowns;

import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import utility.Helper;

public class HandleDropDownException {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver=Helper.startBrowser("Chrome");
		
		driver.get("https://www.facebook.com/");
		
		driver.findElement(By.linkText("Create New Account")).click();
		
		Thread.sleep(3000);
		
		//Select monthDD=new Select(driver.findElement(By.name("firstname"))); -
		Select monthDD=new Select(driver.findElement(By.id("month")));
		
		List<WebElement> allMonthValues=monthDD.getOptions();
		
		//To verify if Aug is present or not - when u have a list & u want to check whether this value is present or not and both should of the same type
		for (WebElement month : allMonthValues) 
		{
			String monthValue=month.getText();
			
			System.out.println("Month value is "+monthValue);
			
			if (monthValue.equalsIgnoreCase("Aug")) 
			{
				System.out.println("Month Present");
				break;
			}
			
			
		}
		
		System.out.println("Last selected value "+monthDD.getFirstSelectedOption().getText());
		
	}
	

}

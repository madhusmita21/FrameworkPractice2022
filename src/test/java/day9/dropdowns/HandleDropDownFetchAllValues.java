package day9.dropdowns;

import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import utility.Helper;

public class HandleDropDownFetchAllValues {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver=Helper.startBrowser("Chrome");
		
		driver.get("https://www.facebook.com/");
		
		driver.findElement(By.linkText("Create New Account")).click();
		Thread.sleep(3000);
		
		WebElement year=driver.findElement(By.name("birthday_year")); //it returns web element
		
		//In order to work with select class we have dedicated select class which is coming from selenium package
		Select yearDD=new Select(year); //creating object
		
		System.out.println("Selecting values via Index");
		
		//3
		yearDD.selectByIndex(5);
		Thread.sleep(1000);
		yearDD.selectByIndex(5);
		Thread.sleep(1000);
		yearDD.selectByIndex(5);
		Thread.sleep(1000);
		
		System.out.println("Selecting values via value");
		
		//2
		yearDD.selectByValue("2000");
		Thread.sleep(1000);
		yearDD.selectByValue("1998");
		Thread.sleep(1000);
		yearDD.selectByValue("1997");
		Thread.sleep(1000);
		
		System.out.println("Selecting values via visible text");
		
		//1st always go with visible text -only happens if business requirement case
		yearDD.selectByVisibleText("2006");
		
		List<WebElement> allYearValues=yearDD.getOptions();	
		
		System.out.println("Count of year dropdown values "+allYearValues.size());
		
		//Enhanced for loop since it's a value in the serial form and we don't want to jump in 2 and 3
		for (WebElement ele : allYearValues) 
		{
			System.out.println(ele.getText()); //if i want to capture the text one by one 
		}
		
		//Web element directly we are passing directly in constructor of Select class and monthDD object
		Select monthDD=new Select(driver.findElement(By.id("month")));
		
		monthDD.selectByVisibleText("Oct");
		
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

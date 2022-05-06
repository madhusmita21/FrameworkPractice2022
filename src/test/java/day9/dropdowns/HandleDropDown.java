package day9.dropdowns;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import utility.Helper;

public class HandleDropDown {

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
		
	}
	

}

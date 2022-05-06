package day8.collectionsDemo;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

import org.openqa.selenium.WebElement;

public class ArrayListDemo5 {

	public static void main(String[] args) {
		
		ArrayList<String> list1=new ArrayList<String>();
		list1.add("Selenium");
		list1.add("Java");
		System.out.println(list1);
		
		//Adding another list by passing constructor of another array list
		ArrayList<String> l1=new ArrayList<String>(list1);
		l1.add("TestNG");
		l1.add("Jenkins");
		System.out.println(l1);
	}

}

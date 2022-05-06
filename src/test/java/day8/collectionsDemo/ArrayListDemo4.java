package day8.collectionsDemo;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

import org.openqa.selenium.WebElement;

public class ArrayListDemo4 {

	public static void main(String[] args) {
		
		List<List<String>> myStudents=new ArrayList<List<String>>(); //myStudent - list of list of list
		
		List<String>batch1=new ArrayList<String>();
		batch1.add("Dina");
		batch1.add("Praveen");
		System.out.println(batch1);
		
		List<String>batch2=new ArrayList<String>();
		batch2.add("Menakshi");
		batch2.add("Pritesh");
		System.out.println(batch2);
		
		List<String>batch3=new ArrayList<String>();
		batch3.add("Aya");
		batch3.add("Shahu");
		
		//which list you want to add
		myStudents.add(batch1);
		myStudents.add(batch2);
		myStudents.add(batch3);
		
		System.out.println(myStudents);
		
		System.out.println(myStudents.get(2).get(1));
		//System.out.println(myStudents.get(2).get(batch3.size()-1));
	}

}

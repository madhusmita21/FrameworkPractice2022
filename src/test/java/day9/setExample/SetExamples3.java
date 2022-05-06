package day9.setExample;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class SetExamples3 {

	public static void main(String[] args) {
		
		//Declaring duplicate values
		List<String> emp=new ArrayList<String>();
		emp.add("Shahu");
		emp.add("Shahu");
		emp.add("Nitish");
		emp.add("Nitish");
		emp.add("Phani");
		
		//Converting List into Set and using addAll() 
		HashSet<String> names=new HashSet<String>();
		names.addAll(emp);
		System.out.println(names);
	}

}

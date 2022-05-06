package day9.setExample;

import java.util.HashSet;

public class SetExamples {

	public static void main(String[] args) {
		
		/*
		 * Set is 
		 * 
		 * Set doesn't allow duplicates
		 * 
		 */
		
		HashSet<String> names=new HashSet<String>();
		
		names.add("Amit");
		names.add("Amit");
		names.add(null);
		names.add(null);
		names.add("Sunil");
		names.add("Anshu");
		
		System.out.println(names);
	}

}

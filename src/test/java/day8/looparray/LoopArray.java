package day8.looparray;

public class LoopArray {

	public static void main(String[] args) {
		
		String []names= {"Preeti","Anshu","Damodar","Krish","Divya"};
		
		//this is only use for forward direction
		for (String myname : names) 
		{
			System.out.println(myname);
		}
		
		for (int i = 0; i < names.length; i++) 
		{
			System.out.println(names[i]);
		}
		
		//print alternative no logic
		for (int i = 0; i < names.length; i=i+2) 
		{
			System.out.println(names[i]);
		}

	}

}

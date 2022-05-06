package day6;

public class SampleClass {
	
	/*
	 * 
	 * refer current class object as return type
	 * 
	 */
	

	public static void main(String[] args) 
	{
		
		SampleClass obj1=new SampleClass();
		obj1.show().display().start();
		
		/*
		 * 
		 * SampleClass s1=obj1.show();
		 * 
		 * SampleClass s2=s1.display();
		 * 
		 * s2.start();
		 * 
		 * 
		 */
		

	}
	
	public SampleClass show()
	{
		System.out.println("Calling show method");
		return new SampleClass();
		
	}
	
	public SampleClass display()
	{
		System.out.println("Calling display method");
		return new SampleClass();
		
	}
	
	public SampleClass start()
	{
		System.out.println("Calling start method");
		return new SampleClass();
		//return this;
		
	}
	
	
	


}

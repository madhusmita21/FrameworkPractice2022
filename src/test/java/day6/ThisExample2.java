package day6;

public class ThisExample2 {
	
	/*
	 * 
	 * calling current class constructor
	 * 
	 */
	
	public ThisExample2()
	{
		this("Selenium");
		System.out.println("Default constructor");
	}
	
	public ThisExample2(String name)
	{
		this(2);
		System.out.println("Constructor with single argument" + name);
	}
	
	public ThisExample2(int num)
	{
		System.out.println("Constructor with single int argument" + num);
	}
	

	public static void main(String[] args) 
	{
		
		ThisExample2 s1=new ThisExample2();
	

	}
	
	


}

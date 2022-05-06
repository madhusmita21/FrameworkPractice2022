package day6;

public class ThisExample1 {

	public static void main(String[] args) 
	{
		
		
		/*
		 * 
		 * calling current class methods using this 
		 * 
		 */
		
		ThisExample1 s1=new ThisExample1();
		s1.show();

	}
	
	public void show()
	{
		display(); //this.display()
		System.out.println("I am in show method");
	}
	
	public void display()
	{
		close(); //this.close()
		System.out.println("I am in display method");
	}

	public void close()
	{
		System.out.println("I am in close method");
	}


}

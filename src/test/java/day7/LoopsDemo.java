package day7;

public class LoopsDemo {

	public static void main(String[] args) {
		
		/*
		 * 
		 * for
		 * forEach/ Enhanced for loop
		 * while
		 * do-while
		 * 
		 */
		
		System.out.println("First loop");

		for (int i = 0; i <=10; i++) 
		{
			System.out.println(i);
		}
		
		System.out.println("Second loop");
		
		for (int i = 10; i > 0; i--) 
		{
			System.out.println(i);
		}
		
		System.out.println("Third loop");
		
		for (int i = 0; i<=100; i = i+3) 
		{
			System.out.println(i);
		}
		
	}

}

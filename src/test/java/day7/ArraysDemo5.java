package day7;

public class ArraysDemo5 {

	public static void main(String[] args) {
		
		//Single Dimensional array
		String name[]= {"Swati", "Debamita", "Vishal", "Kalyan", "Pooja"};
		
		System.out.println(name[2]);
		
		Object data[][]=           //2d array
			{
				{"Hello","World"}, //-1st array
				{"Selenium","Java","Mukesh"}, //-2nd array
				{"Tommy",12,12.08,true}, //-3rd array
				
		    };
		System.out.println(data[1][2]);

	}

}

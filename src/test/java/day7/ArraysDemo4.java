package day7;

public class ArraysDemo4 {

	public static void main(String[] args) {
		
		//https://testng.org/doc/documentation-main.html#parameters-dataproviders
		
		//2D Array- Row column
		
		String [][] names=new String[3][2];
		names[0][0]="Vickey";
		names[0][1]="Sayali";
		
		names[1][0]="Pooja";
		names[1][1]="Neeraj";
		
		names[2][0]="Shahu";
		names[2][1]="Himankshi";
		
		System.out.println(names[2][1]);
		
		Object [][] data=new Object[3][2];
		data[0][0]=10;
		data[0][1]=10.2;
		
		data[1][0]=true;
		data[1][1]="Neeraj";
		
		data[2][0]="Vickey";
		data[2][1]="Himankshi";
		
		System.out.println(data[2][1]);
		

	}

}

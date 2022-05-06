package day7;

public class ArraysDemo2 {

	public static void main(String[] args) {
		
		Student s1=new Student("Anshu", 10, true);
		Student s2=new Student("Phani", 10, false);
		Student s3=new Student("Venkat", 10, true);
		
		Student [] snames=new Student[3];
		
		snames[0]=s1;
		snames[1]=s2;
		snames[2]=s3;
		
		System.out.println(snames[0].name);
		System.out.println(snames[1].marks);
		System.out.println(snames[0].status);
		

	}

}

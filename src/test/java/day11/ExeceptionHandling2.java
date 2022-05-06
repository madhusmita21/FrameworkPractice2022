package day11;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class ExeceptionHandling2 {

	public static void main(String[] args) {

	File src=new File("");
	
	try {
		FileInputStream fis=new FileInputStream(src);
	} catch (FileNotFoundException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}

	}

}

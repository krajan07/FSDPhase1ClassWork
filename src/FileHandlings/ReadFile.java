package FileHandlings;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;


public class ReadFile {

	public static void main(String[] args) throws IOException {
		char[] readf = new char[50];
		FileReader inputd;

		try {
		    inputd = new FileReader("/Users/renu/FSD/filechecks/output.txt");
			inputd.read(readf);
			
			System.out.println("Data read from the  int file: \n");	
			System.out.println(readf);	
			
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}	
		
	}

}

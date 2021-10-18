package cw_FileHandlings_Oct9;

import java.io.FileWriter;
import java.io.IOException;
public class FileCreate {

	public static void main(String[] args) {
		
		String data = "This is the data I am writing into the output file.";
		
		try {
			// Creating a Writer using FileDemo
			FileWriter output = new FileWriter("/Users/renu/FSD/filechecks/output.txt");		
			//Write data into file
			output.write(data);
			System.out.println("Data Writtern into file");	
			//output.append("TEST"); 
			//Close writer
			output.close();
			
		} 
		catch (IOException e) {
			e.printStackTrace();
		}
	}
}

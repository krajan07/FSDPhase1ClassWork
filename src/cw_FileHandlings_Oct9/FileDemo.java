package cw_FileHandlings_Oct9;

import java.io.File;
import java.io.IOException;

public class FileDemo {

	public static void main(String[] args) {
		
		File file1 = new File("/Users/renu/FSD/filechecks/checking.txt");
		
		try {
			if(file1.createNewFile()) {
				System.out.println("New File is created");
			}
			else {
				if(file1.exists()) {
					System.out.println("File exists");
					System.out.println("File Path : " + file1.getAbsolutePath());
					System.out.println("Name of the file is " +file1.getName());
					System.out.println("Class of the file is " + file1.getClass());
					System.out.println("Usable space available is " +file1.getUsableSpace());
					System.out.println("Parent : " + file1.getParent());
					System.out.println("Length of the file is " + file1.length());
					System.out.println("File list" +file1.list());
				}
				else {
					System.out.println("File doesnot exists");
				}
				
			boolean b = file1.delete();
			if(b==true) {
				System.out.println("File1 deleted");
			}
			}
		} catch (IOException e) {
			
			e.printStackTrace();
		}
	}

}

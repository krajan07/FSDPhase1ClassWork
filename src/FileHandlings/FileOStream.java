package FileHandlings;

import java.io.FileInputStream;
import java.io.IOException;

public class FileOStream {

	public static void main(String[] args) throws IOException {
		FileInputStream FIS = new FileInputStream("/Users/renu/FSD/filechecks/checking.txt");
		System.out.println(FIS.getChannel());
		System.out.println("Number of bytes read from the file : " + FIS.available());
		FIS.skip(7);	
		
		System.out.println("File Contents : ");
		int ch;
		
		while((ch=FIS.read())!=-1)
			System.out.println((char)ch);
		FIS.close();
	}
}

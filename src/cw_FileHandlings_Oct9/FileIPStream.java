package cw_FileHandlings_Oct9;

import java.io.BufferedOutputStream;
import java.io.DataInputStream;
//import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileIPStream {

	public static void main(String[] args) throws IOException {
		DataInputStream DIS = new DataInputStream(System.in);
		FileOutputStream FOS = new FileOutputStream("/Users/renu/FSD/filechecks/checking.txt",true);
		BufferedOutputStream BOS = new BufferedOutputStream(FOS,1024);
		System.out.println("Enter text (@ at the end):");
		char ch;
		while((ch=(char)DIS.read())!='@') {
			BOS.write(ch);
		}
		BOS.close();
	}
}

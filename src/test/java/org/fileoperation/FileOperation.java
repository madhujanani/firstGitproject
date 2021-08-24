package org.fileoperation;

import java.io.File;
import java.io.IOException;

public class FileOperation {
	public static void main(String[] args) throws IOException {
		// File Handling QA-7,8,9
		File f = new File("C:\\java\\selenium\\material\\sample.txt");
		boolean newFldr = f.mkdirs();
		System.out.println(newFldr);
		boolean newFile = f.createNewFile();
		System.out.println(newFile);
		
		
		
		
////		boolean canWrite = f.canWrite();
////		System.out.println(canWrite);
////		boolean exists = f.exists();
////		System.out.println(exists);
//		String string = f.toString();
//		System.out.println(string);
		
	}

}

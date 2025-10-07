package org.onlineclass.tasks;

import java.io.File;
import java.io.IOException;

public class FileHandlingDemo {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		File f = new File("example.txt");
		f.createNewFile();
		if(f.exists())
		{
			System.out.println("File already exists ");
			System.out.println("Name of the File"+f.getName());
			System.out.println("Path of the File"+f.getAbsolutePath());
	
		}
		else 
		{
			System.out.println("File is not created");
		}
		
	}

}

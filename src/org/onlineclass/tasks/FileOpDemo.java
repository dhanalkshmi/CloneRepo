package org.onlineclass.tasks;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileOpDemo {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		File f=new File("example.txt");
		f.createNewFile();
		FileOutputStream fo = new FileOutputStream("example.txt");
		String data = "I am so low.............";
		fo.write(data.getBytes());
		fo.close();
		System.out.println("Data has been written ");
	}

}

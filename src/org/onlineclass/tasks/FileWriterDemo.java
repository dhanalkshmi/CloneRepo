package org.onlineclass.tasks;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileWriterDemo {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		FileWriter fw = new FileWriter("example.txt", true);
		fw.write("I feel frustrated.............");
		fw.close();
		FileInputStream fis = new FileInputStream("example.txt");
		int i = fis.read();
		while (i != -1) {
			System.out.print((char) i);
			i = fis.read();
		}
		fis.close();
		BufferedReader bf = new BufferedReader(new FileReader("example.txt"));
		String line = bf.readLine();
		while (line != null) {
			System.out.println(line);
			line = bf.readLine();
		}
		bf.close();

	}
}

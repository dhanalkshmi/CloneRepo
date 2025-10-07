package org.onlineclass.tasks;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.security.AlgorithmParameterGenerator;

public class ExceptionThrows {
public static void ram() throws FileNotFoundException {
	// TODO Auto-generated method stub
sita();
}
public static void sita() throws FileNotFoundException {
	// TODO Auto-generated method stub
	FileOutputStream fout=new FileOutputStream("d:\\ck\\print.txt");
}
	public static void main(String[] args) throws FileNotFoundException {
		// TODO Auto-generated method stub
ram();
	}

}

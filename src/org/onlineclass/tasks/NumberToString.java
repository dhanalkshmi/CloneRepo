package org.onlineclass.tasks;

import java.util.Scanner;

public class NumberToString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		String str = Integer.toString(n);
		for (int i = 0; i < str.length(); i++) {
			char digit = str.charAt(i);
			switch (digit) {
			case '0':
				System.out.println("Zero");
				break;
			case '1':
				System.out.println("One");
				break;
			case '2':
				System.out.println("Two");
				break;
			case '3':
				System.out.println("Three");
				break;
			case '4':
				System.out.println("Four");
				break;
			case '5':
				System.out.println("Five");
				break;
			case '6':
				System.out.println("Six");
				break;
			case '7':
				System.out.println("Seven");
				break;
			case '8':
				System.out.println("Eight");
				break;
			case '9':
				System.out.println("Nine");
				break;

			}
		}

	}
}

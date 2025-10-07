package org.onlineclass.tasks;

import java.util.Scanner;

public class SimpleCalc {
	static int a = 10;
	static int b = 20;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter + or - or * or /");
		char c = sc.next().charAt(0);
		switch (c) {
		case '+': {
			int sum = a + b;
			System.out.println(sum);
			break;
		}
		case '-': {
			int diff = a - b;
			System.out.println(diff);
			break;
		}
		case '*': {
			int mul = a * b;
			System.out.println(mul);
			break;
		}
		case '/': {
			int div = a / b;
			System.out.println(div);
			break;
		}

		}
	}
}
package org.onlineclass.tasks;

import java.util.Scanner;

public class MenuDrivenCalc {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter ur choice from 1 to 4");
		System.out.println("1.Addition");
		System.out.println("2.Subtraction");
		System.out.println("3.Multiply");
		System.out.println("4.Division");
		int choice = sc.nextInt();
		System.out.println("Enter  2 numbers");
		int a = sc.nextInt();
		int b = sc.nextInt();
		switch (choice) {
		case 1:
			int sum = a + b;
			System.out.println(sum);
			break;
		case 2:
			int diff = a - b;
			System.out.println(diff);
			break;
		case 3:
			int mul = a - b;
			System.out.println(mul);
			break;
		case 4:
			int div = a - b;
			System.out.println(div);
			break;
		default:
			System.out.println("enter 1to 4");
			break;
		}

	}

}

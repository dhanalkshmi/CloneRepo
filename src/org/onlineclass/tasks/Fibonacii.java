package org.onlineclass.tasks;

import java.util.Scanner;

public class Fibonacii {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int a = 0;
		int b = 1;
		int c = 0;
		for (int i = 1; i <= n; i++) {
			System.out.print(a + ",");
			c = a + b;
			a = b;
			b = c;
		}

	}

}

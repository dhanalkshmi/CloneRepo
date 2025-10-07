package org.onlineclass.tasks;

import java.util.Scanner;

public class PrimeNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int number = sc.nextInt();
		boolean flag = true;
		if (number <= 1) {
			flag = false;
		} else {
			for (int i = 2; i <= number/2; i++) {
				if (number % i == 0)
					flag = false;
				break;

			}
		}
		if (flag) {
			System.out.println("Prime");
		} else {
			System.out.println("Not prime");
		}

	}
}

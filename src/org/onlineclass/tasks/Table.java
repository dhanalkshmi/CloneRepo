package org.onlineclass.tasks;

import java.util.Scanner;

public class Table {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int number = sc.nextInt();
		for (int i = 1; i <= 10; i++) {
			int res = i * number;
			System.out.println(i + "*" + number + "=" + res);
		}

	}
}

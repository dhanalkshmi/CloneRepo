package org.onlineclass.tasks;

import java.util.Scanner;

public class Factorial {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int i = 1;
		int res = 1;
		while (i <= n) {
			res = res * i;
			i++;
		}
		System.out.println("Factorial:" + res);
	}

}

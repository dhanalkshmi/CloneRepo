package org.onlineclass.tasks;

public class ArrayPrimeNumber {
	public static boolean isPrime(int num) {
		if (num == 1) {
			return false;
		} else {
			for (int i = 2; i < num; i++) {
				if (num % i == 0) {
					return false;
				}
			
			}
			return true;

		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[] = { 2, 3, 89, 56, 23, 41 };
		int count = 0;
		for (int i = 0; i < a.length; i++) {
			if (isPrime(a[i])) {
				count++;
			}
		}
		System.out.println(count);
	}
}
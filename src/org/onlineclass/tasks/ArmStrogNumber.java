package org.onlineclass.tasks;

public class ArmStrogNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		for (int i = 1; i <= 1000; i++) {
			int temp = i;
			int n = i;
			int count = 0;
			int sum=0;
			while (n != 0) {
				n = n / 10;
				count = count + 1;

			}
			n = i;
			while (n != 0) {
				int digit = n % 10;
				int prod=1;
				for (int j = 0; j < count; j++) {
					prod = prod * digit;
				}
				sum=sum+prod;
				n = n / 10;
			}
			if (temp == sum) {
				System.out.println(temp);
			}
		}
	}

}

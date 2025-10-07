package org.onlineclass.tasks;

public class PascalTriangle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for (int i = 0; i < 5; i++) {
			int no = 1;
			for (int j = 0; j <= i; j++) {
				System.out.print(no + " ");
				no = no * (i - j) / (j + 1);
				}
			System.out.println(" ");
		}

	}
}
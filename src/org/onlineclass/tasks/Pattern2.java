package org.onlineclass.tasks;

public class Pattern2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int number=1;
		for(int i=1;i<=5;i++) {
			for(int j=1;j<=i;j++)
			{
				System.out.print(number);
				number++;
			}
			System.out.println();
		}
	}

}

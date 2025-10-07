package org.onlineclass.tasks;

public class BreakContinue {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for (int i = 1; i <= 3; i++) {
			for (int j = 1; j <= 3; j++) {
				if (j == 2)
				{
					continue;
				}
				System.out.print("i="+i + " " +"j="+" "+j);
				System.out.println();
			}
			
		}
		System.out.println("*************************************");
		for (int i = 1; i <= 3; i++) {
			for (int j = 1; j <= 3; j++) {
				if (j == 2)
				{
					break;
				}
				System.out.print("i="+i + " " +"j="+" "+j);
				System.out.println();
			}
			
		}	
	}

}

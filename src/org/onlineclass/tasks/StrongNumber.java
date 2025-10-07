package org.onlineclass.tasks;

import java.util.Scanner;

public class StrongNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int temp=n;
		int sum=0;
		while(n!=0)
		{
			int digit =n%10;
			int prod=1;
		    for(int i=1;i<=digit;i++)
			{
			prod=prod*i;
			}
			sum=sum+prod;
			n=n/10;
		}
		if(temp==sum)
		{	
			System.out.println("Strong Number");
		}
		else
		{
			System.out.println("Not a Strong Number");
		}
	}

}

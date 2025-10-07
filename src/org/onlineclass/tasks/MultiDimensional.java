package org.onlineclass.tasks;

import java.util.Arrays;
import java.util.Scanner;

public class MultiDimensional {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int size = sc.nextInt();
       int a[][]=new int[size][size];
       for(int i=0;i<a.length;i++)
       {
    	for(int j=0;j<a[i].length;j++) 
    	{
    		System.out.println("enter i,j");
    		a[i][j]=sc.nextInt();
    	}
       }
       for(int i=0;i<a.length;i++)
       {
    	for(int j=0;j<a[i].length;j++) 
    	{
    		System.out.print(a[i][j]+" ");
    	}
    	System.out.println();
       }
	}
}



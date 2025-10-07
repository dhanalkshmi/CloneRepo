package org.onlineclass.tasks;

import java.util.Arrays;

public class ReverseArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[]= {50,89,56,32};
		int rev[]=new int[a.length];
		for (int i=0,k=a.length-1;i<a.length;i++,k--)
		{
			rev[i]=a[k];
		}
		
System.out.println(Arrays.toString(rev));
	}

}

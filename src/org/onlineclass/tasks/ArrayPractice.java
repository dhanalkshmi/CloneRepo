package org.onlineclass.tasks;

public class ArrayPractice {
public static void main(String[] args) {
	int a[]= {0,1,2,3,4,6};
	int sum=0;
	for(int i=0;i<a.length;i++)
	{
		//System.out.println(a[i]);
		//sum=sum+a[i];
		if(i%2==0)
		{
			sum=sum+a[i];
		}
	}
	
	System.out.println(sum);
	int []a1=new int[3];
	a1[0]=23;
	a1[1]=56;
	a1[2]=89;
	for(int i=0;i<a1.length;i++)
	{
		System.out.println(a1[i]);
	}
		
}
}

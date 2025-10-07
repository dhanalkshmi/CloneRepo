package org.onlineclass;

import java.util.Scanner;

public class TypeCasting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int number=sc.nextInt();
		double d=number;
		System.out.println("int to double"+" "+d);
		double a = 10;// Upcasting
		float f = 56;
		String s = "89";
		int i = (int) 10.5;// Downcasting
		System.out.println(a+" "+f+" "+s+" "+i);
		int i2=56;
		Integer it=i2; //Auto boxing
		float f2=10.5f;
		Float f3=f2;    //Auto boxing
		Integer itt=56;
		int i4=Integer.valueOf(itt);//Unboxing
		Double d2=56.89;
		double d4=Double.valueOf(d2);//Unboxing
		System.out.println(it+" "+f3+" "+i4+" "+d4);
		}

}

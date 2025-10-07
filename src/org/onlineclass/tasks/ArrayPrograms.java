package org.onlineclass.tasks;

import java.util.ArrayList;
import java.util.List;

public class ArrayPrograms {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[] = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
		int[] a2 = { 11, 12, 13, 14, 15, 16 };
		int sum = 0;
		for (int i = 0; i < 10; i++) {
			sum = sum + a[i];
		}
		double ave = sum / a.length;
		System.out.println(sum);
		System.out.println(ave);
		System.out.println(a2.length);
		System.out.println("***************************");
		for (int i = 0; i < a2.length; i++) {
			System.out.println(a2[i]);
		}
		System.out.println("******************For Each*****************");
		for (int a3 : a2) {
			System.out.println(a3);
		}
		System.out.println("*****************List*********************");
		List<Integer> l = new ArrayList();
		l.add(11);
		l.add(12);
		l.add(13);
		l.add(14);
		l.add(15);
		l.add(16);
		System.out.println(l);
		System.out.println("**************Using For Loop*********************");
		for (int i = 0; i < l.size(); i++) {
			System.out.println(l.get(i));
		}
		System.out.println("**************Using For Each Loop*********************");
		for (Integer n : l) {
			System.out.println(n);
		}
		System.out.println("**************List*********************");
		List<Integer> l2 = new ArrayList();
		l2.add(10);
		l2.add(20);
		l2.add(30);
		l2.add(90);
		l2.add(10);
		l2.add(10);
		System.out.println(l2);
		for(int i=0;i<l2.size();i++)
		{
			if(l2.get(i)==10)
			{
				l2.set(i, 100);
			}
		}
		System.out.println(l2);
	}
}
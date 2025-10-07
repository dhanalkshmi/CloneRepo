package org.onlineclass.tasks;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class ComparatorInterface implements Comparator{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
ArrayList al=new ArrayList();
al.add(20);
al.add(10);
al.add(40);
al.add(30);
System.out.println(al);
Collections.sort(al,new ComparatorInterface());
System.out.println(al);
	}

	@Override
	public int compare(Object o1, Object o2) {
		// TODO Auto-generated method stub
		Integer n1=(Integer)o1;
		Integer n2=(Integer)o2;
		return n2-n1;
	}

}

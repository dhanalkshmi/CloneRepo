package org.onlineclass.tasks;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;
import java.util.Vector;

public class TypesOfList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
ArrayList l=new ArrayList();
l.add("Apple");
l.add("Banana");

ArrayList<String> l2=new ArrayList();
l2.add("Cat");
l2.add("Dog");
//l2.add(0,"Apple");
//l.add(10);
//l.add("mala");
//l.add(10.5);
//l.add(null);
//
//System.out.println(l);
//LinkedList l2=new LinkedList();
//l2.add(10);
//l2.add("mala");
//l2.add(10.5);
//l2.add(null);
//l2.add(10);
//System.out.println(l2);
//Vector l3=new Vector();
//l3.add(10);
//l3.add("mala");
//l3.add(10.5);
//l3.add(null);
//l3.add(10);
//System.out.println(l3);
//l.add(0, 20);
l.addAll(l2);
System.out.println(l);
System.out.println(l2);
l.addAll(2, l2);
l2.add(2,"elephant");
System.out.println(l);
System.out.println(l.contains("Cat"));
System.out.println(l.contains(0));
System.out.println(l.containsAll(l2));
l.remove("Apple");
l.removeAll(l2);
l.add("Dog");
System.out.println(l2);
System.out.println(l);
l.retainAll(l2);
System.out.println(l);
System.out.println(l);
System.out.println("------------------");
System.out.println(l.indexOf("Dog"));
System.out.println(l.remove(0));
System.out.println(l2);
l2.remove(0);
System.out.println(l2);
System.out.println(l2.size());
l2.isEmpty();
System.out.println(l2);
System.out.println("+++++++++++++++++++++++");
for(int i=0;i<l2.size();i++)
{
	System.out.println(l2.get(i));
}
System.out.println("+++++++++++++Using Iterator++++++++++");
Iterator i=l2.iterator();
while(i.hasNext())
{
	//System.out.println(i.hasNext());
	System.out.println(i.next());
}
System.out.println("+++++++++++++Using Iterator(Backward direction++++++++++");
ListIterator i2=l2.listIterator(l2.size());
while(i2.hasPrevious())
{
	//System.out.println(i.hasNext());
	System.out.println(i2.previous());
}
System.out.println("+++++++++++++For Each++++++++++");
for (String obj : l2) {
	System.out.println(obj);
}
l2.add(2,"Apple");
System.out.println("Before sorting");
System.out.println(l2);
Collections.sort(l2);
System.out.println("After sorting");
System.out.println(l2);
System.out.println("+++++++++++++Downcasting++++++++++");
l.add("A");
l.add("B");
System.out.println(l);
for (Object n : l) {
	int a=(Integer)n;
	System.out.println(n);
}


	}

}

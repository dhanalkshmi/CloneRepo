package org.onlineclass.tasks;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.TreeSet;

public class SetPractice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashSet<Integer> hs=new HashSet<Integer>();
		hs.add(40);
		hs.add(30);
		hs.add(40);
		hs.add(null);
		System.out.println(hs);
		LinkedHashSet<String> ls=new LinkedHashSet<>();
		ls.add("40");
		ls.add("30");
		ls.add("40");
		ls.add(null);
		System.out.println(ls);
		TreeSet<String> ts=new TreeSet<>();
		ts.add("40");
		ts.add("30");
		ts.add("40");
		//ts.add(null);
		System.out.println(ts);
	}

}

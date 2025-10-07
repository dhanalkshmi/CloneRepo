package org.onlineclass.tasks;

import java.util.Arrays;

public class StringPractice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
String s="java";
String ss="world";
String s2="java,hai,hello";
System.out.println(System.identityHashCode(s));
System.out.println(System.identityHashCode(s2));
String s3=new String("Hello");
System.out.println(System.identityHashCode(s3));
System.out.println(System.identityHashCode(s.concat(s2)));
StringBuilder sb=new StringBuilder("Hello");
StringBuffer sb1=new StringBuffer("Hello");
System.out.println(s==s3);
System.out.println(s2.equals(s3));
System.out.println(s.length());
System.out.println(s.toUpperCase());
System.out.println(s.toLowerCase());
System.out.println(s.contains("jv"));
System.out.println(s.indexOf('a'));
System.out.println(s.charAt(1));
System.out.println(s.startsWith("j"));
System.out.println(s.endsWith("i"));
System.out.println(s.substring(1));
System.out.println(s.substring(1,2));
String[] st = s2.split(" ");
for (String str : st) {
System.out.println(str);	
}
String[] st2 = s2.split(" ",1);
for (String str2 : st) {
System.out.println(str2);	
}
String[] st3 = s2.split(",");
System.out.println(Arrays.toString(st3));
StringBuilder sbb=new StringBuilder();
System.out.println(sbb.capacity());
sbb.append("123466444646464646464646447777787878787878787878882345");
System.out.println(sbb.capacity());

	}


}

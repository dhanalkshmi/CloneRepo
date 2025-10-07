package org.onlineclass.tasks;

import java.util.Scanner;

public class StringFunctions {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String a = "Hello";
		char[] c = a.toCharArray();
		String reversed = "";
		System.out.println("Original");
		for (int i = 0; i < c.length; i++) {
			System.out.print(c[i]);
		}
		System.out.println("Reversed");
		for (int i = a.length() - 1; i >= 0; i--) {
			System.out.print(a.charAt(i));
		}
		System.out.println("**********");
		String m = "madam";
		for (int i = m.length() - 1; i >= 0; i--) {
			reversed = reversed + m.charAt(i);
		}
		if (m.equals(reversed)) {
			System.out.println("palindrome");
		} else {
			System.out.println("not a palindrome");
		}
		System.out.println("**********");
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter ur pwd");
		String pwd = sc.next();
		System.out.println("Enter confirm pwd");
		String cpwd = sc.next();
		if(pwd.equals(cpwd))
		{
			System.out.println("Password correct");
		}
		else
		{
			System.out.println("Password incorrect");
		}
		System.out.println("**********");
		System.out.println("Enter ur mail id");
		String mail = sc.next();
		if (mail.contains("@"))
		{
			System.out.println("Valid email id");
		}
		else
		{
			System.out.println("Invalid email id");
		}
		String s="Welcome to class java";
		if(s.endsWith("java"))
		{
			String rep = s.replace("java", "SQL");
			System.out.println(rep);
		}
		String s1="Welcome";
		String s2=s1.toLowerCase();
		char[] ch=s2.toCharArray();
		int counts=0;
		for(int i=0;i<ch.length;i++)
		{
			char ch2=ch[i];
			if(ch2=='a' || ch2=='e' ||ch2=='i' || ch2=='o' || ch2=='u')
			{
				counts++;
			}
		}
		System.out.println("Vowels count:"+counts);
		String s13="Welcome";
		String s23=s13.toLowerCase();
		char[] ch1=s23.toCharArray();
		int count=0;
		for(int i=0;i<ch1.length;i++)
		{
			char ch2=ch[i];
			if(!(ch2=='a' || ch2=='e' ||ch2=='i' || ch2=='o' || ch2=='u'))
			{
				count++;
			}
		}
		System.out.println("Consonents count:"+count);
		String s3="Welcome to java class";
		String replace = s3.replace(" ","#");	
		System.out.println(replace);
		String str="WelcomE";
		String str2="";
		for(int i=0;i<str.length();i++)
		{
			char ch3 = str.charAt(i);
			if(Character.isUpperCase(ch3))
			{
				str2=str2+Character.toLowerCase(ch3);
			}
			else
			{
				str2=str2+Character.toUpperCase(ch3);
			}
		}
		System.out.println(str2);
		String st="welcome";
		String st2="";
		for(int i=0;i<st.length();i++)
		{
			char ch2=st.charAt(i);
			if(ch2=='a' || ch2=='e' ||ch2=='i' || ch2=='o' || ch2=='u')
			{
			st2=st2+'@';
			}
			else
			{
				st2=st2+ch2;
			}
			
		}
		System.out.println(st2);
	}

	

}


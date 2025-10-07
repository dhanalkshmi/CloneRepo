package org.onlineclass;

public class KeyWords extends Employee {
	static int a = 10;
	final int b = 20;
	int d = 89;

	private void accessUse() {
		// TODO Auto-generated method stub
		int d = 30;
		System.out.println(d); // local variable
		System.out.println(this.d); // Instance variable
		System.out.println(super.d); // parent class variable
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		KeyWords k = new KeyWords();
		//b=40;            //final variable cannot be reassigned
		k.accessUse();
	}

}

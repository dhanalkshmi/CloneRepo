package org.onlineclass;

public class Company {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee2 m = new Manager("Priya", 20000, 10000);
		Employee2 d = new Developer("Balaji", 80000, 2, 5000);
		m.displayInfo();
		d.displayInfo();
	}

}

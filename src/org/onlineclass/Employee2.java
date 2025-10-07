package org.onlineclass;

abstract class Employee2 {
	String name;
	double baseSalary;

	public Employee2(String name, double baseSalary) {
		this.name = name;
		this.baseSalary = baseSalary;
		// TODO Auto-generated constructor stub
	}

	public abstract double calculateSal();

	public void displayInfo() {
		// TODO Auto-generated method stub
		System.out.println("Name of the Employee" + " " + name + "salary" + " " + baseSalary+"Total salary"+" "+calculateSal());
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}

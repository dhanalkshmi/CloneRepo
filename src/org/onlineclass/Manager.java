package org.onlineclass;

public class Manager extends Employee2 {

	int bonus;

	public Manager(String name, double baseSalary, int bonus) {
		super(name, baseSalary);
		this.bonus = bonus;
		// TODO Auto-generated constructor stub

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	@Override
	public double calculateSal() {
		// TODO Auto-generated method stub
		return baseSalary + bonus;
	}

}

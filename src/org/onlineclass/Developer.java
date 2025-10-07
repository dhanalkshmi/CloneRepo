package org.onlineclass;

public class Developer extends Employee2 {
int extraHrs;
double ratePerHr;


public Developer(String name, double baseSalary,int extraHrs,double ratePerHr)
{
	super(name,baseSalary);
	this.extraHrs=extraHrs;
	this.ratePerHr=ratePerHr;
	
}
@Override
	public double calculateSal() {
		// TODO Auto-generated method stub
		return baseSalary+(extraHrs*ratePerHr);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}

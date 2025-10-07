package org.onlineclass.tasks;

import java.util.Arrays;

public class Laptop implements Comparable
{
int id;
String brand;
double price;
Laptop(int id ,String brand,double price)
{
	this.id=id;
	this.brand=brand;
	this.price=price;
}
@Override
	public String toString() {
		// TODO Auto-generated method stub
		return id+brand+price;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Laptop l1=new Laptop(1,"HP",10000);
		Laptop l2=new Laptop(5,"HP",50000);
		Laptop l3=new Laptop(3,"HP",20000);
		Laptop ll[]= {l1,l2,l3};
		System.out.println("Before sorting:"+Arrays.toString(ll));
		Arrays.sort(ll);
		System.out.println("After sorting:"+Arrays.toString(ll));
	}

	@Override
	public int compareTo(Object o) {
		
		Laptop l=(Laptop)o;
		if(this.price>l.price)
		{
			return 1;
		}
		else if (this.price<l.price)
		{
		return -1;
		}
		// TODO Auto-generated method stub
		else {
		return 0;
	}

}
}

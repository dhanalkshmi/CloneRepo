package org.onlineclass;

public class Dolphin extends SeaAnimals {
	int size;
	final static String eat = "nv";

	public Dolphin(String name, String color, int size) {
		super(name, color);
		this.size = size;
		// TODO Auto-generated constructor stub
	}

	public void size() {
		super.swim();
		System.out.println("size:"+this.size + "cm");
		// TODO Auto-generated method stub

	}

	public void displayInfo() {
		// TODO Auto-generated method stub
		System.out.println(super.name + "eats" + eat);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Dolphin d = new Dolphin("Whale", "Blue", 9);
		d.size();
		d.displayInfo();
	}

}

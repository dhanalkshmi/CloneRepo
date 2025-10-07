package org.onlineclass;

public class Car {
	String brand="BMW";
	String model="Sedans";

	public void start() {
		System.out.println("Car started");
		// TODO Auto-generated method stub

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Car c = new Car();
		c.start();
		System.out.println(c.brand);
		System.out.println(c.model);
	}

}

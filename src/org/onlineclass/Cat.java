package org.onlineclass;

public class Cat extends Animal {
	@Override
	public void sound() {
		// TODO Auto-generated method stub
		System.out.println("Meow");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Cat c = new Cat();
		c.sound();
	}

}

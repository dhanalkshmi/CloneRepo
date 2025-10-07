package org.onlineclass;

public class Dog extends Animal {
	@Override
	public void sound() {
		// TODO Auto-generated method stub
		System.out.println("bow bow");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Animal a = new Dog();
		a.sound();
	}

}

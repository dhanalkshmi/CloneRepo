package org.onlineclass;

public class ConstOverLoad {
	static int sta_var = 100;
	int ins_var = 200;

	public ConstOverLoad() {
		System.out.println("Empty Constructor"); // TODO Auto-generated constructor stub
	}

	ConstOverLoad(String name) {
		System.out.println("Name" + " " + name);
	}

	ConstOverLoad(int a, int b) {
		int c = a + b;
		System.out.println("Added value" + " " + c);
	}

	void showVariables() {
		// Local variable (only used inside this method)
		int local_var = 10;
        System.out.println("Local Variable: " + local_var);
		System.out.println("Instance Variable: " + ins_var);
		System.out.println("Static Variable: " + sta_var);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ConstOverLoad c = new ConstOverLoad();
		ConstOverLoad c1 = new ConstOverLoad("Priya");
		ConstOverLoad c2 = new ConstOverLoad(100, 100);
		c1.showVariables();
	}

}

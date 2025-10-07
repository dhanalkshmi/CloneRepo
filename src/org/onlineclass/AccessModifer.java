package org.onlineclass;

public class AccessModifer {

	public void pubMeth() {
		// TODO Auto-generated method stub
		System.out.println("Public method");
	}

	private void priMeth() {
		// TODO Auto-generated method stub
		System.out.println("Private method");
	}

	void defMeth() {
		// TODO Auto-generated method stub
		System.out.println("Default method");
	}

	protected void proMeth() {
		// TODO Auto-generated method stub
		System.out.println("Protected method");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AccessModifer a = new AccessModifer();
		a.priMeth();
		a.defMeth();
		a.proMeth();
		a.pubMeth();
	}

}

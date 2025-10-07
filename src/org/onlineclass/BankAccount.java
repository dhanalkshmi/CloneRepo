package org.onlineclass;

abstract class BankAccount {
	public abstract void withdraw(long acno, int amt);

	public abstract void checkBal(long acno);

	public void statement() {
		// TODO Auto-generated method stub
		System.out.println("Statement details");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}

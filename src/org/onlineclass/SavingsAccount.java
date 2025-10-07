package org.onlineclass;

public class SavingsAccount extends BankAccount {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SavingsAccount c = new SavingsAccount();
		c.withdraw(12345, 10000);
		c.checkBal(12345);
		c.statement();
	}

	@Override
	public void withdraw(long acno, int amt) {
		// TODO Auto-generated method stub
		System.out.println("Amount withdrawn" + " " + amt);
	}

	@Override
	public void checkBal(long acno) {
		// TODO Auto-generated method stub
		System.out.println("Balance amount");
	}

}

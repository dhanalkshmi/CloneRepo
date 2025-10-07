package org.onlineclass;

public class CurrentAccount extends BankAccount {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CurrentAccount c = new CurrentAccount();
		c.withdraw(123, 1000);
		c.checkBal(123);
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

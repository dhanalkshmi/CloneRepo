package org.onlineclass.tasks;

public class UserDefinedException extends RuntimeException {

	public UserDefinedException(String msg) {
		// TODO Auto-generated constructor stub
		super(msg);
	}
	public static void main(String[] args) {
try
{// TODO Auto-generated method stub
int age=16;
if(age<18) {
	throw new UserDefinedException("Under age");
}

else
{
	System.out.println("Eligible to vote");
}
}
catch(UserDefinedException d){
	System.out.println("Exception caught"+ d.getMessage());
	
}
	}

}

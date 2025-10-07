package org.onlineclass;

public class Employee {
	private int emp_id;
	private long sal;
	int d = 1234;

	public void setEmp_id(int emp_id) {
		this.emp_id = emp_id;
	}

	public int getEmp_id() {
		return emp_id;
	}

	public long getSal() {
		return sal;
	}

	public void setSal(long sal) {
		this.sal = sal;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee e = new Employee();
		e.setEmp_id(5);
		System.out.println(e.getEmp_id());
	}

}

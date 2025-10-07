package org.onlineclass.tasks;

public class EmployeeArray {
	int id;
	String name;
	long sal;

	public EmployeeArray(int id, String name, long sal) {
		// TODO Auto-generated constructor stub
		this.id = id;
		this.name = name;
		this.sal = sal;
	}
//	public String toString()
//	{
//		System.out.println("Employee id:"+id);
//		System.out.println("Employee name:"+name);
//		System.out.println("Employee salary:"+sal);
//		return " ";
//		
//	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		EmployeeArray e1 = new EmployeeArray(1, "abc", 10000);
		EmployeeArray e2 = new EmployeeArray(2, "xyz", 20000);
		EmployeeArray e3 = new EmployeeArray(3, "jkjkjk", 25000);
		String details=e1.toString();
		System.out.println(details);
//		EmployeeArray emp[] = { e1, e2, e3 };
//		for (int i = 0; i < emp.length; i++) {
//			if (emp[i].sal > 10000) {
//				System.out.println(emp[i]);
//			}
//		}
	}

}

package org.onlineclass.tasks;

public class ExceptionHandling {

	public static void main(String[] args) {
		try { // TODO Auto-generated method stub
			int a = 10;
			int b = 2;
			int d = a / b;
			System.out.println(d);
			String s=null;
			System.out.println(s.length());
			
			
		} 
		
		catch (ArithmeticException e) {
			System.out.println("Zero is not allowed");
			// TODO: handle exception
		} 
		catch (NullPointerException e) {
		    System.out.println("Caught NullPointerException"+e.getMessage());
		}
		catch(Exception e)
		{
			System.out.println("object is not created");
		}
		finally
		{
			System.out.println("Mandatory Statements");
		}
               
		System.out.println("****************************");

	}
}

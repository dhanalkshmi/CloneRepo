package org.onlineclass;

public class TypeConvertionCalc {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = 10;
		int b = 20;
		int sum = a + b;
		Integer it=sum;      //autoboxing
		String convert=Integer.toString(it);
		double div=a/b;
		int d=(int)div;     //narrowing
		int m=a*b;
		double m2=m;          //widening
		Integer intg=100;
		int i2=Integer.valueOf(intg);   //auto unboxing
		System.out.println(sum+"   "+it+"     "+convert+"      "+d+"     "+m+"      "+m2+"    "+i2);

	}

}

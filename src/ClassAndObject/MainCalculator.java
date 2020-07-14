package ClassAndObject;

import java.util.Scanner;
public class MainCalculator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc=new Scanner(System.in);
		
		//power of integer values
		
		System.out.println("enter int value n1 = ");
		int n1 =sc.nextInt();
		System.out.println("enter int value n2 = ");
		int n2 =sc.nextInt();
		// calling static  method using class name directly
		System.out.println("power of integer values " + n1 + "^" +n2 + " = " + Calculator.powerInt(n1, n2));
		
		//power of double values 
		
		System.out.println("\nenter double value m1 = ");
		double m1 =sc.nextDouble();
		System.out.println("enter double value m2 = ");
		Double m2 =sc.nextDouble();
		// calling static  method using class name directly
		System.out.println("power of integer values " + m1 + " ^ " + m2 + " = " + Calculator.powerDouble(m1, m2));
		sc.close();
	}

}

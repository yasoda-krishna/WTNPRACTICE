package exceptionhandling;
import java.util.*;
public class Userexceptiondemo {
	
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the first number");
		int a=sc.nextInt();
		System.out.println("Enter the second number");
		int b=sc.nextInt();
		Userexceptiondemo u=new Userexceptiondemo();
		try {
			int c=u.sum(a,b);
			System.out.print(c);
		} catch (Myexception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	private int sum(int a, int b) throws Myexception {
		int sum=0;
		if(a<0)
		{
			throw new Myexception(a);
		}
		else
		{
			sum=a+b;
		}
		return sum;
	}

}

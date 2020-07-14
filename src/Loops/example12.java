package Loops;

import java.util.Scanner;

public class example12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i,n,flag=0;
		Scanner r=new Scanner(System.in);
		n=r.nextInt();
		r.close();
		for(i=2;i<=n/2;i++)
		{
			if(n%i == 0)
			{
				flag++;
				break;
			}
		}
		if(flag==0 && n!=1)
		{
			System.out.println("number is a prime number");
		}else {
			System.out.println("number is not a prime number");
		}
		

	}

}

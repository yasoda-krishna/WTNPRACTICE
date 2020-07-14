package Loops;

import java.util.Scanner;

public class example18 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n,temp,rem,rev=0;
		Scanner r=new Scanner(System.in);
		n=r.nextInt();
		temp=n;
		r.close();
		
		while(n>0)
		{
			rem=n%10;
			rev=rev*10+rem;
			n=n/10;
		}
		if(temp==rev)
		{
			System.out.println("number is palendrom");
		}else {
			System.out.println("number is not a palendrom");
		}

	}

}

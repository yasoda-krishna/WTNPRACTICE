package stringStringBuffer;

import java.util.Scanner;

public class example9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("please enter input Strings s1 & s2 :");
		String a = sc.next();
		String b = sc.next();
		sc.close();
		
		int la=a.length();
		int lb=b.length();
		
		if(lb>la)
		{
			for(int i=0;i<la;i++)
			{
				System.out.print(a.charAt(i));
				System.out.print(b.charAt(i));
			}
			System.out.print(b.substring(la));
		}
		else
		{
			for(int i=0 ; i < lb;i++)
			{
				System.out.print(a.charAt(i));
				System.out.print(b.charAt(i));
			}
			System.out.print(a.substring(lb));
		}
	}

}

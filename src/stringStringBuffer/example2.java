package stringStringBuffer;

import java.util.Scanner;
public class example2 {

	public static void main(String[] args) {
		String str1,str2 ;
		System.out.println("please enter the input string : ");
		Scanner sc = new Scanner(System.in);
		str1 = sc.next();
		str2 = sc.next();
		sc.close();
		int l1=str1.length();
		if(str1.charAt(l1-1)==(str2.charAt(0)))
		{
			System.out.println(str1+str2.substring(1));
		}
		else
		{
			System.out.println(str1+" "+str2);
		}
	}

}

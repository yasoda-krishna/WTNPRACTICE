package stringStringBuffer;

import java.util.Scanner;
public class example8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("please enter input String :");
		String a = sc.nextLine();
		sc.close();
		
		int x=a.indexOf("*");
		
		StringBuffer sb = new StringBuffer(a);
		
		sb.delete(x-1, x+2);
		
		System.out.println("\n" + sb.toString());
	}

}

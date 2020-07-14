package stringStringBuffer;

import java.util.Scanner;
public class example4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner sc = new Scanner(System.in);
			String a = sc.next();		
			sc.close();		
			int n = a.length();
			if(n%2==0)
				System.out.println(a.substring(0,n/2));
			else
				System.out.println("null");
	}

}

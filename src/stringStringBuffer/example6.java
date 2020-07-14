package stringStringBuffer;
import java.util.Scanner;
public class example6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		  Scanner sc = new Scanner(System.in);
			System.out.println("please enter input Strings s1 & s2 :");
			String a = sc.nextLine();
			String b = sc.nextLine();
			sc.close();
			
			int l1=a.length();
			int l2 = b.length();
			
			if(l1<l2)
				System.out.println("output :" + a+b+a);
			else 
				System.out.println("output :" + b+a+b);
	}

}

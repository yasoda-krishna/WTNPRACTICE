package Loops;
import java.util.Scanner;
public class example5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("enter your choice: "); 
		Scanner r =new Scanner(System.in);
		String str = r.next();
		char ch=str.charAt(0);
		r.close();
		if ((ch>=97 && ch<=122 ) || (ch>=65 && ch<=90))
		{
			System.out.println("Alphabet");
		}else if((ch>=48 && ch<=57))
		{
			System.out.println("digit");
		}else {
			System.out.println("Symbol");
		}

	}

}

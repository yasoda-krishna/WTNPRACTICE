package stringStringBuffer;
import java.util.Scanner;
public class example7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("please enter input String :");
		String a = sc.nextLine();
		sc.close();
		
		if(a.endsWith("x") && a.startsWith("x"))
		{
			a = a.substring(1,a.length()-1);
		}
		if(a.endsWith("x"))
			a = a.substring(0,a.length()-1);
		if(a.startsWith("x"))
			a = a.substring(1);
		
		System.out.println(a);
	}

}

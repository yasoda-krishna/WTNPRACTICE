package stringStringBuffer;
import java.util.Scanner;
public class example5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		  Scanner sc = new Scanner(System.in);
			
			String a = sc.next();
			
			sc.close();
			
			int n = a.length();
			
			System.out.println(a.substring(1,n-1));
	}

}

package stringStringBuffer;
import java.util.Scanner;
public class example3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			
			Scanner sc = new Scanner(System.in);
			
			String a = sc.next();
			
			sc.close();
			
			int n = a.length();
			
			for(int i=0;i<n;i++)
			{
				System.out.print(a.substring(0,2));
			}
	

	}
}

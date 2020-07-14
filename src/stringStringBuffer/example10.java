package stringStringBuffer;
import java.util.Scanner;
public class example10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("please enter input Strings :");
		String a = sc.nextLine();
		int n = sc.nextInt();
		sc.close();
		
		int la=a.length();
		for(int i = 0; i < n ; i++)
			System.out.print(a.substring(la-n));
	}

}

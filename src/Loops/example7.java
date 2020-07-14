package Loops;
import java.util.Scanner;
public class example7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner r=new Scanner(System.in);
		String str=r.next();
		char ch=str.charAt(0);
		r.close();
		if(ch>=65 && ch<= 90) {
			System.out.println(str.toLowerCase());
		}else if(ch>=97 && ch<= 122) {
			System.out.println(str.toUpperCase());
		}

	}

}

package Loops;
import java.util.Scanner;

public class example1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a;
		Scanner n =new Scanner(System.in);
		a=n.nextInt();
		n.close();
		if(a > 0)
		{
			System.out.println("Positive");
		}else if(a < 0) {
			System.out.println("Negative");
		}else {
			System.out.println("Zero");
		}

	}

}

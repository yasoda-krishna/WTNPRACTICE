package Loops;
import java.util.Scanner;

public class example2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a;
		Scanner n=new Scanner(System.in);
		a=n.nextInt();
		n.close();
		
		if(a%2==0)
			System.out.println("even");
		else
			System.out.println("odd");

	}

}

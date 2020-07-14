package ClassAndObject;
import java.util.Scanner;
public class MainBox {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		  Scanner sc = new Scanner(System.in);
	      System.out.println("enter width:");
	      double width = sc.nextDouble();
	      System.out.println("enter height:");
	      double height = sc.nextDouble();
	      System.out.println("enter depth:");
	      double depth = sc.nextDouble();
	      sc.close();
	      Box b = new Box(width , height , depth);
	         
	      System.out.println("volume of box = " + b.volume());
	}

}

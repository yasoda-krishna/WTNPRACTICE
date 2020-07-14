package Loops;
import java.util.Scanner;
public class example8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner r=new Scanner(System.in);
		String str=r.next();
		char ch=str.charAt(0);
		r.close();
		switch(ch) {
		case 'R': System.out.println("Red");
		          break;
		case 'B': System.out.println("Blue");
                  break;
		case 'G': System.out.println("Green");
                  break;
		case 'Y': System.out.println("Yellow");
                  break;
		case 'O': System.out.println("Orange");
                  break;
		case 'W': System.out.println("Wite");
                  break;
        default : System.out.println("Invalide Code");
		}

	}

}

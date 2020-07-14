package CommandLineArguments;

public class example4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Sum of two numbers");
		int n1,n2,n3;
		n1=Integer.parseInt(args[0]);
		n2=Integer.parseInt(args[1]);
		n3=n1+n2;
		System.out.println("Sum of 10 and 20 is "+n3);
	}

}

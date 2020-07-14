package Loops;

public class example6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n1;
		n1=Integer.parseInt(args[1]);
		if(args[0]=="Male") {
			if(n1>=1 && n1<=58)
			{
				System.out.println("percentage of interest is 8.4%.");
			}else if(n1>=59 && n1<=100) {
				System.out.println("percentage of interest is 10.5%.");
			}
		}else {
			if(args[0]=="Female") {
				if(n1>=1 && n1<=58)
				{
					System.out.println("percentage of interest is 8.2%.");
				}else if(n1>=59 && n1<=100) {
					System.out.println("percentage of interest is 9.2%.");
				}
			}
		}
		
	}

}

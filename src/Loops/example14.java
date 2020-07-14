package Loops;

public class example14 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
        if(args.length==0) {
        	System.out.println("Please enter an integer number");
        }else {
        	int i,n,flag=0;
    		n=Integer.parseInt(args[0]);
    		for(i=2;i<=n/2;i++)
    		{
    			if(n%2==0) {
    			flag++;
    			break;
    			}
    		}
    		
    		if(n==1)
    		{
    			System.out.println("1 is neither prime nor composite");
    		}else if(n==0) {
    			System.out.println("0 is neither prime nor composite");
    		}else if(flag==0) {
    			System.out.println("number is prime number");
    		}else {
    			System.out.println("number is not a prime number");
    		}
    		
        }

	}

}

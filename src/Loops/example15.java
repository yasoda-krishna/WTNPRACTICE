package Loops;
import java.util.Scanner;
public class example15 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n,i,sum=0,rem=0,temp;
		Scanner r=new Scanner(System.in);
		i=r.nextInt();
		temp=i;
		r.close();
		
		for(n=i;n>0;)
		{
			rem=n%10;
			sum=sum+rem;
			n=n/10;
		}
		System.out.println("total sum for "+temp+" is: "+sum);

	}

}

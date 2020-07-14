package Loops;
import java.util.Scanner;
public class example13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner r=new Scanner(System.in);
		int i,j,a,b,flag;
		a=r.nextInt();
		b=r.nextInt();
		r.close();
		for(i=a;i<=b;i++) 
		{
			if(i==1 || i==0)
				continue ;
		flag=1;
		for(j=2;j<=i/2;j++)
		{
			if(i%j==0)
			{
				flag=0;
				break;
			}
		}
		if(flag==1)
			System.out.println(i);
	  }

	}

}

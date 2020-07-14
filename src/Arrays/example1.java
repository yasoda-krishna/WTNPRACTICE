package Arrays;

import java.util.Scanner;

public class example1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i,sum=0,n;
		float avg;
		Scanner r=new Scanner(System.in);
		System.out.println("Enter n value: ");
		n=r.nextInt();
		int a[] =new int[n];
		//r.close();
		for(i=0;i<n;i++)
		{
			System.out.println("Enter number: "+i);
			a[i]=r.nextInt();
			sum=sum+a[i];
		}
		
		avg=(float)sum/n;
		System.out.println("total sum is: "+sum);
		System.out.println("total avg is: "+avg);

	}

}

package praticeProgramsInclass;

import java.util.Scanner;

public class FirstLastMiddle {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int[] a=new int[n];
		for(int i=0;i<n;i++)
		{
			a[i]=sc.nextInt();
		}
		sc.close();
		int max=a[0];
		if(a[a.length-1]>max)
		{
			max=a[a.length-1];
			
		}
		if(a[(a.length-1)/2]>max)
		{
			max=a[(a.length-1)/2];
		}
		System.out.println(max);
		

	}

}

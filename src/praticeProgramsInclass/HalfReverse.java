package praticeProgramsInclass;

import java.util.Scanner;

public class HalfReverse {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		int[]a = new int[n];
		for(int i=0;i<n;i++)
		a[i]=sc.nextInt();
		int b=sc.nextInt();

		int[]c = new int[n];
		for(int i=0;i<n;i++)
		{
		if(i<b)
		c[i]=a[b-i-1];
		else
		c[i]=a[i];
		}

		for(int i=0;i<n;i++)
		System.out.print(c[i]+" ");
		sc.close();
	}

}

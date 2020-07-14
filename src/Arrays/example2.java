package Arrays;
import java.util.Scanner;
public class example2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i,n;
		System.out.println("Enter n value: ");
		Scanner r=new Scanner(System.in);
		n=r.nextInt();
		int[] a=new int[n];
		
		for(i=0;i<a.length;i++)
		{
			System.out.println("Enter value: "+i);
			a[i]=r.nextInt();
		}
		int max=a[0];
		int min=a[0];
		for(i=0;i<a.length;i++)
		{
			if(a[0]<=a[i])
			{
				max=a[i];
			}
			if(a[0]>=a[i])
			{
				min=a[i];
			}
			
		}
		System.out.println("Maximum value is: "+max);
		System.out.println("Minimum value is: "+min);

	}

}

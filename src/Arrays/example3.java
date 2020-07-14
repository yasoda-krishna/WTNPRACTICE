package Arrays;
import java.util.Scanner;
public class example3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i,n,key,c=0;
		Scanner r=new Scanner(System.in);
		System.out.print("Enter n value: ");
		n=r.nextInt();
		int[] a=new int[n];
		
		for(i=0;i<a.length;i++) {
			System.out.print("Enter value: ");
			a[i]=r.nextInt();
		}
		System.out.print("Enter key value: ");
		key=r.nextInt();
		for(i=0;i<a.length;i++)
		{
			if(a[i]==key)
			{
				c++;
				break;
				
			}
		}
		if(c>0) {
			System.out.println(i);
		}else {
			System.out.println("-1");
		}
		
	}

}


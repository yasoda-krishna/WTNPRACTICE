package exceptionhandling;

import java.util.Scanner;

public class Userexceptiondemo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size of the array");
		int n=sc.nextInt();
		int[] a=new int[n];
		System.out.println("Enter the elements in array");
		for(int i=0;i<n;i++)
			a[i]=sc.nextInt();
		System.out.println("Enter key");
		int key=sc.nextInt();
			try {
				find(a,key);
			} catch (elementnotfound e) {
				// TODO Auto-generated catch block
				System.out.println(e);
			}
		
	}

	private static void find(int[] a, int key) throws elementnotfound {
		int flag=0;
		for(int i=0;i<a.length;i++)
		{
			if(a[i]==key)
			{
				flag=1;
				break;
			}
		}
		if(flag==0)
		{
			throw new elementnotfound("item not found");
			
		}
		else
		{
			System.out.println("the given element is found in the array");
		}
		
		
	}

}

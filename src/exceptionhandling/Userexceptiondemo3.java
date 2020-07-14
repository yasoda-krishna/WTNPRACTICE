package exceptionhandling;

import java.util.Scanner;

public class Userexceptiondemo3 {

	public static void main(String[] args) {
		int balance=1000;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the amount to withdrawl");
		int withdrawl=sc.nextInt();
		try {
			if(withdrawl>balance)
			{
				throw new InvalidWithdrawMoneyException();
			}
			else
			{
				System.out.println("Withdraw Succesful\nRemaining Balance is "+(balance-withdrawl));
			}
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}

}

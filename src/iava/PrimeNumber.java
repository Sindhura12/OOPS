package iava;

import java.util.Scanner;

public class PrimeNumber 
{
	public static void main(String[] args) 
	{
		// Take data from keyboard
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number: ");
		int n=sc.nextInt();
		sc.close();
		//Check whether the given number is prime or not
		int flag=0;
		for(int i=2;i<n-1;i++) 
		{
			if(n%i==0) 
			{
				flag=1;
				break;
			}
		}
		if(flag==0)
		{
			System.out.println(String.format("%d is a prime number",n));
		}
		else 
		{
			System.out.println(String.format("%d is not a prime number",n));
		}
	}
		
}



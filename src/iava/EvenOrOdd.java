package iava;

import java.util.Scanner;

public class EvenOrOdd 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number: ");
		int n=sc.nextInt();
		sc.close();
		//Check whether the given number is even or odd
		if(n%2==0) 
		{
			System.out.printf("%d is an even number", n);
		}
		else 
		{
			System.out.printf("%d is an odd number", n);
		}
	}
}

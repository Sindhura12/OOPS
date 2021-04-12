package iava;

import java.util.Scanner;

public class FibonacciSeries 
{
	public static void main(String[] args) 
	{
		// Take number from keyboard
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number:");
		long f=sc.nextLong();
		sc.close();
		//Fibonacci series
		int x=0;
		int y=1;
		System.out.print(x+" "+y);
		do 
		{
			int z=x+y;
			x=y;
			y=z;
			System.out.print(" "+z);
		}while((x+y)<=f);

	}

}

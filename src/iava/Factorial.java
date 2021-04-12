package iava;

import java.util.Scanner;

public class Factorial 
{
	public static void main(String[] args) 
	{
		// Take data from keyboard
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number: ");
		int n=sc.nextInt();
		sc.close();
		//Factorial of a number
		int f=1;
		for(int i=n;i>0;i--) 
		{
			f=f*i;
		}
		System.out.println("Factorial of "+n +" is " +f);

	}

}

package iava;

import java.util.Scanner;

public class MultiplicationOfNumber 
{
	public static void main(String[] args) 
	{
		// Take data from keyboard
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number: ");
		int n=sc.nextInt();
		sc.close();
		//Multiplication of a number
		for(int i=1;i<=10;i++) 
		{
			System.out.printf("%d X %d=%d %n",n,i,n*i);
		}
	}
}

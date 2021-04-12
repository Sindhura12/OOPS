package iava;

import java.util.Scanner;

public class SumOfDigits {

	public static void main(String[] args) 
	{
		// Take number from keyboard
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number: ");
		int n=sc.nextInt();
		sc.close();
		//Sum of digits in a given number
		int temp=n;
		int sum=0;	
		while(temp!=0) 
		{
			int r=temp%10;
			sum=sum+r;
			temp=temp/10;
		}
		System.out.println("sum of "+n+" is "+sum);
	}

}

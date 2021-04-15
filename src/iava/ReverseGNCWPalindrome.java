package iava;

import java.util.Scanner;

public class ReverseGNCWPalindrome 
{
	public static void main(String[] args) 
	{
		// Take number from keyboard
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number:");
		long n=sc.nextLong();
		sc.close();
		//Reverse the number & check whether given number is palindrome or not
		long temp = n;
		int rn=0;
		while(temp!=0) 
		{
			int r=(int) (temp%10);//get last digit
			rn=rn*10+r;//add to reverse at end
			temp=temp/10;//Cut last digit
		}
		System.out.println(rn);
		if(n==rn) 
		{
			System.out.println(n+ " is palindrome number");
		}
		else 
		{
			System.out.println(n+" is not palindrome number");
		}


	}

}

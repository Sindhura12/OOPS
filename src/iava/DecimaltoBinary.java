package iava;

import java.util.Scanner;

public class DecimaltoBinary 
{
	public static void main(String[] args) 
	{
		// Take number from keyboard
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number");
		int dv=sc.nextInt();
		sc.close();
		String bn=" ";
		int temp=dv;
		while(temp!=0) 
		{
			int b=temp%2;
			bn=b+bn;
			temp=temp/2;
		}
		System.out.println("Binary value of "+dv+" is "+bn);
	}

}

package iava;

import java.util.Scanner;

public class NumberOfDigits 
{
	public static void main(String[] args) 
	{
		// Take number from keyboard
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number: ");
		int n=sc.nextInt();
		sc.close();
		//Count number of digits
		int nod=0;
		int temp=n;
		while(temp>0) 
		{
			int r=temp%10;
			nod++;
			temp=(int) (temp/10);
		}
		System.out.printf("%d has %d number of digits",n,nod);
	}

}

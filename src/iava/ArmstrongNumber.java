package iava;

import java.util.Scanner;

public class ArmstrongNumber 
{
	public static void main(String[] args) 
	{
		// Take a number from keyboard
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number");
		int n=sc.nextInt();
		sc.close();
		//Check whether given number is armstrong number or not
		//Step-1:find number of digits
		int temp1=n;
		int nod=0;
		while(temp1!=0) 
		{
			int r=temp1%10;
			nod++;
			temp1=temp1/10;
			System.out.println(r);
		}
		System.out.println("Number of digits in: " +n+" is "+nod);
		//Step-2:Sum of given number
		int temp2=n;
		int value =0;
		while(temp2!=0) 
		{
			int d=temp2%10;
			value=(int) (value+Math.pow(d,nod));
			temp2=temp2/10;
			System.out.println(value);
		}
		//Check whether given number is armstrong or not
		if(n==value) 
		{
			System.out.println(n+" is an armstrong number");
		}
		else 
		{
			System.out.println(n+" is not an armstrong number");
		}
	}
}

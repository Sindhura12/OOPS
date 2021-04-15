package iava;

import java.util.Scanner;

public class BinarytoDecimal2 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a binary number: ");
		int bn=sc.nextInt();
		sc.close();
		int temp=bn;
		double decvalue=0;
		int p=0;
		while(temp!=0) 
		{
			int lastdigit=temp%10;
			decvalue=(decvalue+lastdigit*Math.pow(2,p));
			temp=temp/10;
			p++;
		}
		System.out.println("Decimal value of "+bn+" is "+decvalue);
	}
}

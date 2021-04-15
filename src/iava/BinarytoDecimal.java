package iava;

import java.util.Scanner;

public class BinarytoDecimal 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a binary number as string");
		String bn=sc.nextLine();
		sc.close();
		int d=Integer.parseInt(bn, 2);
		System.out.println("Decimal value of "+bn+" is "+d);
	}
}

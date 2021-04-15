package iava;

import java.util.Scanner;

public class Trapezium2 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter a word");
		String b=sc.next();
		sc.close();
		System.out.println("         |");

		for(int i=1;i<=10;i++) 
		{
			System.out.print("-");
			
		}
		System.out.println(" ");
		String s="\\"+b+" /";
		System.out.print(s);
		System.out.println(" ");
		System.out.print(" -------");
		
		
		
		
	}

}

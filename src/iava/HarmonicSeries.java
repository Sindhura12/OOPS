package iava;

import java.util.Scanner;

public class HarmonicSeries
{
	public static void main(String[] args) 
	{
		// Take data from keyboard
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number: ");
		int n=sc.nextInt();
		sc.close();
		//Sum of Harmonic series
		double sum=0.0;
		for(int i=1;i<=n;i++) 
		{
			sum=sum+(double)1/i;
		}
		System.out.println(sum);
	}

}

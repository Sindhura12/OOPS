package iava;

public class Arrow 
{
	public static void main(String[] args) 
	{
		//Upper part
		for(int i=1;i<=5;i++) 
		{
			for(int j=1;j<=i;j++) 
			{
				System.out.print("");
			}
			System.out.println();
		}
		//Lower part
		for(int i=4;i>=1;i--) 
		{
			for(int j=1;j<=i;j++) 
			{
				System.out.print("*");
			}
			System.out.println();
		}


	}

}

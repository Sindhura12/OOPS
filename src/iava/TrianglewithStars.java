package iava;

public class TrianglewithStars 
{
	public static void main(String[] args) 
	{
		for(int i=1;i<=4;i++) 
		{
			//for spaces
			for(int k=3;k>=i;k--) 
			{
				System.out.print(" ");
			}
			//for stars
			for(int j=1;j<=(i*2)-1;j++) 
			{
				System.out.print(i);
			}
			System.out.println();
		}	
	}
}

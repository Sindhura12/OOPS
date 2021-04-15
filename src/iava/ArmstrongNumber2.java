package iava;
//Display armstrong number from 1 to 100
public class ArmstrongNumber2 
{
	public static void main(String[] args) 
	{
		//Check whether given number is armstrong number or not
		//Step-1:find number of digits
		for(int i=1;i<=500;i++)
		{
			int temp1=i;
			int nod=0;
		while(temp1!=0) 
		{
			int r=temp1%10;
			nod++;
			temp1=temp1/10;
		}
		//Step-2:Sum of given number
		int temp2=i;
		int value =0;
		while(temp2!=0) 
		{
			int d=temp2%10;
			value=(int) (value+Math.pow(d,nod));
			temp2=temp2/10;
		}
		//Check whether given number is armstrong or not
		if(value==i) 
		{
			System.out.println(i+" is an armstrong number");
		}
	  }
	}
}

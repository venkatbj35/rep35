package javaSamples;

public class UsingWhile
{
	public static void main(String[] args) 
	{
		int i=1,s=0;
		
		while(i<=10)
		{
			s=s+i;
			i=i+1;
		}
		
		System.out.println("The sum of first 10 numbers is : " + s);
	}

}

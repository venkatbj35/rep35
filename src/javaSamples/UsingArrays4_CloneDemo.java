package javaSamples;

public class UsingArrays4_CloneDemo 
{
	public static void main(String[] args) 
	{
		int[] a= {10,20,30};
		int[] b;
		b=a.clone();
		
		for(int i : b)
		{
			System.out.println(i);
		}
	}

}

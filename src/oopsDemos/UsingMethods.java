package oopsDemos;

class clsMethods
{
	public void Swap(int i, int j)
	{
		System.out.println("Before Swaping, FirstNumber : " + i + ", SecondNumber : " + j);
		
		int temp;
		temp=i;
		i=j;
		j=temp;
		
		System.out.println("After Swaping, FirstNumber : " + i + ", SecondNumber : " + j);	
	}
	
	public int Add(int i, int j)
	{
		return(i+j);
	}
}
public class UsingMethods 
{
	public static void main(String[] args)
	{
		clsMethods obj=new clsMethods();
		obj.Swap(40, 30);
		
		int result=obj.Add(10, 20);
		System.out.println("The sum of 10 and 20 is : " + result);
		System.out.println("The square of " + result + " is : " + result*result);
		
		
	}
}












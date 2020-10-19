package oopsDemos;

public class UsingMultipleInheritance 
{
	public static void main(String[] args) 
	{
		ClsFunctions obj=new ClsFunctions();
		System.out.println("The sum of 100 and 200 is : " + obj.Add(100, 200));
		System.out.println("The reverse of 'JAVA' is : " + obj.strReverse("JAVA"));
		System.out.println("The division of 10 with 5 is : " + obj.Divide(10, 5));
	}
}

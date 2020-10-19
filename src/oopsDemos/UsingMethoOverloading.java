package oopsDemos;

import java.util.Scanner;

class clsOverload
{
	public int Add(int i, int j)
	{
		return(i+j);
	}
	public int Add(int i, int j, int k)
	{
		return(i+j+k);
	}
	public String Add(String s1,String s2)
	{
		return(s1.concat(s2));
	}
	
}

public class UsingMethoOverloading 
{

	public static void main(String[] args) 
	{
		clsOverload obj=new clsOverload();
		
//		System.out.println("The addition of 10,20 and 30 is : " + obj.Add(10, 20,30));
//		System.out.println("The concatenation of 'Java' and 'Programs' is : " + obj.Add("Java", "Programs"));
//		System.out.println("The sum of 100 and 200 is : " + obj.Add(100, 200));
		
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter i value : " );
		int i=sc.nextInt();
		System.out.print("Enter j value : ");
		int j=sc.nextInt();
		System.out.print("Enter k value : ");
		int k=sc.nextInt();
		
		System.out.println("The sum of " + i +  " and " + j + " is : " + obj.Add(i, j));
		System.out.println("The addition of " + i + "," + j + " and " + k + " is : " + obj.Add(i, j,k));
	}

}

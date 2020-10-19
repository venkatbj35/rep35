package javaSamples;

import java.util.Scanner;

public class UsingArrays3 
{
	public static void main(String[] args) 
	{
		//1. declaring an array with size 5
		int[] a=new int[5];
		
		//2. taking element value at runtime
		Scanner sc=new Scanner(System.in);
		for(int i=0;i<a.length;i++)
		{
			System.out.print("Enter element" + (i+1) + " value : ");
			a[i]=sc.nextInt();
		}
		
		//3. printing the array
		System.out.print("a = ");
		for(int i : a)
		{
			System.out.print(i + " ");
		}
		
		//4. Finding the maximum number of the array
		int max=a[0];
		for(int i=1;i<a.length;i++)
		{
			if(a[i]>max)
			{
				max=a[i];
			}
		}
		System.out.println("\n The maximum number of the array is : " + max);
	}

}

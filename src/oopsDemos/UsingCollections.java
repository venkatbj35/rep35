package oopsDemos;

import java.util.ArrayList;

public class UsingCollections 
{
	public static void main(String[] args) 
	{
		ArrayList aList=new ArrayList();
		
		aList.add(10);
		aList.add("Java");
		aList.add(false);
		
		System.out.println("No of elements in the collection : " + aList.size());
		
		System.out.println("2nd element in the collection : " + aList.get(1));
		
		System.out.println("All the items of the Collection : ");
		
		for(Object item : aList)
		{
			System.out.println(item);
		}
		
//		for(int i=0;i<aList.size();i++)
//		{
//			System.out.println(aList.get(i));
//		}
		
		//inserting element @index 1
		aList.add(1,40.2);
		System.out.println("After inserting Item @index 1 : ");
		for(Object item : aList)
		{
			System.out.println(item);
		}
		
		//removing element @index 2 
		aList.remove(2);
		System.out.println("After removing item @index 2 : ");
		for(Object item : aList)
		{
			System.out.println(item);
		}
	}

}

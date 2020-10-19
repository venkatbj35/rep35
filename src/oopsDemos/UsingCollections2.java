package oopsDemos;

import java.util.ArrayList;

public class UsingCollections2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList<String> aList=new ArrayList<String>();
		aList.add("java");
		aList.add("Dotnet");
		aList.add("SQL");
		
		for(String str:aList)
		{
			System.out.println(str);
		}
	}

}

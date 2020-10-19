package javaSamples;

public class UsingArrays1
{
	public static void main(String[] args) 
	{
		int[] a= {10,20,30,40,50};
		
		//to read 3rd element value
		System.out.println("3rd Element : " + a[2]);
		
		//to modify 2nd element value to 200
		a[1]=200;
		System.out.println("After modification, 2nd element : " + a[1]);
		
		//a[10]=100;	//error
	}

}

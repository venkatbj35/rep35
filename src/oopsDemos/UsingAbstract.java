package oopsDemos;

abstract class A1
{
	public abstract void M1();
	
	public void M2()
	{
		System.out.println("M2 method from A1 class...");
	}
}

class A2 extends A1
{
	@Override
	public final void M1()
	{
		System.out.println("Overrided M1 method from A2 class...");
	}
}
public class UsingAbstract 
{
	public static void main(String[] args)
	{
		A2 obj=new A2();
		obj.M1();
		obj.M2();
	}

}

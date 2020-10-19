package oopsDemos;

class Company
{
	public String compName;
	public String compAdd;
	
	public Company()
	{
		compName="Mind Q Systems";
		compAdd="Hyderabad, India";
	}
	
	public void Display()
	{
		System.out.println("Company Name : " + compName);
		System.out.println("Address : " + compAdd);
	}
}

class Emp extends Company
{
	public int empId;
	public String empName;
	public String Desig;
	
	@Override
	public void Display()
	{
		System.out.println("Id : " + empId);
		System.out.println("Name : " + empName);
		System.out.println("Designation : " + Desig);
		super.Display();
	}
}

public class UsingSingleInheritance2 
{
	public static void main(String[] args) 
	{
		Emp obj=new Emp();
		obj.empId=100;
		obj.empName="Venkat";
		obj.Desig="Tester";
		obj.Display();	
	}
}

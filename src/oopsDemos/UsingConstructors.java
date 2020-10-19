package oopsDemos;

class Employee
{
	public int empId;
	public String empName;
	
	public Employee()
	{
		empId=111;
		empName="E";
	}
	
	public Employee(int id,String name)
	{
		empId=id;
		empName=name;
	}
	
	public void Display()
	{
		System.out.println("ID : " + empId);
		System.out.println("Name : " + empName);
		System.out.println("********************");
	}
}
public class UsingConstructors
{
	public static void main(String[] args) 
	{
		Employee e1=new Employee();		
		e1.Display();
		
		Employee e2=new Employee();
		e2.empId=100;
		e2.empName="Venkat";
		e2.Display();
		
		Employee e3=new Employee(101,"Smith");
		e3.Display();
	}

}

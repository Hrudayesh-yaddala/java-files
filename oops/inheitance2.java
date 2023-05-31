package oops;

class Person
{
	String name;
	Person(String n)
	{
		name=n;
	}
	void result()
	{
		System.out.println("Name is :"+" "+name);
	}
}
class Employee extends Person
{
	double salary;
	int year;
	String insurance;
	String name;
	Employee(String n,double s,int y,String i)
	{
		super(n);
		name=n;
		salary=s;
		year=y;
		insurance=i;
	}
	void output()
	{
		System.out.println("employee class and its name:"+" "+name);
	}
	
	
}
public class inheitance2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Person p=new Person("Anurag");
		p.result();
		Employee e=new Employee("Hrudayesh",89777,2023,"LIC");
		e.output();
		e.result();

	}

}

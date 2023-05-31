package oops;
class calculator
{
	double num1;
	double num2;
	double res;
	calculator(int n1,int n2)
	{
		num1=n1;
		num2=n2;
	}
	calculator(double n1,int n2)
	{
		num1=n1;
		num2=n2;
	}
	void powerInt()
	{
//		double num1,num2;
		res=Math.pow(num1,num2);
		System.out.println("power is:"+" "+res);
	}
	void PowerDouble()
	{
		res=Math.pow(num1, num2);
		System.out.println("power is :"+" "+res);
	}
}
public class power {
	public static void main(String[] args) {
		calculator c=new calculator(2,4);
		c.powerInt();
		calculator b=new calculator(4.0,2);
		b.PowerDouble();

	}

}

package oops;
class Animal
{
	void eat()
	{
		System.out.println("Eat method is initiated");
	}
	void sleep()
	{
		System.out.println("sleep method is initiated");
	}
}
class Bird extends Animal
{
	void fly()
	{
		System.out.println("fly method is initiated");
	}
}
public class inheritance1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Animal a=new Animal();
		Bird b=new Bird();
		a.eat();
		a.sleep();
		b.fly();
		b.eat();

	}

}

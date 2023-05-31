package oops;
class shape
{
	void draw()
	{
		System.out.println("shape drawing method");
	}
	void erase()
	{
		System.out.println("shape erase method");
	}
}
class circle extends shape
{
	void draw()
	{
		System.out.println("drawing circle");
	}
	void erase()
	{
		System.out.println("erasing circle");
	}
	
}
class triangle extends shape
{
	void draw()
	{
		System.out.println("drawing triangle");
	}
	void erase()
	{
		System.out.println("erasing triangle");
	}
}
class rectangle extends shape
{
	void draw()
	{
		System.out.println("drawing rectangle");
	}
	void erase()
	{
		System.out.println("erasing rectangle");
	}
}
public class overriding2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		shape sp=new shape();
		sp.draw();
		rectangle rt=new rectangle();
		rt.draw();
		rt.erase();
		

	}

}

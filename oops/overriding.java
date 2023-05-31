package oops;
class fruit
{
	String name;
	String taste;
	int size;
	fruit(String name,String taste,int size)
	{
		this.name=name;
		this.taste=taste;
		this.size=size;
	}
	void result()
	{
		System.out.println("name:"+" "+name+" "+"and its taste :"+" "+taste);
	}
}
class Apple extends fruit
{
	Apple(String name, String taste, int size) {
		super(name, taste, size);
	}

	void result()
	{
		System.out.println("Apple class is invoked");
	}
}
class Orange extends fruit
{
	Orange(String name, String taste, int size) {
		super(name, taste, size);
	}

	void result()
	{
		System.out.println("orange class is invoked");
	}
}
public class overriding {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		fruit fd=new fruit("base fruit","Nice",200);
		fd.result();
		Apple ap=new Apple("Apple","super",300);
		ap.result();
		Orange or=new Orange("Orange","Excellent",400);
		or.result();
		fd.result();
		

	}

}

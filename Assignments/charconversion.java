package Assignments;
import java.util.*;
public class charconversion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sco=new Scanner(System.in);
		char ch=sco.next().charAt(0);
		if(Character.isUpperCase(ch))
		{
			System.out.println(Character.toLowerCase(ch));
		}
		else if(Character.isLowerCase(ch))
		{
			System.out.println(Character.toUpperCase(ch));
		}
		else
		{
			System.out.println("invalid input");
		}
		

	}

}

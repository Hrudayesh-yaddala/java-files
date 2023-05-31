package Assignments;
import java.util.*;
public class stringcomma {
	public static String result(String s)
	{
		char ch=',';
		if(s.length()!=0)
		{
			s=s.replace(' ',ch);
			return s;
		}
		return "No Values";
	}
	public static void main(String args[]) {
		// TODO Auto-generated method string
		Scanner sco=new Scanner(System.in);
		String st=sco.nextLine();
		System.out.println(result(st));

	}

}

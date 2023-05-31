package Assignments;
import java.util.*;
public class lastdigit {
	public static boolean lastdigit(String a,String b)
	{
		int p=a.length();
		int q=b.length();
		if(a.charAt(p-1)==b.charAt(q-1))
		{
			return true;
		}
		return false;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sco=new Scanner(System.in);
		String s1=sco.nextLine();
		String s2=sco.nextLine();
		System.out.println(lastdigit(s1,s2));
		
	
		

	}

}

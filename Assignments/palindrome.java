package Assignments;
import java.util.*;
public class palindrome {
	public static String result(int num)
	{
		int rem,res=0,comp=num;
		while(num>0)
		{
			rem=num%10;
			res=(res*10)+rem;
			num=num/10;
		}
		if(res==comp) {
			return "Given number is a palindrome";
		}
		return "Not a palindrome";
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sco=new Scanner(System.in);
		int n=sco.nextInt();
		System.out.println(result(n));

	}

}

package Assignments;
import java.util.*;
public class reversenumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sco=new Scanner(System.in);
		int num=sco.nextInt();
		int rem,res=0;
		while(num>0)
		{
			rem=num%10;
			res=(res*10)+rem;
			num=num/10;
		}
		System.out.println("Reversed number is :"+" "+res);
		

	}

}

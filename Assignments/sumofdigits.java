package Assignments;
import java.util.*;
public class sumofdigits {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sco=new Scanner(System.in);
		int n=sco.nextInt();
		int rem,c=0;
		while(n>0) {
			rem=n%10;
			c+=rem;
			n=n/10;
		}
		System.out.println(c);
		
		

	}

}

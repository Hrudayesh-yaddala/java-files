package Assignments;
import java.util.*;
public class prime1 {

	public static String result(int n)
	{
		int c=0;
		for(int i=2;i<=n/2;i++)
		{
			if(n%i==0) {
				c++;
			}
		}
		if(c==0) {
			return "Given number is prime";
		}
		return "Not a prime";
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sco=new Scanner(System.in);
		int inp=sco.nextInt();
		System.out.println(result(inp));

	}

}

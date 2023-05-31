package Assignments;
import java.util.*;
public class starpattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sco=new Scanner(System.in);
		int n=sco.nextInt();
		int k=0;
		System.out.println("Using for loop");
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<=i;j++)
			{
				System.out.print("*"+" ");
			}
			System.out.println();
		}
		System.out.println("Using while loop");
		while(k<n)
		{
			int j=0;
			while(j<=k)
			{
				System.out.print("*"+" ");
				j++;
			}
			System.out.println();
			k++;
		}

	}

}

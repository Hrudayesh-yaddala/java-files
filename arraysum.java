package Arrays;
import java.util.*;
import java.util.Arrays;
public class arraysum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sco=new Scanner(System.in);
		int sum=0,avg;
		int n=sco.nextInt();
		int arr[]=new int[n];
		for(int i=0;i<n;i++)
		{
			arr[i]=sco.nextInt();
			sum+=arr[i];
		}
		avg=sum/n;
		System.out.println("Sum :"+" "+sum);
		System.out.println("Average :"+" "+avg);
		

	}

}

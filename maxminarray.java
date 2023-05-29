package Arrays;
import java.util.*;
import java.util.Arrays;
public class maxminarray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sco=new Scanner(System.in);
		int n=sco.nextInt();
		int arr[]=new int[n];
		for(int i=0;i<n;i++)
		{
			arr[i]=sco.nextInt();
		}
		Arrays.sort(arr,0,n);
		System.out.println("Max element is :"+" "+arr[n-1]);
		System.out.println("Min element is :"+" "+arr[0]);
		

	}

}

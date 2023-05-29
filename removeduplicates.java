package Arrays;
import java.util.*;
import java.util.Arrays;
public class removeduplicates {

	public static int result(int arr[],int n)
	{
		int j=0;
		for(int i=0;i<n-1;i++)
		{
			if(arr[i]!=arr[i+1])
			{
				arr[j++]=arr[i];
			}
		}
		arr[j++]=arr[n-1];
		return j;
	}
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
		result(arr,n);

	}

}

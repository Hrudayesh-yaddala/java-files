package Arrays;
import java.util.*;
import java.util.Arrays;
public class Twolarger {

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
		System.out.println("first largest element :"+" "+arr[n-1]);
		System.out.println("second largest element :"+" "+arr[n-2]);
		System.out.println("first smallest element :"+" "+arr[0]);
		System.out.println("second smallest element :"+" "+arr[1]);

	}

}

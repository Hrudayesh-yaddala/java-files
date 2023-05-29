package Arrays;
import java.util.*;
import java.util.Arrays;
public class binarysearch {
	public static int binarsearch(int a[],int low,int high,int k)
	{
		int l=low,h=high,key=k;
		while(l<=h)
		{
			int mid=(l+h)/2;
			if(key==a[mid]) {
				return mid;
			}
			else if(key<a[mid]) {
				h=mid-1;
			}
			else if(key>a[mid]){
				l=mid+1;
			}
		}
		return -1;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sco=new Scanner(System.in);
		int n=sco.nextInt();
		int k=sco.nextInt();
		int arr[]=new int[n];
		for(int i=0;i<n;i++)
		{
			arr[i]=sco.nextInt();
		}
		Arrays.sort(arr,0,n);
		System.out.println(binarsearch(arr,0,n-1,k));
		

	}

}

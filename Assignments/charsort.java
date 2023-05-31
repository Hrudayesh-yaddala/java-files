package Assignments;
import java.util.Arrays;
import java.util.*;
public class charsort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sco=new Scanner(System.in);
		char arr[]=new char[5];
		arr[0]=sco.next().charAt(0);
		arr[1]=sco.next().charAt(0);
		Arrays.sort(arr,0,2);
		System.out.println(arr[0]);
		System.out.println(arr[1]);
	}

}

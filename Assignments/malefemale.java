package Assignments;
import java.util.*;
public class malefemale {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sco=new Scanner(System.in);
		String gender =sco.nextLine();
		int age=sco.nextInt();
		if(gender.equals("Female") && 1<=age && age<=58)
		{
			System.out.println("Interse is : 8.2%");
		}
		else if(gender.equals("Female") && 59<=age && age<=100)
		{
			System.out.println("Interse is : 9.2%");
		}
		else if(gender.equals("Male") && 1<=age && age<=58)
		{
			System.out.println("Interse is : 8.4%");
		}
		else
		{
			System.out.println("Interse is : 10.5%");
		}
	}

}

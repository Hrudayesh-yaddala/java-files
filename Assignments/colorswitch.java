package Assignments;
import java.util.*;
public class colorswitch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sco=new Scanner(System.in);
		char ch=sco.next().charAt(0);
		switch(ch)
		{
		case 'O':
			System.out.println("orange");
			break;
		case 'R':
			System.out.println("Red");
			break;
		case 'B':
			System.out.println("Blue");
			break;
		case 'G':
			System.out.println("Green");
			break;
		case 'Y':
			System.out.println("Yellow");
			break;
		case 'W':
			System.out.println("White");
			break;
		default:
			System.out.println("Invalid Code");
			break;
		
			
		}

	}

}

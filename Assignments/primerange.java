package Assignments;

public class primerange {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(int num=10;num<100;num++)
		{
			int c=0;
			for(int i=2;i<=num/2;i++)
			{
				if(num%i==0) {
					c++;
				}
			}
			if(c==0) {
				System.out.println(num);
			}
		}
		

	}

}

package loops;

public class fibonacci {

	public static void main(String[] args) {
		java.util.Scanner sc=new java.util.Scanner(System.in);
		System.out.println("Enter the number");
		int a=sc.nextInt();
		int s=0,s1=1,n;
		for(int i=1;i<=a;i++)
		{
			
		n=s+s1;
		System.out.println(n);
		s=s1;
		s1=n;
		}
	}

}

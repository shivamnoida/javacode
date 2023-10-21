
public class greater3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 java.util.Scanner sc=new java.util.Scanner(System.in);
	     System.out.println("Enter 1 number");
	     int a=sc.nextInt();
	     System.out.println("Enter 2 number");
	     int b=sc.nextInt();
	     System.out.println("Enter 3 number");
	     int c=sc.nextInt();
	     if(a>=b && a>=c)
	     {
	    	  System.out.println(a+"is the greater number");
	    	  
	     }
	     else if(b>=a && b>=c)
	     {
	    	System.out.println(b+"is the greater number"); 
	     }
	     else
	     System.out.println(c+"is the greater number");
}
}
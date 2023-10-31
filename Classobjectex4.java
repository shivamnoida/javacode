class Employeeee{
	private String name;
	private int salary;
	private String cname;
	public void show(){
		System.out.println(name+" "+salary+" "+cname);
	}
	void input() {
		java.util.Scanner sc=new java.util.Scanner(System.in);
		System.out.println("Enter Employee's Details:");
		System.out.println("Name: ");
		name=sc.next();
		System.out.println("Salary: ");
		salary=sc.nextInt();
		System.out.println("Company Name: ");
		cname=sc.next();
	}
}
public class Classobjectex4 {
	public static void main(String[] args) {
		Employeeee a=new Employeeee();
		Employeeee b=new Employeeee();
		Employeeee c=new Employeeee();
		Employeeee d=new Employeeee();
		
		a.input();
		b.input();
		c.input();
		d.input();

		a.show();
		b.show();
		c.show();
		d.show();
		
	}
}

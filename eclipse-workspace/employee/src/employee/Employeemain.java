package employee;
import java.util.Scanner;
public class Employeemain {
	public static void main( String [] args) {
		Scanner sc=new Scanner(System.in);{
		Employee a=new Employee();
	System.out.println("enter employee id");	
	a.setEid(sc.nextInt());
	System.out.println("enter employee name");
	a.setEname(sc.next());
	System.out.println("enter employee salary");
	a.setEsal(sc.nextDouble());
	System.out.println("employee id :"+a.getEid());
	System.out.println("employee name :"+a.getEname());
	System.out.println("employee salary :"+a.getEsal());
		}
    }
}

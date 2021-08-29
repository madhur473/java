import java.util.Scanner;

public class EmployeeInfo {
	public Employee createEmployee(){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Employee Id,ename,salary");
		int eid=sc.nextInt();
		String ename=sc.next();
		double esal=sc.nextDouble();
		Employee eobj=new Employee(eid,ename,esal);
		return eobj;
	}
	public void displayEmployee(Employee eobj)
	{
		System.out.println("Employee Id :"+eobj.getEmpId());
		System.out.println("Employee Name : "+eobj.getEmpName());
		System.out.println("Employee Salary :"+eobj.getEmpSal());
	}
}

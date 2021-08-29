import java.util.Scanner;

public class EmployeeMain {
	public static void main(String[] args) {
		
		EmployeeInfo einfo=new EmployeeInfo();
		
		Employee eobj=einfo.createEmployee();
		einfo.displayEmployee(eobj);
		
		
	}
}

package bankapp;
import java.util.*;
public class account {
	int ano;
	String cname ;
	double abal;
	 public void accept() {
	 Scanner sc=new Scanner(System.in);
	 System.out.println("enter account no.");
	 ano=sc.nextInt();
	 System.out.println("Enter customer name");
	 cname=sc.next();
	 System.out.println("Enter account balance");
	 abal=sc.nextDouble();
	 
}
	 public void display() {
		 System.out.println("Account no."+ano);
		 System.out.println("Customer name"+cname);
		 System.out.println("Account balance"+abal);
		 
	 }
}

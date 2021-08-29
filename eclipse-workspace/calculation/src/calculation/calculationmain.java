package calculation;
import java.util.Scanner;

public class calculationmain {
	
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("enter any 2 number");
	
		 int n1=sc.nextInt();
	     int n2=sc.nextInt();
	
        	int add=n1+n2;
	     
        	System.out.println("first number"+n1);
        	System.out.println("sceond number"+n2);
            System.out.println("addition is:"+add);
	

      }
  }
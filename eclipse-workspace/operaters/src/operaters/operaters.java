package operaters;
import java.util.Scanner;
public class operaters {
	public static void main(String args[]) {
		int option=0,option1=0,n1,n2,aoutput;
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter 1 for mathematical operation\nEnter 2 for logical operation \nEnter 3 for relational operation");
		option=sc.nextInt();
		switch(option)
		{
		case 1:
		{
			System.out.println("Enter 1 for additon\n Enter 2 for substraction \n Enter 3 for multiplication\n Enter 4 for division\nEnter 5 for modulos");
		    option1=sc.nextInt();
		    System.out.println("enter 2 numbers");
		    n1=sc.nextInt();
		    n2=sc.nextInt();
		    switch(option1)
		    {
		    case 1:
		    	aoutput=n1+n2;
		    	System.out.println("addition is"+aoutput);
		    	break;
		    case 2:
		    	aoutput=n1-n2;
		    	System.out.println("substraction is"+aoutput);
		    	break;
		    case 3:
		    	aoutput=n1*n2;
		    	System.out.println("multiplication is"+aoutput);
		    	break;
		    case 4:
		    	aoutput=n1/n2;
		    	System.out.println("division is"+aoutput);
		    	break;
		    case 5:
		    	aoutput=n1%n2;
		    	System.out.println("modulos is"+aoutput);
		    	break;
		    }
		}
		break;
		case 2:
		{
			boolean n3=true;
			boolean n4=false;
			System.out.println("we have n3=true and n4=false \n Enter 1 to use && \n or 2 for || \n 3 for !");
			option1=sc.nextInt();
			switch(option1)
			{
			case 1 :
			
				if(n3&&n4)
					System.out.println("n3 and n4 both are true");
				else
					System.out.println("either n3 or n4 is false or both or false");
				break;
			
			case 2 :
			
				if(n3||n4)
					System.out.println("either n3 or n4 is true");
				else
					System.out.println("both n3 and n4 are false");
				break;
			
			case 3 :
			
				if(!n3)
					System.out.println("n3 is false so !n3 is true so condition is true and now we are in if statement");
				else
					System.out.println("n3 is true so !n3 is false so condition is false and now we are in else statement");
				if(!n4)
					System.out.println("n4 is false so !n4 is true so condition is true and now we are in if statement");
				else
					System.out.println("n4 is true so !n4 is false so condion is false and now we are in else statement");
				break;
			}
			break;
			}
			
			case 3 :
			{
				System.out.println("Enter 2 numbers");
				n1=sc.nextInt();
				n2=sc.nextInt();
				System.out.print("Enter 1 to use > operator\nEnter 2 to use >= operator\nEnter 3 to use < operator\nEnter 4 to use <= operator\nEnter 5 to use == operator\nEnter 6 to use != operator ");
				option1=sc.nextInt();
				switch(option1)
				{ 
				case 1 :
				
				if(n1>n2)
				System.out.println("n1 is greater than n2");
				else
				System.out.println("n1 is not greater than n2");
				break;
				
				case 2 :
				
				if(n1>=n2)
				System.out.println("n1 is greater or equal to n2");
				else
				System.out.println("n1 is not greater or equal to n2"); 
				break;
				
				case 3 :
				
				if(n1<n2)
				System.out.println("n1 is less than n2");
				else
				System.out.println("n1 is not less than n2");
				break;
				
				case 4 :
				
				if(n1<=n2)
				System.out.println("n1 is less or equal to n2");
				else
				System.out.println("n1 is not less or equal to n2");
				break;
				
				case 5 :
				
				if(n1==n2)
				System.out.println("n1 is equal to n2");
				else
				System.out.println("n1 is not equal to n2");
				break;
				
				case 6 :
				
				if(n1!=n2)
				System.out.println("n1 is not equal to n2");
				else
				System.out.println("n1 is equal to n2");
				break;
				}
				break;
			}
		}
			
		}
	}


		
		
	

		
		
	


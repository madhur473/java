package hotel;
import java.util.Scanner;
public class hotelbill {
	
	public static void main(String[] args) {
		
	String product[]={"mobile","pd","books","laptop"};
	int productprice[]={5000,500,200,20000};
			int choice=0;
			int cnt=0;
			Scanner sc=new Scanner(System.in);
			int order[]=new int[10];

			System.out.println("-----------------------------------");
			int k=0;
			do
			{
				System.out.println("PRODID\tPRODNAME\tPRODUCTPRICE");
				System.out.println("-----------------------------------");
				for(int i=0;i<product.length;i++)
				{
					System.out.println((i+1)+"\t"+product[i]+"\t\t"+productprice[i]);
				}
				System.out.println("Enter product id to add in cart");
				choice=sc.nextInt();//1 3 4
				order[k]=choice-1;//4-1=0  3	
				k++;//
				System.out.println("to continue shopping press 1");
				choice=sc.nextInt();//2
			}while(choice==1);
			cnt=k;//4
			System.out.println("Go to Billing...");
			System.out.println("Order Details.....");
			//calculate bill..
			System.out.println("PRODUCT NAME\t\tPRICE");
			for(int i=0;i<cnt;i++)
			{
				System.out.println(product[order[i]]+"\t"+productprice[order[i]]);
			}//calculate bill calculate gst and final bill
		}
	}



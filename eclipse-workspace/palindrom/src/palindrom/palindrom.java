package palindrom;
import java.util.Scanner;
public class palindrom { 
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int r,num,sum=0;
		int temp;
		System.out.println("enter the number:");
		num=sc.nextInt();
		temp=num;
		while(num>0)
		{
			r=num%10;
			num=num/10;
			sum=(sum*10)+r;
		}
		if(temp==sum)
		{
			System.out.println("number is palindrome");
		}
		else
		{
			System.out.println("number is non palindrome");
		}
	}
}


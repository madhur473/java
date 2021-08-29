package fibbonacci;
import java.util.Scanner;

public class fibonacci {
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
				int num,a=1,b=1,k=0;
		System.out.println("enter the number:");
		num=sc.nextInt();
		System.out.println(+a);
		System.out.println(+b);
		while(k<=num)
		{
			k=a+b;
			System.out.println(k+"");
			a=b;
			b=k;
			k=a;
			
		}
	}

}

package logic;

import java.util.Scanner;

public class logicmain {
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		logic l=new logic();
		int ch;
		do
		{
			System.out.println("\n1-Factor\n2-Factorial\\n3-fibbonaci\n4-power\n5-prime\n6-amstrong");
			System.out.println("\n Enter your choice:");
			ch=sc.nextInt();
			switch(ch)
			{
			case 1:
				System.out.println("enter any number for factor:");
			    l.factor(sc.nextInt());
			    break;
			case 2:
				System.out.println("enter any number for factorial:");
				l.factorial(sc.nextInt());
				break;
			case 3:
				System.out.println("enter any number for fibbonaci:");
				l.fibbonaci(sc.nextInt());
				break;
			case 4:
				System.out.println("enter base and power:");
				l.power(sc.nextInt(),sc.nextInt());
				break;
			case 5:
				System.out.println("enter any number to check whether it is prime or not prime");
				l.prime(sc.nextInt());
				break;
			case 6:
				System.out.println("enter any number to check whether it is amstrong or not amstrong");
				l.amstrong(sc.nextInt());
				break;
			}
			System.out.println("Do you want to continue.....press 1...");
			ch=sc.nextInt();
		}while(ch==1);
		System.out.println("-------------THANK YOU-----------");
		}
	}

		

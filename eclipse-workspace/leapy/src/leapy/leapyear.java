package leapy;

import java.util.Scanner;

public class leapyear {
	public static void main(String args[]) {
		int year;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the year");
		year=sc.nextInt();
		if(year%4==0)
		{
			System.out.println("year is leap ");
		}
		else
		{
			System.out.println("year is not leap");
		}
	}

}

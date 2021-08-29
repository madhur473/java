package area;
import java.util.Scanner;
public class areamain {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		area a=new area();
		int ch;
		do
		{
			System.out.println("1-area of circle\n2-area of rectangle\n3-area of triangle\n4-area of square");
			System.out.println("enter your choice");
			ch=sc.nextInt();
			switch(ch)
			{
			case 1:
			{
				System.out.println("enter radius of circle");
				double r=sc.nextDouble();
				System.out.println("area of circle is.."+a.circlearea(r));
			}
			break;
			case 2:
			{
				System.out.println("enter length and breadth of rectangle..");
				double l=sc.nextDouble();
				double b=sc.nextDouble();
				System.out.println("area of rectangle is"+a.rectanglearea(l,b));
			}
			break;
			case 3:
			{
				System.out.println("enter base and height of triangle");
				double b=sc.nextDouble();
				double h=sc.nextDouble();
				System.out.println("area of triangle is"+a.trianglearea(b,h));
			}
			break;
			case 4:
			{
				System.out.println("enter side of square");
				double s=sc.nextDouble();
				System.out.println("area of sqaure is"+a.squarearea(s));
			}
			break;
			}
			System.out.println("do you want to continue... press 1..");
			ch=sc.nextInt();
		}while(ch==1);
		System.out.println("THANK YOU");
	}
	
}

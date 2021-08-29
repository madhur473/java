import java.util.Scanner;

public class ArrayOpeartionMain {
	public static void main(String[] args) {

		Scanner sc=new Scanner(System.in);
		int arr[]=null;
		ArrayOperation a=new ArrayOperation();
		do
		{
			System.out.println("1-Create\n2-Display\n3-Search\n4-InsertNewValue\n5-DeleteValue\n6-Sorting");
			System.out.println("Enter your choice ");
			int ch=sc.nextInt();
			switch(ch)
			{
			case 1:
				arr=a.create();
				break;
			case 2:
				a.display(arr);
				break;
			case 3:
				System.out.println("Enter element to search in array");
				int s=sc.nextInt();
				int c=a.searchData(arr,s);
				if(c<arr.length)
				{
					System.out.println(s+" element found at "+(c+1)+" location");
				}
				else
				{
					System.out.println("Element not found..");
				}
				break;
			case 4:
				break;
			default:System.out.println("Invalid..");
			}
			System.out.println("DO you want to continue press1");
		}while(sc.nextInt()==1);
		System.out.println("----------THANKYOU-----------");
	}
}

package applocationarray1;

import java.util.Scanner;

public class Array4 {
	
	public static void main(String[] args) {
			
		Scanner sc = new Scanner(System.in);
		System.out.println("how many elements do you what in array: ");
		int n =sc.nextInt();
		int arr [] =new int[n];
		System.out.println("enter element in array:");
		for(int i=0;i<arr.length;i++)
		{
			arr[i]=sc.nextInt();
		}
		System.out.println("Element in array are\n");
		for(int i=0;i<arr.length;i++)
		{
			System.out.print(arr[i]);
		}
		System.out.println("Element in reverse order");
		for(int i=arr.length-1;i>=0;i--)
		{
			System.out.println(arr[i]);
		}

}
}


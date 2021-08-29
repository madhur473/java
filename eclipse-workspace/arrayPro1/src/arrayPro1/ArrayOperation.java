package arrayPro1;

import java.util.Scanner;

public class ArrayOperation {
	
		public int[] Create() {
		Scanner sc = new Scanner(System.in);
		System.out.println("how many elements do you what in array: ");
		int n =sc.nextInt();
		int arr [] =new int[n];
		System.out.println("enter element in array:");
		for(int i=0;i<arr.length;i++)
		{
			arr[i]=sc.nextInt();
		}
		return arr;
		}
		public void Display(int arr[]) {
		System.out.println("Element in array are\n");
		for(int i=0;i<arr.length;i++)
		{
			System.out.print("  "+arr[i]);
		}
	}
}

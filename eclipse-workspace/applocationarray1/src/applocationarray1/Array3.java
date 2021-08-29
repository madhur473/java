package applocationarray1;
//reverse array
import java.util.Scanner;

public class Array3 { 

	public static void main(String[] args) {
		int arr [] =new int[5];
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter elements in array:");
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
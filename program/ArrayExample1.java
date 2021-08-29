import java.util.*;
public class ArrayExample1 {
	public static void main(String[] args) {

		//int arr[]={10,20,30,25,15};
		Scanner sc=new Scanner(System.in);
		
		System.out.println("How many elements do you want in array");
		int n=sc.nextInt();//n=5
		
		
		int arr[]=new int[n];
		
		System.out.println("Enter elements in array");
		for(int i=0;i<arr.length;i++)//i=4
		{
			arr[i]=sc.nextInt();
		}
		System.out.println("Array elements are...");
		for(int i=0;i<arr.length;i++)
		{
			System.out.println(arr[i]);//10
		}
		System.out.println("-----for eachloop");
		for(int i:arr)
		{
			System.out.println(i);
		}
		System.out.println("Array elements in reverse order are \n");
		for(int i=arr.length-1;i>=0;i--)//i=-1
		{
			System.out.println(arr[i]);
		}
	}
}

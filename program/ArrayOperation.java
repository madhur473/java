import java.util.Scanner;

public class ArrayOperation {
	
	public int[] create(){
		
	Scanner sc=new Scanner(System.in);
		System.out.println("How many elements do you want in array");
		int n=sc.nextInt();//n=5
		
		int arr[]=new int[n];
		System.out.println("Enter elements in array");
		for(int i=0;i<arr.length;i++)//i=4
		{
			arr[i]=sc.nextInt();
		}	
		return arr;
	}
	public void display(int arr[]){
		System.out.println("Array elements are...");
		for(int i=0;i<arr.length;i++)
		{
			System.out.println(arr[i]);//10
		}
	}
	public int searchData(int arr[],int s)//10 20 30 40 50
	{
		int i=-1;
		for(i=0;i<arr.length;i++)
		{
			if(arr[i]==s)
			{
				break;
			}
		}
		return i;
	}
}

import java.util.Scanner;
public class TestArray2 {
	public static void main(String[] args) {
		int arr[];
		Scanner sc=new Scanner(System.in);
		System.out.println("How many nos do you want");
		int n=sc.nextInt();//5
		//int arr[5];
		arr=new int[n];//allocate memeory for n nos
		System.out.println("Enter elements in array..");
		for(int i=0;i<arr.length;i++)//i=4
		{
			arr[i]=sc.nextInt();//sf("%d",&arr[i]);
		}
		System.out.println("Elements in Array are..");
		for(int i=0;i<arr.length;i++)
		{
			System.out.println(arr[i]);
		}
		System.out.println("Print array elements in reverse order");
		for(int i=arr.length-1;i>=0;i--)
		{
			System.out.println(arr[i]);//50 40 30 20 10
		}		
	}
}

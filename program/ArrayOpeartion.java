import java.util.Scanner;
public class ArrayOpeartion 
{//crud-database
	Scanner sc=new Scanner(System.in);
	public int[] create()
	{//allocate memory for array
		System.out.println("How many nos do you want in array");
		int n=sc.nextInt();//10
		int arr[]=new int[n];
		return arr;
	}
	public void inputData(int arr[],int size)
	{//insert elements in array
		System.out.println("Enter "+size+" elements in array");
		for(int i=0;i<size;i++)
		{
			arr[i]=sc.nextInt();
		}
	}
	public void displayData(int arr[],int size){
		System.out.println("Elements in array are");
		for(int i=0;i<size;i++)
		{
			System.out.println(arr[i]);
		}
	}
	public int inserNewElement(int arr[],int size,int newelm,int pos)
	{           //i=4    1>=2 3--
		for(int i=size-1;i>=pos-1;i--)
		{
			arr[i+1]=arr[i];
		}
		arr[pos-1]=newelm;//2
		size++;
		return size;
	}
	public int deleteElement(int arr[],int size,int pos)
	{
		int n=arr[pos-1];
		for(int i=pos-1;i<size;i++)
		{
			arr[i]=arr[i+1];			
		}
		System.out.println("ELement deleted "+n);
		size--;//5
		return size;
	}	
}

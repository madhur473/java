import java.util.Scanner;
public class Operation 
{
	Scanner sc=new Scanner(System.in);
	public int[] createArray()
	{
		int arr[]=new int[20];
		System.out.println("How many elements do you want in array");
		int n=sc.nextInt();
		//arr=new int[n];
		return arr;
	}
	public void acceptElements(int arr[],int size)
	{
		System.out.println("Enter elements in java");
		for(int i=0;i<size;i++)
		{
			arr[i]=sc.nextInt();
		}
	}
	public void display(int arr[],int size)
	{
		System.out.println("Elements in array are..");
		for(int i=0;i<size;i++)
		{
			System.out.print(arr[i]+"\t");
		}
	}
	public int searchData(int arr[],int size,int search)
	{	int i=0;
		boolean b=false;
		System.out.println("1-Linear Search\n2-Binary Search");
		
		for(i=0;i<size;i++)
		{
			if(arr[i]==search)
			{
				b=true;
				break;
			}
		}
		return i;
	}
	public void sorting(int arr[],int size)
	{
		
			System.out.println("1-Selection Sort\n2-Bubble Sort\n3-Insertion Sort");
			int ch=sc.nextInt();
			//Sorting s=new Sorting();
			switch(ch)
			{
			case 1:
				//s.bubbleSort(arr,size)
				break;
			case 2:
				break;
			case 3:
				break;
			}
	}
	public int insertElement(int arr[],int size,int elm,int pos)
	{               //j=4    1>=2
			for(int j=size-1;j>=pos-1;j--)//j=2
			{
				arr[j+1]=arr[j];
			}
			arr[pos-1]=elm;
			size++;//6
			return size;
			
	}
	public int deleteElement(int arr[],int size,int pos){
			//some code here..
			return size;
	}
}

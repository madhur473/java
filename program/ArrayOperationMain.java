import java.util.Scanner;
public class ArrayOperationMain {
	public static void main(String[] args) {
		int arr[]=null;
		int size=0;
		Scanner sc=new Scanner(System.in);
		Operation op=new Operation();
		do
		{
			System.out.println("1-Create Array\n2-Accept Element\n3-Display Elements");
			System.out.println("Enter your choice..");
			int ch=sc.nextInt();
			switch(ch)
			{
			case 1:
				arr=op.createArray();
				break;
			case 2:
				System.out.println("How many elements do you want in array");
				size=sc.nextInt();//5
				if(arr!=null)
					op.acceptElements(arr,size);
				else
					System.out.println("first allocate memeory for array");
				break;
			case 3:
				op.display(arr,size);
				break;
			case 4:
				System.out.println("Enter element to search in array");
				int search=sc.nextInt();
				int pos=op.searchData(arr,size, search);
				if((pos>=0)&&(pos<size))
					System.out.println("Element Found at "+(pos+1)+" location");
				else
					System.out.println("Element not found..");
				break;
			case 5:
				System.out.println();
				//call sort method...
				break;
			case 6:
				System.out.println("ENter element and possition to insert new element");
				int newelm=sc.nextInt();
				int pos1=sc.nextInt();
				size=op.insertElement(arr, size, newelm, pos1);
				break;
			case 7:
				size=op.deleteElement(arr,size, pos1);
				break;
			}
			System.out.println("DO you want to continue press 1");
		}while(sc.nextInt()==1);
	}
}

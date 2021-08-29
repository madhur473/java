import java.util.Scanner;
public class ArrayOperationsMain {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		ArrayOpeartion ao=new ArrayOpeartion();
		int size=0;
		int arr[]=null;
		int ch;
		do
		{
			System.out.println("\n1-Create Array\n2-Accept Array Elelemenst\n3-Display Array\n4-Insert New Element\5-Delete Element\6-Sort Element");
			System.out.println("Enter your choice");
			ch=sc.nextInt();//1
			switch(ch)
			{
			case 1:arr=ao.create();
			System.out.println("array created..");
			break;

			case 2:
				System.out.println("how many elements do you want in array max size is "+arr.length);
				size=sc.nextInt();//elm=5
				ao.inputData(arr,size);
				break;
			case 3:
				System.out.println("display elements from array..");
				ao.displayData(arr,size);
				break;
			case 4:
				//insert new value and pos
				System.out.println("Enter new value and possition to insert in array");
		size=ao.inserNewElement(arr,size,sc.nextInt(),sc.nextInt());
				break;
			case 5:
				//delete value..
	System.out.println("Enter possition to delete element from array");
	size=ao.deleteElement(arr,size,sc.nextInt());
				break;
			case 6:
				//search..
				break;
			case 7://sorting..
				break;
			}
			System.out.println("do you want to contonue press yes or no");
		}while(sc.next().equals("yes"));
		System.out.println("--------THANKYOU----------");
	}
}
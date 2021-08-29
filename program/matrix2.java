import java.util.Scanner;

public class matrix2 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int mat1[][];
		System.out.println("How many rows do you want");
		int r1=sc.nextInt();//4
		
		mat1=new int[r1][];
		//memory is allocated..
		for(int i=0;i<mat1.length;i++)//i=2
		{
			System.out.println("Enter col for "+(i+1)+" row");
			int c1=sc.nextInt();//2 3 4 1
			mat1[i]=new int[c1];
			
		}
		//accept elements in matrix..
		//and display elements from matrix..
		
	}

}

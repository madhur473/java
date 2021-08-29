import java.util.Scanner;

public class MatrixOp {
	Scanner sc=new Scanner(System.in);

	public int[][] createMatrix()
	{
		System.out.println("how many rows do you want");
		int r=sc.nextInt();//4
		//this code is for to allocate rows
		int arr[][]=new int[r][];
		//arr.length means no of rows=3
		System.out.println("enter col for each row");
		//this code is use to allocate col for each row
		for(int i=0;i<arr.length;i++)//i=3
		{
			System.out.println("enter col for "+(i+1)+" row");
			arr[i]=new int[sc.nextInt()];//2 3 4 1
		}
		return arr;
	}
	public void insertMatrix(int mat1[][])
	{
		for(int i=0;i<mat1.length;i++)//i=1
		{
			//j=0 j<arr[0].length
			for(int j=0;j<mat1[i].length;j++)
			{
				mat1[i][j]=sc.nextInt();
			}
			System.out.println();
		}

	}
	public void displayMatrix(int mat1[][])
	{
		System.out.println("Matrix1-------");	
		for(int i=0;i<mat1.length;i++)//i=1
		{
			//j=0 j<arr[0].length
			for(int j=0;j<mat1[i].length;j++)
			{
				System.out.print(mat1[i][j]+"\t");
			}
			System.out.println();
		}
	}
	public boolean validateMatrix(int mat1[][],int mat2[][])
	{
		boolean b=true;
		if(mat1.length==mat2.length)
		{
			for(int i=0;i<mat1.length;i++)
			{
				if(mat1[i].length!=mat2[i].length)
				{
					b=false;
					break;
				}
			}
		}
		else
		{
			b=false;
		}
		return b;
	}
	public int[][] matrixAddition(int mat1[][],int mat2[][])
	{
		//allocate memeory for matrix3
		int mat3[][]=new int[mat1.length][];
		for(int i=0;i<mat3.length;i++)
		{
			mat3[i]=new int[mat1[i].length];
		}
	//addition..
		for(int i=0;i<mat1.length;i++)
		{
			for(int j=0;j<mat1[i].length;j++)
			{
				mat3[i][j]=mat1[i][j]+mat2[i][j];
			}
		}
		return mat3;
	}	
}

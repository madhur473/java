import java.util.Scanner;

public class TestTwoDArray 
{
	public static void main(String[] args) {

		MatrixOp op=new MatrixOp();
		int mat1[][]=op.createMatrix();
		int mat2[][]=op.createMatrix();
		int mat3[][]=null;
		boolean b=op.validateMatrix(mat1, mat2);
		if(b)
		{
			System.out.println("Enter elemets for matrix1");
			op.insertMatrix(mat1);
			System.out.println("Enter elements for matrix2");
			op.insertMatrix(mat2);
			
			//mat3=op.createMatrix();
			mat3=op.matrixAddition(mat1, mat2);
			op.displayMatrix(mat1);
			op.displayMatrix(mat2);
			System.out.println("--ADDITION-------------------");
			op.displayMatrix(mat3);
		}
		else
		{
			System.out.println("Add not possible..");
		}
	}
}
/*
for addition of two matrix check row for both matrix
	if rows are same the check col for each row of both matrix
	if both the matrix are same then only accept elements for matrix1 and matrix2
	
	then allocate memeory for matrix 3
	
	perfomed addition of two matrix and display 
	matrix3.
	
	
*/
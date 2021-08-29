package pattern1;

public class pattern {
	
	public static void main(String args[]) {
		int rows=5;
		int i,j;
		for(i=0;i<=rows;i++)
		{
			for(j=rows-i;j>=1;j--)
			{
			System.out.print("*");
		}
		System.out.println();	
	}
}
}



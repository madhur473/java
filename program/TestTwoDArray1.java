
public class TestTwoDArray1 {
	public static void main(String[] args) {
		int arr[][]=
			{
					{10},
					{40,50},
					{70,80,90},
					{100}
			};
					//arr.length means no of row
		for(int i=0;i<arr.length;i++)//i=2
		{
				          //arr[i] means no of col for
						//perticular row
			for(int j=0;j<arr[i].length;j++)//j=1
			{
				System.out.print(arr[i][j]+"\t");
			}
			System.out.println("\n");
		}
	}
}

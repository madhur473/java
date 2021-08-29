public class TestArray1 {
	public static void main(String[] args) {
		int arr[]={10,20,30,40,50};
		//arr.length is array property in java
		for(int i=0;i<arr.length;i++)
		{
			System.out.println(arr[i]+"\t");
		}
		//or java 5 onwords
		System.out.println("for each loop..");
		for(int i:arr)
		{
			System.out.println(i);
		}
	}
}

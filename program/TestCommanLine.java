public class TestCommanLine {
	public static void main(String[] args) {//10 20 30 40 50
		int sum=0;
		for(int i=args.length-1;i>=0;i--){//0
			System.out.println(args[i]);//50 40 30 20 10
		sum=sum+Integer.parseInt(args[i]);//0+50=50+40=90+30=120+20=140+10=150
		}
		System.out.println("Sum of "+args.length+" element is :"+sum);
	}
}

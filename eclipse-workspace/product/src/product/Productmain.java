package product;
import java.util.*;
public class Productmain {
	public static void main(String [] args) {
		Scanner sc=new Scanner(System.in);
		Product p=new Product();
		System.out.println("Enter product id");
		p.setPid(sc.nextInt());
		System.out.println("Enter product name");
		p.setPname(sc.next());
		System.out.println("Enter product price");
		p.setPprice(sc.nextDouble());
		System.out.println("product id"+p.getPid());
		System.out.println("product name"+p.getPname());
		System.out.println("product price"+p.getPprice());
	}

}

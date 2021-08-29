package bankAppsetterGetter;

public class Accountmain {
	public static void main(String args[]) {
		Account acc=new Account();
		acc.setAccNo(101);
		acc.setCustName("madhur");
		acc.setAccBal(10000);
		System.out.println("Acc no"+acc.getAccNo());
		System.out.println("customer name"+acc.getCustName());
		System.out.println("account balance"+acc.getAccBal());
	}

}

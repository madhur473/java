package bankAppsetterGetter;

public class Account {
	
	private int accNo;
	private String custName;
	private double accBal;
	//to do this all the coding we can also use RIGHT CLICK ->SOURCE->GENERATE SETTER AND GETTER -> SELECT ALL 
	//(automatically the further code will be genarated)
	public int getAccNo() {
		return accNo;
	}
	public void setAccNo(int accNo) {
		this.accNo = accNo;
	}
	public String getCustName() {
		return custName;
	}
	public void setCustName(String custName) {
		this.custName = custName;
	}
	public double getAccBal() {
		return accBal;
	}
	public void setAccBal(double accBal) {
		this.accBal = accBal;
	}
	
	
	
	/*public void setAccNo(int ano) {
		accNo=ano;
	}
	public int getAccoNo() {
		return accNo;
	}
	public void setcustName(String n) {
		custName=n;
	}
	public String getcustName() {
		return custName;
	}
	public void setaccBal(int b) {
		accBal=b;
	}
	public double getaccBal() {
		return accBal;
	}*/

}

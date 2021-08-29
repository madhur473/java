package applicationbook;

public class Bookmain {

	public static void main(String[] args) {
	
		book obj=new book(101,"java",100.87);
		System.out.println("book id:"+obj.getBookId());
		System.out.println("book name:"+obj.getBookName());
		System.out.println("book price"+obj.getBookPrice());
		
	}

}

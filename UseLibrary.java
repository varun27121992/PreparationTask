package composition;

public class UseLibrary {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Book b = new Book();
		b.author = "varun";
		b.title = "1000 ways to make 1000 dollars";
		b.price = 10000;
		b.publish = "Western publication";

		Library l1 = new Library();
		l1.rack = 2500;
		l1.address = "Chennai";
		l1.noOfBooks = 7500;
		l1.book = b;

		System.out.println(l1.rack + "" + l1.address + "" + l1.noOfBooks);
		System.out.println(l1.book.author+""+l1.book.title);

	}

}

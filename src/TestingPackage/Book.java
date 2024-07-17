package TestingPackage;

public class Book {
	String title;

	String author;

	int pageCount;

	
	public static void main(String[] args) {
		 int totalBooks=0;

		Book b1 = new Book();
		b1.title = "Bad Dog";
		b1.author = "David";
		b1.pageCount = 15;
		totalBooks++;
		
		Book b2 = new Book();
		b2.title = "Cooking with Dr.Seuss";
		b2.author = "Dr.Seuss";
		b2.pageCount = 25;
		totalBooks++;
		
		
		Book b3 = new Book();
		b3.title = "Clean Up Time";
		b3.author = "Loo";
		b3.pageCount = 18;
		totalBooks++;
		System.out.println(b1.title + " "+ b1.author + " " + b1.pageCount);
		System.out.println(b2.title + " " +b2.author + " "+b2.pageCount);
		System.out.println(b3.title + " "+ b3.author + " "+b3.pageCount);
		System.out.println(totalBooks);
		
		b2.pageCount = 20;
		System.out.println(b2.title + " " +b2.author + " "+b2.pageCount);
		
		Book b4 = new Book();
		b4.title = "Cooking with Sam i am";
		b4.author = "Dr. Seuss";
		b4.pageCount = 128;
		totalBooks++;
		
		System.out.println(b4.title +" " + b4.author + " " +b4.pageCount);
		System.out.println(totalBooks);
	
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}

package ch07.bb;

public class ConversationBook extends Book {
	public String language;
	
	public ConversationBook() {}
	public ConversationBook(int id, String comment, String productor, int price, String author, String bookTitle, String language ) {
		super(id, comment, productor, price, author, bookTitle);
		this.language = language;
	}
	public void display() {
		super.display();
		System.out.print(language);
	}
}

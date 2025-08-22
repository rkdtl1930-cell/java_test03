package ch07.aa;

class Book{
	private String title;
	private int pages;
	private String writer;
	public Book() {}
	public Book(String title, int pages, String writer) {
		this.title = title;
		this.pages = pages;
		this.writer = writer;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public int getPages() {
		return pages;
	}
	public void setPages(int pages) {
		this.pages = pages;
	}
	public String getWriter() {
		return writer;
	}
	public void setWriter(String writer) {
		this.writer = writer;
	}
}

class Magazine extends Book{
	private String date;
	public Magazine() {}
	public Magazine(String date, String title, int pages, String writer) {
		super(title, pages, writer);
		this.date = date;
	}
	public String getDate() {
		return date;
	}
	public void setDate(String date) {
		this.date = date;
	}
}

public class Test02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}

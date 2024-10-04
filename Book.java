public class Book extends Bibliography{
	private String bookID;
    private int yearPublish;
    private String publisher;
    private String edition;
    private int page;
    
    public Book(String title, Author author, String subject, String bookID, int yearPublish, String publisher,
			String edition, int page) {
		super(title, author, subject);
		this.bookID = bookID;
		this.yearPublish = yearPublish;
		this.publisher = publisher;
		this.edition = edition;
		this.page = page;
	}
	
    public String getBookID() {
		return bookID;
	}
	
    public void setBookID(String bookID) {
		this.bookID = bookID;
	}
	
    public int getYearPublish() {
		return yearPublish;
	}
	
    public void setYearPublish(int yearPublish) {
		this.yearPublish = yearPublish;
	}
	
    public String getPublisher() {
		return publisher;
	}
	
    public void setPublisher(String publisher) {
		this.publisher = publisher;
	}
	
    public String getEdition() {
		return edition;
	}
	
    public void setEdition(String edition) {
		this.edition = edition;
	}
	
    public int getPage() {
		return page;
	}
	
    public void setPage(int page) {
		this.page = page;
	}
}



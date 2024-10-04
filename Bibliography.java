public class Bibliography {
    private String title;
    private Author author;
    private String subject;

    public Bibliography (String title, Author author, String subject) {
        this.title = title;
        this.author = author;
        this.subject = subject;
    }

    public String getTitle() {
        return title;
    }

    public Author getAuthor() {
        return author;
    }

    public String getSubject() {
        return subject;
    }
    

    public void setTitle(String title) {
        this.title = title;
    }

    public void setAuthor(Author author) {
        this.author = author;
    }

    public void setGenre(String subject) {
        this.subject = subject;
    }
}


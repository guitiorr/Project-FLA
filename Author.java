public class Author {
    private String authorName;
    private String dateOfBirth;
    private String country;   
    
	public Author(String authorName, String dateOfBirth, String country){
        this.authorName = authorName;
        this.dateOfBirth = dateOfBirth;
        this.country = country;
    }

    public String getAuthorName() {
        return authorName;
    }

    public String getDateOfBirth() {
        return dateOfBirth;
    }

    public String getCountry() {
        return country;
    }

    public void setAuthorName(String authorName) {
        this.authorName = authorName;
    }

    public void setDateOfBirth(String dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public void setCountry(String country) {
        this.country = country;
    }
}
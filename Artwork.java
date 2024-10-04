public class Artwork extends Bibliography{
    private int year;
    private String artType;
    private String artStyle;
    private String artMovement;

    public Artwork (String title, Author author, String subject,
    		int year, String artType, String artStyle, String artMovement) {
        super(title, author, subject);
        this.year = year;
        this.artType = artType;
        this.artStyle = artStyle;
        this.artMovement = artMovement;
    }

    public int getYear() {
        return year;
    }

    public String getArtType() {
        return artType;
    }
    
    public String getArtStyle() {
    	return artStyle;
    }
    
    public String getArtMovement() {
    	return artMovement;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public void setArtType(String artType) {
        this.artType = artType;
    }
    
    public void setArtStyle(String artStyle) {
    	this.artStyle = artStyle;
    }
    
    public void setArtMovement(String artMovement) {
    	this.artMovement = artMovement;
    }
}


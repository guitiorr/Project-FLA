public class ComputerFile extends Bibliography{
	private String dateCreated;
    private String format;
    private double fileSize;
    
    public ComputerFile(String title, Author author, String subject, String dateCreated, String format, double fileSize){
        super(title, author, subject);
        this.dateCreated = dateCreated;
        this.format = format;
        this.fileSize = fileSize;
    }
    
    public String getDateCreated() {
        return dateCreated;
    }

    public String getFormat() {
        return format;
    }
    
    public double getFileSize() {
    	return fileSize;
    }
    
    public void setDateCreated(String dateCreated) {
        this.dateCreated = dateCreated;
    }

    public void setFormat(String format) {
        this.format = format;
    }

    public void setFileSize(double fileSize) {
    	this.fileSize = fileSize;
    }
}




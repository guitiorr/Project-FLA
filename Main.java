import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        ArrayList<Book> bookData = new ArrayList<>();
        ArrayList<ComputerFile> compData = new ArrayList<>();
        ArrayList<Artwork> artData = new ArrayList<>();
        ArrayList<Author> authorData = new ArrayList<>();
        
        int input, input2, input3, input4, input5;
        
        
        do{
            System.out.println("1. Add New Bibliography");
            System.out.println("2. Remove Bibliography");
            System.out.println("3. Update Bibliography");
            System.out.println("4. Search Bibliography");
            System.out.println("5. Display All Bibliography");
            System.out.println("6. Exit");
            
            System.out.print("Your choice : ");
            input = scanner.nextInt(); scanner.nextLine();

            System.out.println();
            System.out.println();

            switch (input) {
                case 1:
                		System.out.println("Title and Subject");
                    	System.out.print("Insert Title : ");
                    	String title = scanner.nextLine();
                    	
                    	System.out.print("Insert Subject : ");
                    	String subject = scanner.nextLine();
                    	
                    	System.out.println();
                    	
                    	System.out.println("Author Data");
                    	System.out.print("Insert Author Name : ");
                        String authorName = scanner.nextLine();

                        System.out.print("Insert Author Date of Birth (dd/mm/yy) : ");
                        String dob = scanner.nextLine();

                        System.out.print("Insert Author Country : ");
                        String country = scanner.nextLine();
                        
                        System.out.println();
                        System.out.println();
                        
                        System.out.println("1. Add New Book");
                        System.out.println("2. Add New Computer File");
                        System.out.println("3. Add New Artwork");
                        System.out.println("4. Back ");
                        

                        
                        do {
                        	 System.out.print("Insert Type of Bibliography : ");
                             input2 = scanner.nextInt(); scanner.nextLine();
                        }while(input2 != 1 && input2 != 2 && input2 != 3 && input2 != 4);

                        System.out.println();
                        System.out.println();
                       

                        switch (input2) {
                            case 1:
                            	System.out.print("Insert Book ID : ");
                                String bookID = scanner.nextLine();

                                System.out.print("Insert Year of Publication : ");
                                int yearPublish = scanner.nextInt(); scanner.nextLine();

                                System.out.print("Insert Publisher : ");
                                String publisher = scanner.nextLine();

                                System.out.print("Insert Book Edition : ");
                                String edition = scanner.nextLine();
                                
                                System.out.print("Insert Total Page : ");
                                int page = scanner.nextInt(); scanner.nextLine();

                                Author insertAuthor = new Author(authorName, dob, country);
                                Book insertBook = new Book(title, insertAuthor, subject, bookID, yearPublish, publisher, edition, page);
                                
                                bookData.add(insertBook);
                                authorData.add(insertAuthor);

                                input2 = 4;

                                System.out.println();
                                System.out.println();

                                break;

                            case 2:
                                System.out.print("Insert Date Modified : ");
                                String dateCreated = scanner.nextLine();

                                System.out.print("Insert File Format : ");
                                String format = scanner.nextLine();
                                
                                System.out.print("Insert File Size : ");
                                double fileSize = scanner.nextDouble(); scanner.nextLine();

                                insertAuthor = new Author(authorName, dob, country);
                                ComputerFile insertComp = new ComputerFile(title, insertAuthor, subject, dateCreated, format, fileSize);
                                
                                compData.add(insertComp);
                                authorData.add(insertAuthor);

                                input2 = 4;

                                System.out.println();
                                System.out.println();

                                break;

                            case 3:
                                System.out.print("Insert Year Created : ");
                                int year = scanner.nextInt(); scanner.nextLine();

                                System.out.print("Insert Type of Art : ");
                                String artType = scanner.nextLine();
                                
                                System.out.print("Insert Art Style : ");
                                String artStyle = scanner.nextLine();
                                
                                System.out.print("Insert Art Movement : ");
                                String artMovement = scanner.nextLine();

                                insertAuthor = new Author(authorName, dob, country);
                                Artwork insertArt = new Artwork(title, insertAuthor, subject, year, artType, artStyle,
                                        artMovement);

                                
                                artData.add(insertArt);
                                authorData.add(insertAuthor);

                                input2 = 4;

                                System.out.println();
                                System.out.println();

                                break;

                            case 4:
                                break;
                        }


                    break;

                case 2:
                	do{
                        System.out.print("1. Delete Book\n2. Delete Computer File\n3. Delete Artwork\n4. Back\n" +
                                "Select Delete : ");
                        input5 = scanner.nextInt(); scanner.nextLine();
                        
                        System.out.println();
                        System.out.println();

                        switch (input5){
                            case 1:
                            	if(bookData.isEmpty()) {
                            		System.out.println("No data\n");
                            		continue;
                            	}
                            	
                                System.out.println("Book Data : ");
                                String spaces = " ";

                                System.out.println("===============================================================" +
                                        "============================================================================" +
                                        "========================");

                                System.out.printf("|" + spaces.repeat(2) + "%s" +
                                                spaces.repeat(2) + "|" + spaces.repeat(7) + "%s" +
                                                spaces.repeat(7) + "|" + spaces.repeat(10) + "%s" +
                                                spaces.repeat(10) + "-" + spaces.repeat(1) + "%s" +
                                                spaces.repeat(1) + "-" + spaces.repeat(4) + "%s" +
                                                spaces.repeat(4) + "|" + spaces.repeat(3) + "%s" +
                                                spaces.repeat(3) + "|" + spaces.repeat(2) + "%s" +
                                                spaces.repeat(2) + "|" + spaces.repeat(2) + "%s" +
                                                spaces.repeat(2) + "|" + spaces.repeat(3) + "%s" +
                                                spaces.repeat(3) + "|" + spaces.repeat(3) + "%s" +
                                                spaces.repeat(3) + "|\n" , "No", "Title", "Author Name",
                                        "Date of Birth","Country",
                                        "Genre", "Book ID", "Year Publish", "Publisher",
                                        "Edition", "Page");

                                System.out.println("===============================================================" +
                                        "===========================================================================" +
                                        "=========================");
                                for (int i = 0; i < bookData.size(); i++) {

                                    System.out.printf("|%-6s|%-19s|", i+1, bookData.get(i).getTitle());
                                    System.out.printf("%-31s" + "-" + "%-15s" + "-" + "%-15s",
                                            bookData.get(i).getAuthor().getAuthorName() ,
                                            bookData.get(i).getAuthor().getDateOfBirth(),
                                            bookData.get(i).getAuthor().getCountry());
                                    System.out.printf("|%-11s|%-11s|%-16s|%-15s|%-13s|\n",
                                            bookData.get(i).getSubject(), bookData.get(i).getBookID(),
                                            bookData.get(i).getYearPublish(), bookData.get(i).getPublisher(),
                                            bookData.get(i).getEdition(), bookData.get(i).getPage());
                                }

                                for(int i = 0; i < 2; i++){
                                    System.out.println();
                                }

                                
                                System.out.print("Select Book Data to Delete : ");
                                int del1 = scanner.nextInt(); scanner.nextLine();
                                
                                if(del1 > 0 && del1 <= bookData.size()) {
                                	bookData.remove(del1-1);       
                                    input5 = 4;
                                }else {
                                	System.out.println("Your choice don't exist in data.\n");
                                	input5 = 4;
                                }
                                
                                break;

                            case 2:
                            	if(compData.isEmpty()) {
                            		System.out.println("No data\n");
                            		continue;
                            	}
                            	
                                System.out.println("Computer File Data : ");
                                spaces = " ";

                                System.out.println("===============================================================" +
                                        "======================================================================================");

                                System.out.printf("|" + spaces.repeat(2) + "%s" +
                                                spaces.repeat(2) + "|" + spaces.repeat(7) + "%s" +
                                                spaces.repeat(7) + "|" + spaces.repeat(10) + "%s" +
                                                spaces.repeat(10) + "-" + spaces.repeat(1) + "%s" +
                                                spaces.repeat(1) + "-" + spaces.repeat(4) + "%s" +
                                                spaces.repeat(4) + "|" + spaces.repeat(3) + "%s" +
                                                spaces.repeat(3) + "|" + spaces.repeat(2) + "%s" +
                                                spaces.repeat(2) + "|" + spaces.repeat(2) + "%s" +
                                                spaces.repeat(2) + "|" + spaces.repeat(1) + "%s" +
                                                spaces.repeat(1) + "|\n", "No", "Title", "Author Name", "Date of Birth", "Country",
                                        "Genre", "File Format", "Date Created", "File Size");

                                System.out.println("===============================================================" +
                                        "======================================================================================");

                                for (int i = 0; i < compData.size(); i++) {

                                    System.out.printf("|%-6s|%-19s|", i+1, compData.get(i).getTitle());
                                    System.out.printf("%-31s" + "-" + "%-15s" + "-" + "%-15s",
                                            compData.get(i).getAuthor().getAuthorName() ,
                                            compData.get(i).getAuthor().getDateOfBirth(),
                                            compData.get(i).getAuthor().getCountry());
                                    System.out.printf("|%-11s|%-15s|%-16s|%-12s|\n",
                                            compData.get(i).getSubject(), compData.get(i).getFormat(),
                                            compData.get(i).getDateCreated(), compData.get(i).getFileSize());
                                }

                                for(int i = 0; i < 2; i++){
                                    System.out.println();
                                }
                                

                                System.out.print("Select Computer File Data to Delete : ");
                                int del2 = scanner.nextInt(); scanner.nextLine();
                                
                                if(del2 > 0 && del2 <= compData.size()) {
                                	compData.remove(del2-1);       
                                    input5 = 4;
                                }else {
                                	System.out.println("Your choice don't exist in data.\n");
                                	input5 = 4;
                                }
                                
                                break;

                            case 3:
                            	if(artData.isEmpty()) {
                            		System.out.println("No data\n");
                            		continue;
                            	}
                            	spaces = " ";
                                System.out.println("Artwork Data : ");
                                System.out.println("===============================================================" +
                                        "=======================================================================================");

                                System.out.printf("|" + spaces.repeat(2) + "%s" +
                                                spaces.repeat(2) + "|" + spaces.repeat(7) + "%s" +
                                                spaces.repeat(7) + "|" + spaces.repeat(10) + "%s" +
                                                spaces.repeat(10) + "|" + spaces.repeat(3) + "%s" +
                                                spaces.repeat(3) + "|" + spaces.repeat(1) + "%s" +
                                                spaces.repeat(1) + "|" + spaces.repeat(4) + "%s" +
                                                spaces.repeat(4) + "|" + spaces.repeat(4) + "%s" +
                                                spaces.repeat(4) + "|" + spaces.repeat(4) + "%s" +
                                                spaces.repeat(4) + "|\n", "No", "Title", "Author Name",
                                        "Genre", "Year of Publication", "Art Type" ,"Art Style", "Art Movement");

                                System.out.println("===============================================================" +
                                        "=======================================================================================");
                                for (int i = 0; i < artData.size(); i++) {

                                        System.out.printf("|%-6s|%-19s|", i + 1, artData.get(i).getTitle());
                                        System.out.printf("%-31s" + "-" + "%-15s" + "-" + "%-15s",
                                                artData.get(i).getAuthor().getAuthorName(),
                                                artData.get(i).getAuthor().getDateOfBirth(),
                                                artData.get(i).getAuthor().getCountry());
                                        System.out.printf("|%-11s|%-21s|%-16s|%-17s|%-20s|\n",
                                                artData.get(i).getSubject(), artData.get(i).getYear(),
                                                artData.get(i).getArtType(), artData.get(i).getArtStyle(), artData.get(i).getArtMovement());
                                    }

                                for(int i = 0; i < 2; i++){
                                    System.out.println();
                                }
                                
                                System.out.print("Select Art Work Data to Delete : ");
                                int del3 = scanner.nextInt(); scanner.nextLine();
                                
                                if(del3 > 0 && del3 <= artData.size()) {
                                	artData.remove(del3-1);       
                                    input5 = 4;
                                }else {
                                	System.out.println("Your choice don't exist in data.\n");
                                	input5 = 4;
                                }                                
                                                               
                                break;
                        }
                        
                    }while(input5 != 4);
                	
                    break;

                case 3:
                	do {
                        System.out.print("1. Update Book\n2. Update Computer File\n3. Update Artwork\n4. Back\n" +
                                "Select Update : ");
                        input3 = scanner.nextInt(); scanner.nextLine();
                        
                        System.out.println();
                        System.out.println();

                        switch (input3) {
                            case 1:
                                if (bookData.isEmpty()) {
                                    System.out.println("No data\n");
                                    continue;
                                }

                                System.out.println("Book Data : ");
                                String spaces = " ";

                                System.out.println("===============================================================" +
                                        "====================================================================================================");

                                System.out.printf("|" + spaces.repeat(2) + "%s" +
                                                spaces.repeat(2) + "|" + spaces.repeat(7) + "%s" +
                                                spaces.repeat(7) + "|" + spaces.repeat(10) + "%s" +
                                                spaces.repeat(10) + "-" + spaces.repeat(1) + "%s" +
                                                spaces.repeat(1) + "-" + spaces.repeat(4) + "%s" +
                                                spaces.repeat(4) + "|" + spaces.repeat(3) + "%s" +
                                                spaces.repeat(3) + "|" + spaces.repeat(2) + "%s" +
                                                spaces.repeat(2) + "|" + spaces.repeat(2) + "%s" +
                                                spaces.repeat(2) + "|" + spaces.repeat(3) + "%s" +
                                                spaces.repeat(3) + "|" + spaces.repeat(3) + "%s" +
                                                spaces.repeat(3) + "|\n", "No", "Title", "Author Name", "Date of Birth", "Country",
                                        "Genre", "Book ID", "Year Publish", "Publisher",
                                        "Edition", "Page");

                                System.out.println("===============================================================" +
                                        "====================================================================================================");
                                for (int i = 0; i < bookData.size(); i++) {

                                    System.out.printf("|%-6s|%-19s|", i+1, bookData.get(i).getTitle());
                                    System.out.printf("%-31s" + "-" + "%-15s" + "-" + "%-15s",
                                            bookData.get(i).getAuthor().getAuthorName() ,
                                            bookData.get(i).getAuthor().getDateOfBirth(),
                                            bookData.get(i).getAuthor().getCountry());
                                    System.out.printf("|%-11s|%-11s|%-16s|%-15s|%-13s|\n",
                                            bookData.get(i).getSubject(), bookData.get(i).getBookID(),
                                            bookData.get(i).getYearPublish(), bookData.get(i).getPublisher(),
                                            bookData.get(i).getEdition(), bookData.get(i).getPage());
                                }

                                for (int i = 0; i < 2; i++) {
                                    System.out.println();
                                }                                
                                
                                
                                System.out.print("Select Book Data to Update: ");
                                int up1 = scanner.nextInt(); scanner.nextLine();
                                
                                if(up1 > 0 && up1 <= bookData.size()) {
                                	System.out.println();
                                    System.out.println("Book Data : ");

                                    System.out.print("1. Insert Title : ");
                                    title = scanner.nextLine();

                                    System.out.print("2. Insert Subject : ");
                                    subject = scanner.nextLine();

                                    System.out.print("3. Insert Book ID : ");
                                    String bookID = scanner.nextLine();

                                    System.out.print("4. Insert Year of Publication : ");
                                    int yearPublish = scanner.nextInt();
                                    scanner.nextLine();

                                    System.out.print("5. Insert Publisher : ");
                                    String publisher = scanner.nextLine();

                                    System.out.print("6. Insert Book Edition : ");
                                    String edition = scanner.nextLine();

                                    System.out.print("7. Insert Page : ");
                                    int page = scanner.nextInt();

                                    System.out.println();
                                    System.out.println("Author Data : ");
                                    System.out.print("1. Insert Author Name : ");
                                    authorName = scanner.nextLine();

                                    System.out.print("2. Insert Date Of Birth : ");
                                    dob = scanner.nextLine();

                                    System.out.print("3. Insert Country : ");
                                    country = scanner.nextLine();

                                    int authorIndex = 0;
                                    for(int i = 0; i<authorData.size(); i++){
                                        if(bookData.get(up1 - 1).getAuthor() == authorData.get(i)){
                                            authorIndex = i;
                                        }
                                    }
                                    authorData.get(authorIndex).setAuthorName(authorName);
                                    authorData.get(authorIndex).setAuthorName(dob);
                                    authorData.get(authorIndex).setAuthorName(country);

                                    Book updateBook = new Book(title, authorData.get(authorIndex), subject, bookID, yearPublish, publisher, edition, page);
                                    bookData.set(up1 - 1, updateBook);
                                    
                                    input5 = 4;
                                }else {
                                	System.out.println("Your choice don't exist in data.\n");
                                	input5 = 4;
                                }                                                                                                

                                break;

                            case 2:
                                if (compData.isEmpty()) {
                                    System.out.println("No data\n");
                                    continue;
                                }

                                System.out.println("Computer File Data : ");
                                spaces = " ";

                                System.out.println("===============================================================" +
                                        "======================================================================================");

                                System.out.printf("|" + spaces.repeat(2) + "%s" +
                                                spaces.repeat(2) + "|" + spaces.repeat(7) + "%s" +
                                                spaces.repeat(7) + "|" + spaces.repeat(10) + "%s" +
                                                spaces.repeat(10) + "-" + spaces.repeat(1) + "%s" +
                                                spaces.repeat(1) + "-" + spaces.repeat(4) + "%s" +
                                                spaces.repeat(4) + "|" + spaces.repeat(3) + "%s" +
                                                spaces.repeat(3) + "|" + spaces.repeat(2) + "%s" +
                                                spaces.repeat(2) + "|" + spaces.repeat(2) + "%s" +
                                                spaces.repeat(2) + "|" + spaces.repeat(1) + "%s" +
                                                spaces.repeat(1) + "|\n", "No", "Title", "Author Name", "Date of Birth", "Country",
                                        "Genre", "File Format", "Date Created", "File Size");

                                System.out.println("===============================================================" +
                                        "======================================================================================");

                                for (int i = 0; i < compData.size(); i++) {
                                    String dOB = null;
                                    String country1 = null;

                                    System.out.printf("|%-6s|%-19s|", i+1, compData.get(i).getTitle());
                                    System.out.printf("%-31s" + "-" + "%-15s" + "-" + "%-15s",
                                            compData.get(i).getAuthor().getAuthorName() ,
                                            compData.get(i).getAuthor().getDateOfBirth(),
                                            compData.get(i).getAuthor().getCountry());
                                    System.out.printf("|%-11s|%-15s|%-16s|%-12s|\n",
                                            compData.get(i).getSubject(), compData.get(i).getFormat(),
                                            compData.get(i).getDateCreated(), compData.get(i).getFileSize());
                                }

                                for (int i = 0; i < 2; i++) {
                                    System.out.println();
                                }

                                System.out.print("Select Computer File Data to Update : ");
                                int up2 = scanner.nextInt(); scanner.nextLine();                                
                                
                                if(up2 > 0 && up2 <= compData.size()) {
                                	System.out.println();
                                    System.out.println("Computer File Data : ");

                                    System.out.print("1. Insert Title : ");
                                    title = scanner.nextLine();

                                    System.out.print("2. Insert Subject : ");
                                    subject = scanner.nextLine();

                                    System.out.print("3. Insert Date Created : ");
                                    String dateCreated = scanner.nextLine();

                                    System.out.print("4. Insert File Format : ");
                                    String format = scanner.nextLine();

                                    System.out.print("5. Insert File Size : ");
                                    double fileSize = scanner.nextDouble();
                                    scanner.nextLine();

                                    System.out.println();
                                    System.out.println("Author Data : ");
                                    System.out.print("1. Insert Author Name : ");
                                    authorName = scanner.nextLine();

                                    System.out.print("2. Insert Date Of Birth : ");
                                    dob = scanner.nextLine();

                                    System.out.print("3. Insert Country : ");
                                    country = scanner.nextLine();

                                    int authorIndex = 0;
                                    for(int i = 0; i<authorData.size(); i++){
                                        if(compData.get(up2 - 1).getAuthor() == authorData.get(i)){
                                            authorIndex = i;
                                        }
                                    }
                                    authorData.get(authorIndex).setAuthorName(authorName);
                                    authorData.get(authorIndex).setAuthorName(dob);
                                    authorData.get(authorIndex).setAuthorName(country);

                                    ComputerFile updateComp = new ComputerFile(title, authorData.get(authorIndex), subject, dateCreated, format, fileSize);
                                    compData.set(up2 - 1, updateComp);
                                    
                                    input5 = 4;
                                }else {
                                	System.out.println("Your choice don't exist in data.\n");
                                	input5 = 4;
                                }
                                

                                break;

                            case 3:
                                if (artData.isEmpty()) {
                                    System.out.println("No data\n");
                                    continue;
                                }
                                spaces = "";
                                System.out.println("Artwork Data : ");
                                System.out.println("===============================================================" +
                                        "=======================================================================================");

                                System.out.printf("|" + spaces.repeat(2) + "%s" +
                                                spaces.repeat(2) + "|" + spaces.repeat(7) + "%s" +
                                                spaces.repeat(7) + "|" + spaces.repeat(10) + "%s" +
                                                spaces.repeat(10) + "|" + spaces.repeat(3) + "%s" +
                                                spaces.repeat(3) + "|" + spaces.repeat(1) + "%s" +
                                                spaces.repeat(1) + "|" + spaces.repeat(4) + "%s" +
                                                spaces.repeat(4) + "|" + spaces.repeat(4) + "%s" +
                                                spaces.repeat(4) + "|" + spaces.repeat(4) + "%s" +
                                                spaces.repeat(4) + "|\n", "No", "Title", "Author Name",
                                        "Genre", "Year of Publication", "Art Type", "Art Style", "Art Movement");

                                System.out.println("===============================================================" +
                                        "=======================================================================================");
                                for (int i = 0; i < artData.size(); i++) {

                                    System.out.printf("|%-6s|%-19s|", i + 1, artData.get(i).getTitle());
                                    System.out.printf("%-31s" + "-" + "%-15s" + "-" + "%-15s",
                                            artData.get(i).getAuthor().getAuthorName(),
                                            artData.get(i).getAuthor().getDateOfBirth(),
                                            artData.get(i).getAuthor().getCountry());
                                    System.out.printf("|%-11s|%-21s|%-16s|%-17s|%-20s|\n",
                                            artData.get(i).getSubject(), artData.get(i).getYear(),
                                            artData.get(i).getArtType(), artData.get(i).getArtStyle(), artData.get(i).getArtMovement());
                                }


                                for (int i = 0; i < 2; i++) {
                                    System.out.println();
                                }

                                System.out.print("Select Art Work Data to Update : ");
                                int up3 = scanner.nextInt(); scanner.nextLine();
                                
                                if(up3 > 0 && up3 <= artData.size()) {
                                	System.out.println();
                                    System.out.println("Art Work Data : ");

                                    System.out.print("1. Insert Title : ");
                                    title = scanner.nextLine();

                                    System.out.print("2. Insert Subject : ");
                                    subject = scanner.nextLine();

                                    System.out.print("3. Insert Year Created : ");
                                    int year = scanner.nextInt();
                                    scanner.nextLine();

                                    System.out.print("4. Insert Type of Art : ");
                                    String artType = scanner.nextLine();

                                    System.out.print("5. Insert Art Style : ");
                                    String artStyle = scanner.nextLine();

                                    System.out.print("6. Insert Art Movement : ");
                                    String artMovement = scanner.nextLine();

                                    System.out.println();
                                    System.out.println("Author Data : ");
                                    System.out.print("1. Insert Author Name : ");
                                    authorName = scanner.nextLine();

                                    System.out.print("2. Insert Date Of Birth : ");
                                    dob = scanner.nextLine();

                                    System.out.print("3. Insert Country : ");
                                    country = scanner.nextLine();

                                    int authorIndex = 0;
                                    for(int i = 0; i<authorData.size(); i++){
                                        if(artData.get(up3 - 1).getAuthor() == authorData.get(i)){
                                            authorIndex = i;
                                        }
                                    }
                                    authorData.get(authorIndex).setAuthorName(authorName);
                                    authorData.get(authorIndex).setAuthorName(dob);
                                    authorData.get(authorIndex).setAuthorName(country);

                                    Artwork updateArt = new Artwork(title, authorData.get(authorIndex), subject, year, artType, artStyle, artMovement);
                                    artData.set(up3 - 1, updateArt);
                                    
                                    input5 = 4;
                                }else {
                                	System.out.println("Your choice don't exist in data.\n");
                                	input5 = 4;
                                }                                

                                break;
                        }
                    }while(input3 != 4);
                
                case 4:
                	do {
                        System.out.print("1. Search by Book Category\n2. Search by Computer File Category\n3. Search by Artwork Category\n" +
                                "4. Back\nSelect View : ");
                        input4 = scanner.nextInt();
                        scanner.nextLine();

                        for (int i = 0; i < 2; i++) {
                            System.out.println();
                        }

                        switch (input4) {
                            case 1:
                                String spaces = " ";

                                System.out.println("===============================================================" +
                                        "====================================================================================================");

                                System.out.printf("|" + spaces.repeat(2) + "%s" +
                                                spaces.repeat(2) + "|" + spaces.repeat(7) + "%s" +
                                                spaces.repeat(7) + "|" + spaces.repeat(10) + "%s" +
                                                spaces.repeat(10) + "-" + spaces.repeat(1) + "%s" +
                                                spaces.repeat(1) + "-" + spaces.repeat(4) + "%s" +
                                                spaces.repeat(4) + "|" + spaces.repeat(3) + "%s" +
                                                spaces.repeat(3) + "|" + spaces.repeat(2) + "%s" +
                                                spaces.repeat(2) + "|" + spaces.repeat(2) + "%s" +
                                                spaces.repeat(2) + "|" + spaces.repeat(3) + "%s" +
                                                spaces.repeat(3) + "|" + spaces.repeat(3) + "%s" +
                                                spaces.repeat(3) + "|\n", "No", "Title", "Author Name", "Date of Birth", "Country",
                                        "Genre", "Book ID", "Year Publish", "Publisher",
                                        "Edition", "Page");

                                System.out.println("===============================================================" +
                                        "====================================================================================================");
                                for (int i = 0; i < bookData.size(); i++) {

                                    System.out.printf("|%-6s|%-19s|", i + 1, bookData.get(i).getTitle());
                                    System.out.printf("%-31s" + "-" + "%-15s" + "-" + "%-15s",
                                            bookData.get(i).getAuthor().getAuthorName(),
                                            bookData.get(i).getAuthor().getDateOfBirth(),
                                            bookData.get(i).getAuthor().getCountry());
                                    System.out.printf("|%-11s|%-11s|%-16s|%-15s|%-13s|\n",
                                            bookData.get(i).getSubject(), bookData.get(i).getBookID(),
                                            bookData.get(i).getYearPublish(), bookData.get(i).getPublisher(),
                                            bookData.get(i).getEdition(), bookData.get(i).getPage());
                                }

                                for (int i = 0; i < 2; i++) {
                                    System.out.println();
                                }

                                break;

                            case 2:
                                spaces = " ";

                                System.out.println("===============================================================" +
                                        "======================================================================================");

                                System.out.printf("|" + spaces.repeat(2) + "%s" +
                                                spaces.repeat(2) + "|" + spaces.repeat(7) + "%s" +
                                                spaces.repeat(7) + "|" + spaces.repeat(10) + "%s" +
                                                spaces.repeat(10) + "-" + spaces.repeat(1) + "%s" +
                                                spaces.repeat(1) + "-" + spaces.repeat(4) + "%s" +
                                                spaces.repeat(4) + "|" + spaces.repeat(3) + "%s" +
                                                spaces.repeat(3) + "|" + spaces.repeat(2) + "%s" +
                                                spaces.repeat(2) + "|" + spaces.repeat(2) + "%s" +
                                                spaces.repeat(2) + "|" + spaces.repeat(1) + "%s" +
                                                spaces.repeat(1) + "|\n", "No", "Title", "Author Name", "Date of Birth", "Country",
                                        "Genre", "File Format", "Date Created", "File Size");

                                System.out.println("===============================================================" +
                                        "======================================================================================");

                                for (int i = 0; i < compData.size(); i++) {

                                    System.out.printf("|%-6s|%-19s|", i + 1, compData.get(i).getTitle());
                                    System.out.printf("%-31s" + "-" + "%-15s" + "-" + "%-15s",
                                            compData.get(i).getAuthor().getAuthorName(),
                                            compData.get(i).getAuthor().getDateOfBirth(),
                                            compData.get(i).getAuthor().getCountry());
                                    System.out.printf("|%-11s|%-15s|%-16s|%-12s|\n",
                                            compData.get(i).getSubject(), compData.get(i).getFormat(),
                                            compData.get(i).getDateCreated(), compData.get(i).getFileSize());
                                }
                                input4 = 5;

                                for (int i = 0; i < 2; i++) {
                                    System.out.println();
                                }

                                break;

                            case 3:
                                spaces = " ";

                                System.out.println("===============================================================" +
                                        "=======================================================================================");

                                System.out.printf("|" + spaces.repeat(2) + "%s" +
                                                spaces.repeat(2) + "|" + spaces.repeat(7) + "%s" +
                                                spaces.repeat(7) + "|" + spaces.repeat(10) + "%s" +
                                                spaces.repeat(10) + "|" + spaces.repeat(3) + "%s" +
                                                spaces.repeat(3) + "|" + spaces.repeat(1) + "%s" +
                                                spaces.repeat(1) + "|" + spaces.repeat(4) + "%s" +
                                                spaces.repeat(4) + "|" + spaces.repeat(4) + "%s" +
                                                spaces.repeat(4) + "|" + spaces.repeat(4) + "%s" +
                                                spaces.repeat(4) + "|\n", "No", "Title", "Author Name",
                                        "Genre", "Year of Publication", "Art Type", "Art Style", "Art Movement");

                                System.out.println("===============================================================" +
                                        "=======================================================================================");
                                for (int i = 0; i < artData.size(); i++) {

                                    System.out.printf("|%-6s|%-19s|", i + 1, artData.get(i).getTitle());
                                    System.out.printf("%-31s" + "-" + "%-15s" + "-" + "%-15s",
                                            artData.get(i).getAuthor().getAuthorName(),
                                            artData.get(i).getAuthor().getDateOfBirth(),
                                            artData.get(i).getAuthor().getCountry());
                                    System.out.printf("|%-11s|%-21s|%-16s|%-17s|%-20s|\n",
                                            artData.get(i).getSubject(), artData.get(i).getYear(),
                                            artData.get(i).getArtType(), artData.get(i).getArtStyle(), artData.get(i).getArtMovement());
                                }

                                input4 = 5;

                                for (int i = 0; i < 2; i++) {
                                    System.out.println();
                                }

                                break;

                            case 4:
                                break;
                        }
                    }while(input4 != 4);
                	
                	
                case 5:
                	String spaces = " ";
                	
                	System.out.println("Book Data : ");

                    System.out.println("===============================================================" +
                            "====================================================================================================");

                    System.out.printf("|" + spaces.repeat(2) + "%s" +
                                    spaces.repeat(2) + "|" + spaces.repeat(7) + "%s" +
                                    spaces.repeat(7) + "|" + spaces.repeat(10) + "%s" +
                                    spaces.repeat(10) + "-" + spaces.repeat(1) + "%s" +
                                    spaces.repeat(1) + "-" + spaces.repeat(4) + "%s" +
                                    spaces.repeat(4) + "|" + spaces.repeat(3) + "%s" +
                                    spaces.repeat(3) + "|" + spaces.repeat(2) + "%s" +
                                    spaces.repeat(2) + "|" + spaces.repeat(2) + "%s" +
                                    spaces.repeat(2) + "|" + spaces.repeat(3) + "%s" +
                                    spaces.repeat(3) + "|" + spaces.repeat(3) + "%s" +
                                    spaces.repeat(3) + "|\n" , "No", "Title", "Author Name", "Date of Birth","Country",
                            "Genre", "Book ID", "Year Publish", "Publisher",
                            "Edition", "Page");

                    System.out.println("===============================================================" +
                            "====================================================================================================");
                    for (int i = 0; i < bookData.size(); i++) {

                        System.out.printf("|%-6s|%-19s|", i + 1, bookData.get(i).getTitle());
                        System.out.printf("%-31s" + "-" + "%-15s" + "-" + "%-15s",
                                bookData.get(i).getAuthor().getAuthorName(),
                                bookData.get(i).getAuthor().getDateOfBirth(),
                                bookData.get(i).getAuthor().getCountry());
                        System.out.printf("|%-11s|%-11s|%-16s|%-15s|%-13s|\n",
                                bookData.get(i).getSubject(), bookData.get(i).getBookID(),
                                bookData.get(i).getYearPublish(), bookData.get(i).getPublisher(),
                                bookData.get(i).getEdition(), bookData.get(i).getPage());
                    }
                    input4 = 5;

                    for(int i = 0; i < 2; i++){
                        System.out.println();
                    }

                    System.out.println("Computer Files Data : ");
                    System.out.println("===============================================================" +
                            "======================================================================================");

                    System.out.printf("|" + spaces.repeat(2) + "%s" +
                                    spaces.repeat(2) + "|" + spaces.repeat(7) + "%s" +
                                    spaces.repeat(7) + "|" + spaces.repeat(10) + "%s" +
                                    spaces.repeat(10) + "-" + spaces.repeat(1) + "%s" +
                                    spaces.repeat(1) + "-" + spaces.repeat(4) + "%s" +
                                    spaces.repeat(4) + "|" + spaces.repeat(3) + "%s" +
                                    spaces.repeat(3) + "|" + spaces.repeat(2) + "%s" +
                                    spaces.repeat(2) + "|" + spaces.repeat(2) + "%s" +
                                    spaces.repeat(2) + "|" + spaces.repeat(1) + "%s" +
                                    spaces.repeat(1) + "|\n", "No", "Title", "Author Name", "Date of Birth", "Country",
                            "Genre", "File Format", "Date Created", "File Size");

                    System.out.println("===============================================================" +
                            "======================================================================================");

                    for (int i = 0; i < compData.size(); i++) {

                        System.out.printf("|%-6s|%-19s|", i + 1, compData.get(i).getTitle());
                        System.out.printf("%-31s" + "-" + "%-15s" + "-" + "%-15s",
                                compData.get(i).getAuthor().getAuthorName(),
                                compData.get(i).getAuthor().getDateOfBirth(),
                                compData.get(i).getAuthor().getCountry());
                        System.out.printf("|%-11s|%-15s|%-16s|%-12s|\n",
                                compData.get(i).getSubject(), compData.get(i).getFormat(),
                                compData.get(i).getDateCreated(), compData.get(i).getFileSize());
                    }
                    input4 = 5;

                    for(int i = 0; i < 2; i++){
                        System.out.println();
                    }

                    System.out.println("Art Work Data : ");
                    System.out.println("===============================================================" +
                            "=======================================================================================");

                    System.out.printf("|" + spaces.repeat(2) + "%s" +
                                    spaces.repeat(2) + "|" + spaces.repeat(7) + "%s" +
                                    spaces.repeat(7) + "|" + spaces.repeat(10) + "%s" +
                                    spaces.repeat(10) + "|" + spaces.repeat(3) + "%s" +
                                    spaces.repeat(3) + "|" + spaces.repeat(1) + "%s" +
                                    spaces.repeat(1) + "|" + spaces.repeat(4) + "%s" +
                                    spaces.repeat(4) + "|" + spaces.repeat(4) + "%s" +
                                    spaces.repeat(4) + "|" + spaces.repeat(4) + "%s" +
                                    spaces.repeat(4) + "|\n", "No", "Title", "Author Name",
                            "Genre", "Year of Publication", "Art Type" ,"Art Style", "Art Movement");

                    System.out.println("===============================================================" +
                            "=======================================================================================");
                    for (int i = 0; i < artData.size(); i++) {

                        System.out.printf("|%-6s|%-19s|", i + 1, artData.get(i).getTitle());
                        System.out.printf("%-31s" + "-" + "%-15s" + "-" + "%-15s",
                                artData.get(i).getAuthor().getAuthorName(),
                                artData.get(i).getAuthor().getDateOfBirth(),
                                artData.get(i).getAuthor().getCountry());
                            System.out.printf("|%-11s|%-21s|%-16s|%-17s|%-20s|\n",
                                    artData.get(i).getSubject(), artData.get(i).getYear(),
                                    artData.get(i).getArtType(), artData.get(i).getArtStyle(), artData.get(i).getArtMovement());
                        }

                    input4 = 5;

                    for(int i = 0; i < 2; i++){
                        System.out.println();
                    }
                	
                	break;

                    
            }
        }while(input != 6);
                	
                	
        
    }
}
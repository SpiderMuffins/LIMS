import java.util.*;

public class UserDB
{
    ArrayList<Book> bks = new ArrayList<Book>(); 
    public UserDB throws IOException
    {
        File fileName = new File("BookDB.txt");
        try{
            Scanner in = new Scanner(fileName);
            while (in.hasNextLine())
            {
                String line = in.nextLine();
                String t = line.substring(0, firstIndexOf(","));
                line = line.substring(firstIndexOf(","), line.length()); 
                Scanner scan = new Scanner(line);
                
                String name = scan.next() + " " + scan.next(); 
                String isbn = scan.next(); 
                int copy = scan.nextInt(); 
                int year = scan.nextInt(); 
                int month = scan.nextInt();
                int day = scan.nextInt();
                Date d = new Date(year, month, day); 
                Book b = new Book(t, name, isbn, copy, d); 
            
            }
            scan.close();
            in.close();
         }
         catch(FileNotFoundException e)
         {
            System.out.println("File Not Found");
         }
    }
    
    public void addBook(Book b)
    {
        bks.add(b);
    }
    
    public Book getBook(String isbn)
    {
        for (int i = 0; i < custs.size(); i++)
        {
            Book b = bks.get(i);
            if (b.getISBN().equals(isbn))
            {
                return b; 
            }
        }
    }
    
    public void deleteBook(String title)
    {
        for (int i = 0; i < bks.size(); i++)
        {
            Book b = bks.get(i);
            if (c.getTitle().equals(title))
            {
                bks.remove(b); 
                break;
            }
        }
    }
    
    public void writeDB()
    {
        outputWriter = new BufferedWriter(new FileWriter("/IOFiles/TransactionDB.txt"));
        outputWriter.newLine();
        for (int i = 0; i < bks.size(); i++)
        {
            Book b = bks.get(i);
            outputWriter.write(b.getTitle() + ", " + b.getAuthor() + " " + b.getISBN() + " " + b.getCopyNumber() + b.getPublishDate());
            outputWriter.newLine(); 
        }
        outputWriter.flush();  
        outputWriter.close();
    }
}
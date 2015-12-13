package UserInterface;

import java.util.*;
import java.io.*;

public class BookDB {
    public ArrayList<Book> bks = new ArrayList<Book>(); 
    public BookDB() {
        File fileName = new File("BookDB.txt");
        System.out.println("Something outside the try.");
        try{
            System.out.println("Something trule b4 try.");
            Scanner readIn = new Scanner(fileName);
            Scanner scan = new Scanner("BS");
            System.out.println("Something before the loop.");
            while (readIn.hasNextLine())
            {
                String line = readIn.nextLine();
                String t = line.substring(0, line.indexOf(","));
                line = line.substring(line.indexOf(",")+1, line.length()); 
                scan = new Scanner(line);
                
                String name = scan.next() + " " + scan.next(); 
                String isbn = scan.next(); 
                int copy = scan.nextInt(); 
                int year = scan.nextInt(); 
                int month = scan.nextInt();
                int day = scan.nextInt();
                Date d = new Date(year, month, day); 
                Book b = new Book(t, name, Long.parseLong(isbn), copy, d); 
                bks.add(b);
                System.out.println("I did it!");
            }
            scan.close();
            readIn.close();
         }
         catch(IOException ioe) {
             System.out.println("YES2");
         }
    }
    
    public void addBook(Book b)
    {
        bks.add(b);
    }
    
    public Book getBook(String isbn)
    {
        for (int i = 0; i < bks.size(); i++)
        {
            Book b = bks.get(i);
            if (b.getISBN().equals(isbn))
            {
                return b; 
            }
        }
        
        return null;
    }
    
    public Object[] getBookStuff(Book b) {
        Object[] result = new Object[4];
        
        result[0] = b.getTitle();
        result[1] = b.getAuthor();
        result[2] = b.getISBN();
        result[3] = b.getBookStatus();
        
        return result;
    }
    
    public void deleteBook(String title)
    {
        for (int i = 0; i < bks.size(); i++)
        {
            Book b = bks.get(i);
            if (b.getTitle().equals(title))
            {
                bks.remove(b); 
                break;
            }
        }
    }
    
    public void writeDB() throws IOException
    {
        BufferedWriter outputWriter = new BufferedWriter(new FileWriter("/IOFiles/BookDB.txt"));
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

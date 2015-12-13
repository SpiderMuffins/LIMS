package UserInterface;

import java.util.*;
import java.io.*;

public class TransactionDB {
    ArrayList<Transaction> trans = new ArrayList<Transaction>();
    public TransactionDB()
    {
        UserDB c = new UserDB();
        BookDB b = new BookDB(); 
        
        File fileName = new File("IOFiles/TransactionDB.txt");
        try{
            Scanner in = new Scanner(fileName);
            Scanner scan = new Scanner("BS");
            while (in.hasNextLine())
            {
                String line = in.nextLine();
                scan = new Scanner(line);
                
                if (scan.next().equals("true"))
                {
                    String ISBN = scan.next(); 
                    String acc = scan.next(); 
                
                    int year = scan.nextInt(); 
                    int month = scan.nextInt();
                    int day = scan.nextInt();
                
                    Date d = new Date(year, month, day); 
                    Transaction t = new Transaction (b.getBook(ISBN), c.getCustomer(acc), d);
                    trans.add(t); 
                }
            
            }
            scan.close();
            in.close();
         }
         catch(IOException ioe) {
             System.out.println("YES");
         }
    }
    
    
    public void addTransaction(Transaction t)
    {
        trans.add(t);
    }
    
    public Transaction getTransaction (Book b)
    {
        for (int i = 0; i < trans.size(); i++)
        {
            Transaction t = trans.get(i);
            if (t.getBook().getISBN() == (b.getISBN()))
            {
                return t; 
            }
        }
        
        return null;
    }
    
    public void closeTransaction (String isbn)
    {
        for (int i = 0; i < trans.size(); i++)
        {
            Transaction t = trans.get(i);
            if (t.getBook().getISBN() == (Long.parseLong(isbn)))
            {
                t.setStatus(false);
                break;
            }
        }
    }
    
    public void writeTDB() throws IOException
    {
        BufferedWriter outputWriter = new BufferedWriter(new FileWriter("/IOFiles/TransactionDB.txt"));
        outputWriter.newLine();
        
        for (int i = 0; i < trans.size(); i++)
        {
            Transaction t = trans.get(i);
            outputWriter.write(t.getStatus() + " " + t.getBook().getISBN() + " " + t.getCustomer().getAcc());
            outputWriter.newLine();
        }
        
        outputWriter.flush();  
        outputWriter.close();
    }
}
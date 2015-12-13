import java.util.*; 

public class TransactionDB {
    ArrayList<Transaction> trans = new ArrayList<Transaction>();
    public TransactionDB
    {
        CustomerDB c = new CustomerDB();
        BookDB b = new BookDB(); 
        
        File fileName = new File("TransactionDB.txt");
        try{
            Scanner in = new Scanner(fileName);
            while (in.hasNextLine())
            {
                String line = in.nextLine();
                Scanner scan = new Scanner(line);
                
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
         catch(FileNotFoundException e)
         {
            System.out.println("File Not Found");
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
            if (t.getBook().getISBNequals(b.ISBN))
            {
                return t; 
            }
        }
    }
    
    public void closeTransaction (String isbn)
    {
        for (int i = 0; i < trans.size(); i++)
        {
            Transaction t = trans.get(i);
            if (t.getBook().getISBNequals(b.ISBN))
            {
                t.setStatus(false);
                break;
            }
        }
    }
    
    public void writeTDB()
    {
        outputWriter = new BufferedWriter(new FileWriter("/IOFiles/TransactionDB.txt"));
        outputWriter.newLine();
        
        for (int i = 0; i < trans.size(); i++)
        {
            Transaction t = trans.get(i);
            outputWriter.write(t.getStatus + " " + t.getBook().getISBN() + " " + t.getCustomer().getAcc());
            outputWriter.newLine();
        }
        
        outputWriter.flush();  
        outputWriter.close();
    }
}
package UserInterface;

import java.util.*;
import java.io.*;

public class UserDB
{
    ArrayList<Customer> custs = new ArrayList<Customer>(); 
    ArrayList<Librarian> libs = new ArrayList<Librarian>(); 
    public UserDB()
    {
        File fileName = new File("IOFiles/UserDB.txt");
        try{
            Scanner in = new Scanner(fileName);
            Scanner scan = new Scanner("BS");
            while (in.hasNextLine())
            {
                String line = in.nextLine();
                scan = new Scanner(line);
                if (scan.next().equals("Customer"))
                {
                    String acc = scan.next();
                    String pin = scan.next(); 
                    String name = scan.next() + " " + scan.next();
                    double debt = scan.nextDouble(); 
                    Customer c = new Customer(name, acc, pin, debt); 
                    custs.add(c); 
                }
                if (scan.next().equals("Librarian"))
                {
                    String acc = scan.next();
                    String pin = scan.next(); 
                    Librarian l = new Librarian(acc, pin); 
                    libs.add(l); 
                }
            }
            scan.close();
            in.close();
         } catch(IOException ioe) {
             System.out.println("YES");
         }
    }
    
    public void addCustomer(Customer c)
    {
        custs.add(c);
    }
    
    public Customer getCustomer(String acc)
    {
        for (int i = 0; i < custs.size(); i++)
        {
            Customer c = custs.get(i);
            if (c.getAcc().equals(acc))
            {
                return c; 
            }
        }
        
        return null;
    }
    
    public void deleteCustomer(String acc)
    {
        for (int i = 0; i < custs.size(); i++)
        {
            Customer c = custs.get(i);
            if (c.getAcc().equals(acc))
            {
                custs.remove(c); 
                break;
            }
        }
    }
    
    public void writeUDB() throws IOException
    {
        BufferedWriter outputWriter = new BufferedWriter(new FileWriter("/IOFiles/UserDB.txt"));
        outputWriter.newLine();
        
        for (int i = 0; i < custs.size(); i++)
        {
            Customer c = custs.get(i);
            outputWriter.write("Customer " + c.getAcc() + " " + c.getPin() + " " + c.getName() + " " + c.getDebt());
            outputWriter.newLine(); 
        }
        
        for (int i = 0; i < libs.size(); i++)
        {
            Librarian l = libs.get(i);
            outputWriter.write("Librarian " + l.getAcc() + " " + l.getPin());
            outputWriter.newLine();
        }
        
        outputWriter.flush();  
        outputWriter.close();
    }
}
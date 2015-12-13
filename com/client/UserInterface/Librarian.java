package UserInterface;

public class Librarian extends Account
{
    String acctNumber;
    String pin;
    
    public Librarian(String acN, String p)
    {
        acctNumber = acN;
        pin = p; 
    }
    
    public String getAcc() {return acctNumber;}
    public String getPin() {return pin;}
    
    public void logIn(int pwd, int usr)
    {
       //TODO: Hook into the server using RMI.
    }
   
    public void viewAccount() 
    {
        //TODO: Write how to display the account
        System.out.println("Librarian reporting.");
    }
    
    public Customer create(String name)
    {
        Customer c = new Customer(name);
        return c; 
    }
    
    public void delete(String acc) 
    {
        
    }
    
    public void accessAccount(String pwd, Integer usr)
    {
        //TODO: Display options normally hidden in viewAccount()
        /**
         * switch(choice)
         *  case lambda :: to method
         * 
         * removeDebt --> Restores debt to zero
         * 
         * 
         **/
    }
    
    public void checkIn(Book bk)
    {
        if (bk.getBookStatus() == false) {
            bk.toggleBookStatus();
        } else {}
            //error message. 
            
        //TODO:         
        // check for customer debt      
        // Update customer account
        // Update transaction (using closeTransaction() method)
    }
    
    public void checkOut(Book bk, Integer usr)
    {
        if(bk.getBookStatus() == true) {
            bk.toggleBookStatus();
        } else {}
            //error message.
          
        //TODO:    
        // create a transaction and add to TransactionDB
        // Update customer account
        // check for customer debt (don't allow checkOut)
        
    }
}
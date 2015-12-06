package Entities;

public class Librarian extends Account
{
    int acctNumber;
    int pin;
    
    public Librarian(int acN, int p)
    {
        acctNumber = acN;
        pin = p; 
    }
    
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
    
    public void delete(Customer c) //I think this method should be part of the data structure we use for the customer database
    {
        //TODO: 
        //find c in customer database
        //remove c. 
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
        // check for customer debt and clear     
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
        //
        
    }
}
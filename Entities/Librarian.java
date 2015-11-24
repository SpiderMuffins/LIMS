package Entities;

public class Librarian extends Account
{
    public void logIn(int pwd, int usr)
    {
       //TODO: Hook into the server using RMI.
    }
   
    public void viewAccount() 
    {
        //TODO: Write how to display the account
        System.out.println("Librarian reporting.");
    }
    
    public void create()
    {

    }
    
    public void delete()
    {
        
    }
    
    public void accessAccount(String pwd, Integer usr)
    {
        //TODO: Display options normally hidden in viewAccount()
        /**
         * switch(choice)
         *  case lambda :: to method
         **/
    }
    
    public void checkIn(Book bk)
    {
        
    }
    
    public void checkOut(Book bk, Integer usr)
    {
        
    }
}
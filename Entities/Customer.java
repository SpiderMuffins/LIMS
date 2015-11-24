/**
 * 
 */
package Entities; 
 
public class Customer extends Account
{
    private String customerName;
    
    public Customer(String name)
    {
        customerName = name; 
    }
    
    public String   getName()           { return customerName; }
    public void     setName(String str) { customerName = str; }
    
    public void logIn(int pwd, int usr) 
    {
        //TODO: Hook into the server using RMI.
    }
    
    public void viewAccount() 
    {
        //TODO: Write how to display the account
        System.out.println("Customer reporting.");
    }
    
}
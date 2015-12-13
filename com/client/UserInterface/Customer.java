/**
 * 
 */
package UserInterface; 
  
public class Customer extends Account
{
    private String customerName;
    private String accountNumber;
    private String pin; 
    private static long currAcctNum = 000000000;
    
    private double debt;
    
    public Customer(String name)
    {
        customerName = name; 
        accountNumber = String.format("%09d", currAcctNum++);
        debt = 0.0;
    }
    public Customer(String name, String acc, String pin, double d)
    {
        customerName = name; 
        accountNumber = acc;
        this.pin = pin; 
        debt = d; 
    }
    
    public String   getName()           { return customerName; }
    public String   getPin()            { return pin; }
    public String   getAcc()           { return accountNumber; }
    public double   getDebt()           { return debt; }
    public void     setName(String str) { customerName = str; }
    
    public void addDebt(double amt) {
        debt += amt;
    }
    
    public void logIn(int pwd, int usr)
    {
       //TODO: Hook into the server using RMI.
    }
    
    public void viewAccount() 
    {
        //TODO: Write how to display the account
        System.out.println("Customer reporting.");
        System.out.println(accountNumber);
    }
    
}
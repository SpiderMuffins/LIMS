/**
 * 
 */
package Entities; 
  
public class Customer extends Account
{
    private String customerName;
    private String accountNumber;
    
    private static long currAcctNum = 000000000;
    
    private double debt;
    
    public Customer(String name)
    {
        customerName = name; 
        accountNumber = String.format("%09d", currAcctNum++);
        debt = 0.0;
    }
    
    public String   getName()           { return customerName; }
    public double   getDebt()           { return debt; }
    public void     setName(String str) { customerName = str; }
    
    public void addDebt(double amt) {
        debt += amt;
    }
    
    public void viewAccount() 
    {
        //TODO: Write how to display the account
        System.out.println("Customer reporting.");
        System.out.println(accountNumber);
    }
    
}
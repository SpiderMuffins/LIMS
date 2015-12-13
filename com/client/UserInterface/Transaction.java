package UserInterface;

import java.util.Date;

public class Transaction {
    public Customer borrower;
    public Book lentItem;
    public boolean status; //true if open, false if closed
    public Date transDateIn;
    public Date transDateOut;
    
    public Transaction(Book bk, Customer cuz) {
        //>>It's too late to apologize<<
        transDateOut = new Date();
        lentItem = bk;
        borrower = cuz;
        status = true;
    }
    
    public Book getBook()
    {
        return lentItem; 
    }
    
    public Customer getCustomer()
    {
        return borrower; 
    }
    
    public boolean getStatus()
    {
        return status; 
    }
    
    public void setStatus(boolean s)
    {
        status = s; 
    }
    
    public Transaction(Book bk, Customer cuz, Date d) {
        //>>It's too late to apologize<<
        transDateOut = d; 
        lentItem = bk;
        borrower = cuz;
        status = true;
    }
    
    public void overdue() {
        Date currDate = new Date();
        if(this.transDateIn.after(currDate) && (borrower.getDebt() < 50.0) && status) {
            borrower.addDebt(0.05);
        }
    }
    
    public void closeTransaction()
    {
        transDateIn = new Date();
        status = false; 
    }
}

package Entities;

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

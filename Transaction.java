import java.util.Date;

public class Transaction {
    public Customer borrower;
    public Book lentItem;
    public boolean status;
    public Date transDate;
    
    public Transaction(Book bk, Customer cuz) {
        //>>It's too late to apologize<<
        transDate = new Date();
        lentItem = bk;
        borrower = cuz;
    }
    
    public void setStatus() {
        Date currDate = new Date();
        this.status = this.transDate.after(currDate);
    }
}
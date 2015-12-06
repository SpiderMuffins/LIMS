package UserInterface;

public class LibrarianAccountPage extends AccountPage {
    
    
    public String load() {
        return "/index.html";
    }
    
    public void logOut() {
        //Will kill the current connection using SystemController.die()
    }
    
    public void onCIBook(int ISBN, int acctNum) {
        //Update the book status
        //Update the Transaction and Book databases
    }
    
    
    public void onCOBook(int ISBN, int acctNum) {
        
        //Update the book status
        //Update the Transaction and Book databases
    }
    
    
    public void onDeleteBook(int ISBN) {
        
        //Update the copyNumber of the Book in Book database
        //May want to include destructor in SystemController...
    }
    
    
    public void onAddBook(int ISBN) {
        
        //BookForm will pop-up onscreen and prompt for the information needed
        //--> to create a new instance of Book.
    }
    
    
    public void onAccountView(int acctNum) {
        
        //This method will point the Librarian to the appropriate Customer page.
    }
    
    private class BookForm{
        public BookForm() {
            //Intermediary for Librarian and Book
            //Allows the SystemController to create a book before adding it
            //--> to the Book database.
        }
    }
}

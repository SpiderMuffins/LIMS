package Entities; 
 
import java.util.Date;

public class Book 
{
    private String title;
    private String author;
    private Integer ISBNumber;
    private int CopyNumber;
    private Date PublishedDate;
    private boolean bookStatus; //true = available, false = borrowed
    
    public enum BookType {
        PHYSICAL_BOOK, E_BOOK, AUDIO_BOOK
    }
    public Book (String t, String a, Integer ISBN, int copy, Date publish)
    {
        title = t;
        author = a;
        ISBNumber = ISBN;
        CopyNumber = copy;
        PublishedDate = publish;
        bookStatus = true;
    }
    
    public String getTitle(){
        return title; 
    }
    public String getAuthor(){
        return author; 
    }
    public Integer getISBN(){
        return ISBNumber; 
    }
    public int getCopyNumber(){
        return CopyNumber;
    }
    public Date getPublishDate(){
        return PublishedDate;
    }
    public boolean getBookStatus(){
        return bookStatus;
    }
    public boolean toggleBookStatus(){
        if (bookStatus==true){
            bookStatus = false;
        }
        else if(bookStatus==false){
            bookStatus = true;
        }
        
        return bookStatus;
    }
}
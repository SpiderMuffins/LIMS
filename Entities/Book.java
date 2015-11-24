/**So many chicken nuggets
 * very chicken
 * much nuggets
 */
package Entities; 
 
import java.util.Date;

public class Book 
{
    private String title;
    private String author;
    private Integer ISBNumber;
    private int CopyNumber;
    private Date PublishedDate;
    
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
}
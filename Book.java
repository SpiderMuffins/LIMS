import java.util.Date;

public class Book 
{
    private String title;
    private String author;
    private Integer ISBNumber;
    private Integer CopyNumber;
    private Date PublishiedDate;
    
    public enum BookType {
        PHYSICAL_BOOK, E_BOOK, AUDIO_BOOK
    }
    
    
    
}
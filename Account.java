import java.util.Date;

public abstract class Account 
{
    String Password;
    Integer Identificaton;
    Date CurrentTime;
    
    abstract void logIn(Integer pwd, Integer usr);
    abstract void viewAccount();
}
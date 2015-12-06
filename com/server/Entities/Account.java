package Entities;

import java.util.Date;

public abstract class Account 
{
    int Password;
    int Identificaton;
    Date CurrentTime;
    
    //abstract void logIn(int pwd, int usr);
    abstract void viewAccount();
}
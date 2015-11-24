/**
 * Library Information Management System
 * Programmers: Marwa Farag, Stacey Henderson, Jay Whaley, Kaitlyn Childers, Amanda Bailey
 * Date:        19 November 2015
 * Class:       COMP3700
 * To Build:    javac Entities/*.java
 *              javac Mainframe.java
 * To Run:      java Mainframe
 */
import Entities.*;
 
public class Mainframe
{
    
    public static void main(String[] args) 
    {
        Mainframe mf = new Mainframe();
        mf.run();
    }
    
    
    public void run() 
    {
        Routine r = new Routine();
        
        Customer c1 = new Customer("Jane Doe");
        Librarian l1 = new Librarian();
        
        r.message("The first  test.");
        c1.viewAccount();
        r.message(c1.getName());
        r.message("The second test.");
        l1.viewAccount();
    }
    
    private class Routine 
    {
        public Routine() 
        {
            //TODO: Useful Constructor
        }
        
        public void message(String str) 
        {
            System.out.println(str);
        }
    }
}
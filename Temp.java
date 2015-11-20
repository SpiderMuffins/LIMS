/**
 * Library Information Management System
 * Programmers: Marwa Farag, Stacey Henderson, Jay Whaley, Kaitlyn Childers, Amanda Bailey
 * Date:        19 November 2015
 * Class:       COMP3700
 * To Build:    javac Temp.java
 * To Run:      java Temp
 */
public class Temp 
{
    
    public static void main(String[] args) 
    {
        Temp t = new Temp();
        t.run();
    }
    
    
    public void run() 
    {
        Routine r = new Routine();
        
        Customer c1 = new Customer();
        Librarian l1 = new Librarian();
        
        r.message("The first  test.");
        c1.viewAccount();
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
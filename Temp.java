/**
 * Library Information Management System
 * 
 */
public class Temp {
    
    public static void main(String[] args) {
        Temp t = new Temp();
        t.run();
    }
    
    
    public void run() {
        Routine r1 = new Routine();
        Routine r2 = new Routine();
        
        r1.message("Another test");
        r2.message("The second test");
    }
    
    private class Routine {
        public Routine() {
            //TODO: Useful Constructor
        }
        
        public void message(String str) {
            System.out.println(str);
        }
    }
}
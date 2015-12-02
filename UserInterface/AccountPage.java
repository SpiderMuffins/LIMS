package UserInterface;

import java.util.Random;

public class AccountPage extends Page {

    public int createNewID(long seed) {
        //TODO: Creates a new ID for the new Customer
                //Uses the AccountBoundary and ptr AccountDB
        Random generator = new Random(seed);
        return generator.nextInt();
    }
    
}
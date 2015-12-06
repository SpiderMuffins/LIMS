package UserInterface;

//import java.awt.*;
//import java.awt.event.*;
//import javax.swing.*;
//import javax.swing.text.*;
import java.util.Scanner;

public class HomePage extends Page //implements ActionListener, FocusListener
{
    public HomePage() {
        // constructor empty
    }
    
    public String[] askForLogIn() {
        Scanner userIn = new Scanner(System.in);
        
        System.out.print("Please enter your username: ");
        String username = userIn.nextLine();
        System.out.print("\nPlease enter your pin: ");
        int PIN = userIn.nextInt();
        
        String[] sarray = new String[2];
        sarray[0] = username;
        sarray[1] = PIN + "";
        
        return sarray;
    }
}
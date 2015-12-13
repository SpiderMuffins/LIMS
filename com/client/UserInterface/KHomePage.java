package UserInterface;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.text.*;
import java.util.Scanner;

public class KHomePage //implements ActionListener, FocusListener
{
    JFrame frame = new JFrame("Library Home Page");
    public KHomePage() {
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        JButton logIn = new JButton("Login to Account");
        JButton goToSearch = new JButton("Search");
        
        logIn.setVerticalTextPosition(AbstractButton.CENTER);
        logIn.setHorizontalTextPosition(AbstractButton.CENTER); 
        
        goToSearch.setVerticalTextPosition(AbstractButton.CENTER);
        goToSearch.setHorizontalTextPosition(AbstractButton.CENTER); 
        
        frame.setLayout(null);
        logIn.setLayout(null);
        goToSearch.setLayout(null);
        
        frame.add(logIn);
        frame.add(goToSearch);
        
        logIn.setSize(130, 40);
        logIn.setLocation(0,0);
        goToSearch.setSize(90, 40);
        goToSearch.setLocation(140, 0);
        frame.setSize(500, 500);

        ImageIcon icon = new ImageIcon("BlueLibrary.png");
        JLabel label1 = new JLabel("Welcome to our Online Library System", icon, JLabel.CENTER);

        label1.setSize(300, 300);
        label1.setVerticalTextPosition(JLabel.BOTTOM);
        label1.setHorizontalTextPosition(JLabel.CENTER);

        label1.setLocation(100, 100); 

        frame.add(label1);

        frame.setBackground(Color.WHITE);
        frame.setVisible(true);

        logIn.addActionListener(new java.awt.event.ActionListener() {
            @Override
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                String name = JOptionPane.showInputDialog(frame,
                        "Enter Acct Number: ", null);
                String password = JOptionPane.showInputDialog(frame,
                        "Enter Password: ", null);

                //Verify Acct Info
            }
        });
        
    }

    public static void main (String[] args)
    {
        KHomePage h = new KHomePage();
    }

}
package edu.acc.java2.implementing;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Bar implements ActionListener {

    @Override
    public void actionPerformed(ActionEvent e) {
        System.out.println("Action!");
    }
    
}

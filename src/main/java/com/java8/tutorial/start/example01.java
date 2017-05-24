package com.java8.tutorial.start;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class example01 {


    public static void main(String[] args) {
        JFrame frame = new JFrame("Frame With Panel");
        Container container = frame.getContentPane();
        container.setBackground(Color.cyan);
        JPanel panel = new JPanel();

        JButton testButton = new JButton("Test Button");
        testButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                System.out.println("Click Detected by Anon Class");
            }
        });
        panel.add(testButton);
        container.add(panel, BorderLayout.SOUTH);
        frame.setSize(300, 200);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    }
}

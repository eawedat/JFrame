package com.eawedat;

import oracle.jrockit.jfr.JFR;

import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;

public class Main {

    public static void main(String[] args) {


        //So you can add component to JPanel, and add JPanel to JFrame.
        //or add component directly to JFrame

        JLabel label = new JLabel();
        label.setText("Hi");

        ImageIcon imageIcon = new ImageIcon("lion.png");
        label.setIcon(imageIcon);

        //useful when using BorderLayout, redPanel.setLayout(new BorderLayout());
        //label.setVerticalAlignment(JLabel.BOTTOM);
        //label.setHorizontalAlignment(JLabel.RIGHT);

        //if you redPanel.setLayout(null); then use label.setBounds(100,100,75,75);

        label.setBounds(0,0,75,75);

        JPanel redPanel = new JPanel();
        redPanel.setBackground(Color.red);
        redPanel.setBounds(0, 0, 250, 250);
        redPanel.setLayout(null);
        //redPanel.setLayout(new BorderLayout());

        JPanel bluePanel = new JPanel();
        bluePanel.setBackground(Color.blue);
        bluePanel.setBounds(250, 0, 250, 250);

        JPanel greenPanel = new JPanel();
        greenPanel.setBackground(Color.green);
        greenPanel.setBounds(0, 250, 500, 250);



        JFrame frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        //frame.setResizable(false);
        frame.setTitle("Hello");
        frame.setSize(500, 500);
        frame.setVisible(true);

        frame.setLayout(null);

        redPanel.add(label);

        frame.add(redPanel);
        frame.add(greenPanel);
        frame.add(bluePanel);


    }
}

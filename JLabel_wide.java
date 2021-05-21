package com.eawedat;

import oracle.jrockit.jfr.JFR;

import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;

public class Main {

    public static void main(String[] args) {

        JFrame frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        //frame.setResizable(false);
        frame.setTitle("Hello");
        frame.setSize(500, 500);
        frame.setVisible(true);

        ImageIcon imageIcon = new ImageIcon("lion.png");
        frame.setIconImage(imageIcon.getImage());


        JLabel label = new JLabel();
        label.setText("Muhamad eawedat");
        label.setIcon(imageIcon);
        label.setHorizontalTextPosition(JLabel.CENTER); //text in middle of image
        label.setVerticalTextPosition(JLabel.TOP);
        label.setForeground(Color.green);
        label.setFont(new Font("MV Boli", Font.PLAIN, 20));
        label.setIconTextGap(100);
        //label.setIconTextGap(-25);


        Border border = BorderFactory.createLineBorder(Color.green, 3);

        label.setBackground(Color.BLACK);
        label.setOpaque(true); //display background color
        label.setBorder(border);
        label.setVerticalAlignment(JLabel.CENTER);
        label.setHorizontalAlignment(JLabel.CENTER);

        label.setBounds(0,0,250,250);
        frame.setLayout(null);
        
        frame.add(label);
        //frame.getContentPane().setBackground(Color.GREEN);
        //frame.getContentPane().setBackground(new Color(0,255,0));
        //frame.getContentPane().setBackground(new Color(0x00FF00));

        //MyFrame myFrame = new MyFrame();
        //new MyFrame();
    }
}

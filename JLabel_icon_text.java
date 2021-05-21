package com.eawedat;

import oracle.jrockit.jfr.JFR;

import javax.swing.*;
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

        frame.add(label);
        //frame.getContentPane().setBackground(Color.GREEN);
        //frame.getContentPane().setBackground(new Color(0,255,0));
        //frame.getContentPane().setBackground(new Color(0xFFFFFF));

        //MyFrame myFrame = new MyFrame();
        //new MyFrame();
    }
}
